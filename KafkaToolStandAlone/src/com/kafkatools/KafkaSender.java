package com.kafkatools;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.header.Header;
import org.apache.kafka.common.header.internals.RecordHeader;


public class KafkaSender {

	Properties props;

	/**
	 * This method is only to be used for testing/generation
	 * @param ipAddress The ip address being use to connect to kafka
	 */
	public KafkaSender(String ipAddress) {
		props = new Properties();
		props.put("bootstrap.servers", ipAddress);
		props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
	}
	/**
	 * Sends a JSON message to a specified topic in Kafka.
	 *
	 * @param topic  The topic to send the message to.
	 * @param key    The key to be associated with the message.
	 * @param payload   The JSON message to be sent.
	 * @throws Exception If there is an error sending the message.
	 */
	public void sendJson(String topic, String key, String payload, String header) throws Exception{
		KafkaProducer<String, String> producer = new KafkaProducer<>(props);
		// Create a new ProducerRecord with the topic name, message key, and message value (the JSON message)
		ProducerRecord<String, String> record = null;
		if(header != null) {
			List<Header> headers = new ArrayList<>();
			String[] headersStrings = header.split(",");
			for(String s : headersStrings) {
				String[] headerData = s.split("=");
				headers.add(new RecordHeader(headerData[0], headerData[1].getBytes()));
			}
			System.out.println();
			record = new ProducerRecord<>(topic, null, key, payload, headers);
		}else {
			record = new ProducerRecord<>(topic, payload);
		}
		// Send the record to the Kafka broker
		producer.send(record);
		// Close the producer to free up resources
		producer.close();
	}

}

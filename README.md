# Kafka Tools - Post JSON to Kafka
### Tool to easily post a json file to Kafka using a select file tool
![GitHub release (latest by date)](https://img.shields.io/github/v/tag/bernabesc/KafkaTools)
![GitHub Release Date](https://img.shields.io/github/release-date/bernabesc/KafkaTools?logo=github)
![GitHub last commit](https://img.shields.io/github/last-commit/bernabesc/KafkaTools?logo=github)
![GitHub Repo stars](https://img.shields.io/github/stars/bernabesc/KafkaTools?=social)
![GitHub forks](https://img.shields.io/github/forks/bernabesc/KafkaTools?style=social)

A small kafka tool written in `Java` to easly post json files to kafka.

This is extra useful if you dont have a docker or dont have access to where your kafka service is running, you can specify the ip and post your json.

# How to use it:
* At the ip of your docker ( if you are running it locally it prob is localhost:9093)
* At the topic (where you want the json to be posted at)
* You can also add a header (optional)
* Choose the json file
* Click Send JSON and voila!


** I do plan to add a consume message later (not sure if saving the consumed message into json is useful)

# Features 
## v1.0

* Post Json to kafka
* Include header (format key=value)
* Add topics

# Requirements  
* [`Java 1.8.0 or newer`](https://www.java.com/download) : Java 1.8.0 or newer

# Screenshots
![Screenshot Page 1](docs/Screenshot-1.png)


# This tool is tested on
-  ✅ Windows 10 & 11


# Developer
**Bernabe Soto** - [@bernabesc](https://github.com/bernabesc/)

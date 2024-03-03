This is a basic spring boot microservice project for kafka demonstration. 
This project consists of an API which consumes an input string in request param and sends it to kafka message broker using producer service with a topic.
Then the consumer service which is the kafka listener calls the topic to get the result. The result is logged in the console.

Use the below commands to start zookeeper and kafka:
1. In cmd cd to D:\kafka_2.12-3.7.0\bin\windows
2. Type zookeeper-server-start.bat ..\..\config\zookeeper.properties to run the zookeeper.
3. Type kafka-server-start.bat ..\..\config\server.properties to run the kafka server.
4. Start the spring boot application, it automatically connects to the kafka broker.

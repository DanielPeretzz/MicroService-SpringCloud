![poalim assignment](https://user-images.githubusercontent.com/93336006/212543924-a4be23fd-5014-438d-952f-0ce9b7d385d2.jpg)

![Apache_kafka_wordtype svg](https://user-images.githubusercontent.com/93336006/212548357-44a4cb1a-3a48-49d7-8944-352a65cb13b4.png)

Kafka server :
# Start the ZooKeeper service
.\bin\windows\zookeeper-server-start.bat config\zookeeper.properties

# Start the Kafka broker service

.\bin\windows\kafka-server-start.bat .\config\server.properties

READ THE EVENTS (topic name = kafkatopic):

bin/kafka-console-consumer.bat --topic kafkatopic --from-beginning --bootstrap-server localhost:9092


API = http://localhost:8080/api/v1/message (POST)

JSON Example:
{  
    "message": "Hello from Kafka!!!"
}



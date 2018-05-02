# Generator

This app reads from the `game-seed` topic and writes to the `generated-value` topic

## Getting Started


### Prerequisites

What things you need to install the software and how to install them

```
1. You would need an instance of kafka(1.1.0 and higher) running.
   Update bootstrap.servers in application.yml to point towards your kafka instance.
2. You would need java8 installed
```

### Installing

```
1. ./gradlew bootRun would start your app.

2. You can also run the app through java -jar /build/libs/generator-0.0.1-SNAPSHOT.jar
```

The app will wait indefinitely for values from game-seed.
## Built With

* [Spring Docs](https://docs.spring.io/spring-kafka/docs/2.1.5.RELEASE/reference/html/)
* [Kafka Docs](https://docs.confluent.io/current/streams/index.html)

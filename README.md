# SpringCloudStream
A Demo Application to Filter the Random Number which are greater than 100 using spring cloud Streams.

* A Kafka Producer was created where it produce random number less than 1000. The generated numbers will be sent to a Topic called "number-topic".
* The processor will filter the numbers which are greater than 100 and send to the topic called "Greater-hundred-topic".
* The consumer will consume the numbers from the "Greater-hundred-topic" topic.


In order to start the application first run the docker-compose file.
>docker-compose up

Then start the spring boot project using the ide or using the below command.
>mvn spring-boot:run

In the logs we will be able to see the below logs.
>2022-06-11 19:33:04.652  INFO 20894 --- [ntainer#0-0-C-1] c.d.k.c.GrtThanHundredNumberConsumer     : Received Number 599
>2022-06-11 19:33:04.653  INFO 20894 --- [ntainer#0-0-C-1] c.d.k.c.GrtThanHundredNumberConsumer     : Received Number 894
>2022-06-11 19:33:07.186  INFO 20894 --- [   scheduling-1] c.d.k.publisher.NumberPublisher          : Produced number: 2
>2022-06-11 19:33:09.186  INFO 20894 --- [   scheduling-1] c.d.k.publisher.NumberPublisher          : Produced number: 980
>2022-06-11 19:33:09.299  INFO 20894 --- [ntainer#0-0-C-1] c.d.k.c.GrtThanHundredNumberConsumer     : Received Number 980



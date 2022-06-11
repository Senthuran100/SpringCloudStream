package com.demo.kafkastream.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import static com.demo.kafkastream.stream.KafkaStream.OUTPUT_TOPIC_NAME;

@Component
@EnableKafka
@Slf4j
public class GrtThanHundredNumberConsumer {

    @KafkaListener(topics = OUTPUT_TOPIC_NAME)
    public void receive(String value) {
        log.info("Received Number " + value);
    }
}

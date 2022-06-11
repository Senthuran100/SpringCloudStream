package com.demo.kafkastream.publisher;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import static com.demo.kafkastream.stream.KafkaStream.INPUT_TOPIC_NAME;

@Slf4j
@Component
@AllArgsConstructor
public class NumberPublisher {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public void produce(Integer randomNumber) {
        String s = "No";
        if (randomNumber > 100)
            s = "Yes";
        log.info("Produced number: " + randomNumber);
        kafkaTemplate.send(INPUT_TOPIC_NAME, s, String.valueOf(randomNumber));

    }

}

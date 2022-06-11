package com.demo.kafkastream.stream;

import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafkaStreams;

@Configuration
@EnableKafkaStreams
public class KafkaStream {
    public static final String OUTPUT_TOPIC_NAME = "Greater-hundred-topic";
    public static final String INPUT_TOPIC_NAME = "number-topic";

    @Bean
    public KStream<String, String> processorStream(StreamsBuilder kstreamBuilder) {
        KStream<String, String> input = kstreamBuilder.stream(INPUT_TOPIC_NAME);

        KStream<String, String> output = input.filter((k, v) -> k.equals("Yes"));

        output.to(OUTPUT_TOPIC_NAME);

        return output;
    }

}

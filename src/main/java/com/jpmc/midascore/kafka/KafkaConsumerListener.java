package com.jpmc.midascore.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerListener {

    @KafkaListener(topics = "price-topic", groupId = "price-consumer-group")
    public void consume(String message) {
        System.out.println("Received message: " + message);
    }
}

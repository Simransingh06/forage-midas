package com.jpmc.midascore.controller;

import com.jpmc.midascore.kafka.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/kafka")
public class KafkaTestController {

    @Autowired
    private KafkaProducerService producerService;

    @GetMapping("/send")
    public ResponseEntity<String> sendMessage(@RequestParam String msg) {
        producerService.sendMessage(msg);
        return ResponseEntity.ok("Message sent to Kafka: " + msg);
    }
}

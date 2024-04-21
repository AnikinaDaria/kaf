package com.kaf.kafkademo.kafka;

import lombok.AllArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class kafkaConsumer {
    @KafkaListener(topics = "kaf", groupId = "my_consumer")
    public void listen(String message) {git status
            
        System.out.println("MESSAGE = " + message);
    }
}

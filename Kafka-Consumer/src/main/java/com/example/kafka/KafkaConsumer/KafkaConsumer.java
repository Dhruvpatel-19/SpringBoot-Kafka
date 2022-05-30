package com.example.kafka.KafkaConsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "TestTopic" , groupId = "group_id")
    public void consume(String message){
        System.out.println("message : "+message);
    }
}

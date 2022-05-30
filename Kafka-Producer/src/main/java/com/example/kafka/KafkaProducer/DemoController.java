package com.example.kafka.KafkaProducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    KafkaTemplate<String,Book> kafkaTemplate;

    private static final String TOPIC = "TestTopic";

    @PostMapping("/publish/")
    public String publishMessage(@RequestBody Book book){
        kafkaTemplate.send(TOPIC , book);
        return "Published successfully";
    }
}

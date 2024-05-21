package com.delivery.boy.service;

import com.delivery.boy.config.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import static com.delivery.boy.config.Configuration.topicName;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;
    public boolean updateLocation(String location){
        System.out.println("sending kafka messages");

        kafkaTemplate.send(topicName,location);
        return true;
    }
}

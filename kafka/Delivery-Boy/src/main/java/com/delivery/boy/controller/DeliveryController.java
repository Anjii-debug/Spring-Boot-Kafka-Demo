package com.delivery.boy.controller;

import com.delivery.boy.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class DeliveryController {

    @Autowired
    private KafkaService kafkaService;

    @GetMapping("/kafka")
    public String checkLocation(){
        return "welcome to kafka world";
    }

    @PostMapping("/update")
    public ResponseEntity<?> updateLocation(){
        System.out.println("Inside Update location Controller");
        this.kafkaService.updateLocation("(" +Math.round( Math.random()*100)+ ", " + Math.random()*100+ ")");
        return new ResponseEntity<>(Map.of("Message","location Updated "), HttpStatus.OK);
    }

}

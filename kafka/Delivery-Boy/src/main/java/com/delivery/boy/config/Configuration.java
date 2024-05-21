package com.delivery.boy.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

@org.springframework.context.annotation.Configuration
public class Configuration {

     public static final String topicName="location-update-topic";

    @Bean
    public NewTopic topic(){
        return TopicBuilder.name(topicName).build();
    }
}

package com.sparters.config;

import com.sparters.model.User;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableBinding(Processor.class)
public class UserProcesser {

    @StreamListener(Processor.INPUT)
    @SendTo(Processor.OUTPUT)
    public User processUsageCost(String userString) {
        String[] split = userString.split(",");
        User user = new User(split[0],split[1],Integer.parseInt(split[2]));
        return user;
    }
}

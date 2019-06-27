package com.sparters.config;

import com.sparters.model.User;
import lombok.extern.java.Log;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
@Log
public class UserSink {

    @StreamListener(Sink.INPUT)
    public void process(User user){
        log.info(user.toString());
    }
}

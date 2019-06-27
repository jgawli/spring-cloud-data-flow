package com.sparters.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableBinding(Source.class)
@EnableScheduling
public class UserSource {

    @Autowired
	private Source source;

	@Scheduled(fixedDelay = 1000)
	public void sendEvents() {
		String newString = "first,second,10";
		this.source.output().send(MessageBuilder.withPayload(newString).build());
	}
}

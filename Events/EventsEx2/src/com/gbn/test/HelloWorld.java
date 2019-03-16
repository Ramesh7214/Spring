package com.gbn.test;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import com.gbn.event.MyEvent;

public class HelloWorld implements ApplicationEventPublisherAware{
	
	private  String name;
	private ApplicationEventPublisher publisher;
	
	public  void display() {
		MyEvent event = new MyEvent(this);
		publisher.publishEvent(event);
		
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
		
	}

}

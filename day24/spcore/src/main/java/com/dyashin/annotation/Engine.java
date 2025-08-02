package com.dyashin.annotation;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	
	public void stop() {
		 System.out.println("Stop");
	 }
}

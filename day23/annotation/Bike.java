package com.dyashin.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bike  {
	@Autowired
	Engine engine;
	
//for xml use this not for annotation	
// public void setEngine(Engine engine) {
//		this.engine = engine;
//	}

public void start() {
	 System.out.println("Started");
	 engine.stop();
 }
}

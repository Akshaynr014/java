package com.dyashin.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.dyashin.configure")
public class Config {
    @Bean
	public StudentInfo studentInfo() {
		return new StudentInfo();
	}
}

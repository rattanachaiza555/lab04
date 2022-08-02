package com.example.demo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Configuration
@ImportResource("classpath:Beans.xml")
public class XmlConfiguration {
	
	
	@Bean(name="computer")
	public Computer computer () {
		return new Computer();
	}
}

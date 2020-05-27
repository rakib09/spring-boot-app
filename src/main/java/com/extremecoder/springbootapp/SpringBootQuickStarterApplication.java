package com.extremecoder.springbootapp;

import com.extremecoder.Greeter;
import com.extremecoder.GreeterConfigParams;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootQuickStarterApplication {

	public static void main(String[] args) {
		CustomProperties customProperties = new CustomProperties();
		customProperties.put("user.name", "Rakib");
		customProperties.put("morning.message", "Good Morning");
		customProperties.put("afternoon.message", "Good afternoon");
		customProperties.put("evening.message", "Good evening");
		customProperties.put("night.message", "Good night");
		GreeterConfigParams greeterConfigParams = new GreeterConfigParams();
		Greeter greeter = new Greeter(customProperties);
		System.out.printf(greeter.greet());
		SpringApplication.run(SpringBootQuickStarterApplication.class, args);
	}

}

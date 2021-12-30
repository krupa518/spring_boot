package com.example.core.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class MyCommandLineRunner1 implements CommandLineRunner {

	
	@Override
	public void run(String... args) throws Exception {
             System.out.println("this is second commandline argument.");
	}

}

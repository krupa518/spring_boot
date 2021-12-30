package com.example.demo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.been.HelloWorld;

@Component
public class MyCommandLineRunner implements CommandLineRunner {
	
	@Autowired
     HelloWorld helloworld;

	@Override
	public void run(String... args) throws Exception {
		
			String message = helloworld.hi();
			System.out.print("hi, " +message);

	}

}

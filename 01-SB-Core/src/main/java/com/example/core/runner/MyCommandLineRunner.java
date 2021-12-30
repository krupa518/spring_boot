package com.example.core.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.example.core.bean.Hello;

@Order(2)
@Component
public class MyCommandLineRunner implements CommandLineRunner {
	@Autowired
	Hello hello;
	
  
	@Override
	public void run(String... args) throws Exception {
           String msg = hello.hellow();
           System.out.println(msg+" spring boot first core. ");
	}

}

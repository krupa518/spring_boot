package com.example.demo.been;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
	public  String hi() {
		System.out.println("this is my spring boot first program");
		return "this is first project";
	}

}

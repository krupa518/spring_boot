package com.example.jdbc.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.jdbc.dao.IEmpDao;
import com.example.jdbc.models.Employee;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

	@Autowired
	IEmpDao dao;
	@Override
	public void run(String... args) throws Exception {
		List<Employee> lstEmp = dao.fetchEmployees();
		lstEmp.forEach(System.out::println);

	}

}

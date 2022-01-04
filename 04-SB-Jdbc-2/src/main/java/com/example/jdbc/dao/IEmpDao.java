package com.example.jdbc.dao;

import java.util.List;

import com.example.jdbc.models.Employee;

public interface IEmpDao {
	List<Employee> fetchEmployees();

}

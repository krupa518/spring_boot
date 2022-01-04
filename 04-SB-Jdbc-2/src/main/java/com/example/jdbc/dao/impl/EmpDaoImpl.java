package com.example.jdbc.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.jdbc.dao.IEmpDao;
import com.example.jdbc.mappers.EmployeeRowMapper;
import com.example.jdbc.models.Employee;

@Repository
public class EmpDaoImpl implements IEmpDao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Employee> fetchEmployees() {
		return jdbcTemplate.query("SELECT * FROM EMP", new EmployeeRowMapper());
	}

}

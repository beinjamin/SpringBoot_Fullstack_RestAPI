package com.beinjamin.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beinjamin.springboot.entity.Employee;
import com.beinjamin.springboot.repository.EmployeeRepository;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	private EmployeeRepository employeeRepository;
	@GetMapping("/employees")
	public List<Employee> fetchEmployee(){
		return employeeRepository.findAll();
		
	}

}

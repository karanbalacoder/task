package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Employee;
import com.example.entity.EmployeeResponse;
import com.example.service.MyService;

@RestController
public class MyController {
	@Autowired
	private  MyService myService;
	
	@PostMapping("/saveEmployee")
	public EmployeeResponse saveEmployee(@RequestBody Employee employee) {
		
		EmployeeResponse response = myService.saveEmployee(employee);
		return response;
		
	}
	@GetMapping("/getAllEmployees")
	public EmployeeResponse getAllEmployees() {
		EmployeeResponse employeeResponse = myService.getAllEmployees();
		return employeeResponse;
	}
}

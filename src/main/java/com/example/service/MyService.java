package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.entity.EmployeeResponse;
import com.example.repo.EmployeeRepo;

@Service
public class MyService {
	@Autowired
	private EmployeeRepo employeeRepo;

	public EmployeeResponse saveEmployee(Employee employee) {

		Employee save = employeeRepo.save(employee);
		EmployeeResponse response = new EmployeeResponse();

		if(save.getEmpId()>0) {
			response.setStatus(200);
			response.setMessage("employee saved");
		}else {
			response.setStatus(201);
			response.setMessage("employee not saved");
	}
		return response;
	}
	public EmployeeResponse getAllEmployees() {
		List<Employee> list = employeeRepo.findAll();
		EmployeeResponse response = new EmployeeResponse();
		if(list.size()>0) {
			response.setEmpList(list);
			response.setStatus(200);
			response.setMessage("employees retrieved");
		}else {
			response.setStatus(201);
			response.setMessage("employees retrieving failed");
		}
		return response;
	}
}

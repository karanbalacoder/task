package com.example.entity;

import java.util.ArrayList;
import java.util.List;

public class EmployeeResponse {
private int status;
private String message;
private List<Employee> empList;
public int getStatus() {
	return status;
}
public void  setStatus(int  status) {
	this.status = status;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public List<Employee> getEmpList() {
	return empList;
}
public void setEmpList(List<Employee> list) {
	this.empList = list;
}

}

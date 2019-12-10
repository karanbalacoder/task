package com.example.repo;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}

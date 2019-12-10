package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.example.entity.Employee;
import com.example.repo.EmployeeRepo;

@SpringBootApplication
@ComponentScan(basePackages="com")
@EntityScan(basePackages="com")
@EnableJpaRepositories(basePackages="com")
public class TaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskApplication.class, args);

		System.out.println("working");
	}

}

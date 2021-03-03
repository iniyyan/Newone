package com.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;

@SpringBootApplication
@ComponentScan(basePackages="com.demo.service")
@EnableJpaRepositories(basePackages="com.demo.repository")
public class EmployeeManagementSystemApplication implements CommandLineRunner{
    @Autowired
	private EmployeeService empservice;
	public static void main(String[] args){
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
	}
@Override
public void run(String...args)throws Exception{
	storeAllEmployee();
	List<Employee> emp = empservice.findAll();
	List<Employee> emp1 = empservice.findByFirstName("Ram");
	for( Employee e: emp1) {
		System.out.println(e.getFirstName()+""+e.getEmail());
	}
}
public void storeAllEmployee() {
	Employee e1= new Employee("Ram","kumar",new Date(),"ram@gmail.com");
	Employee e2= new Employee("Raj","kumar",new Date(),"raj@gmail.com");
	Employee e3= new Employee("Ragu","kumar",new Date(),"ragu@gmail.com");
	List<Employee> elist =new ArrayList<Employee>();
	elist.add(e1);
	elist.add(e2);
	elist.add(e3);
	List<Employee> employee = empservice.createStudentDetails(elist);
}
}

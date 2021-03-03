package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Employee;
import com.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
 @Autowired
	private EmployeeRepository emprepo;
 public List<Employee> createStudentDetails(List<Employee> e) {
	 return emprepo.saveAll(e);
 }
public List<Employee> findAll() {
	// TODO Auto-generated method stub
	return emprepo.findAll();
}
public List<Employee> findByFirstName(String string) {
	// TODO Auto-generated method stub
	return emprepo.findByFirstName(string);
}
}

package com.demo.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Employee;
@org.springframework.stereotype.Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

	 public List<Employee> findByFirstName(String string);

}

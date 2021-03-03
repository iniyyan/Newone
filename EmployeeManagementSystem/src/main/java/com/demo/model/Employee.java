package com.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Employee {
	@Id
	@GeneratedValue
private Integer employeeId;
private String firstName;
private String lastName;
private Date createdOn;
public Employee() {
	super();
}
public Employee(String firstName, String lastName, Date createdOn, String email) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.createdOn = createdOn;
	this.email = email;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public Date getCreatedOn() {
	return createdOn;
}
public void setCreatedOn(Date createdOn) {
	this.createdOn = createdOn;
}

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

private String email;
}

package com.vivek.sudentDB;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
@GenericGenerator(name="generator", strategy="native")
public class StudentPojo {
	private String name;
	@Id
	@GeneratedValue(generator="generator")
	private int roll;
	private int marks;
	@Embedded
	private Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "StudentPojo [name=" + name + ", roll=" + roll + ", marks=" + marks + ", address=" + address + "]";
	}
	
	
	

}

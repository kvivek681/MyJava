package com.vivek.studentDB;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String house;
	private String city;
	private String State;
	private int zip;
	public String getHouse() {
		return house;
	}
	public void setHouse(String house) {
		this.house = house;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Address [house=" + house + ", city=" + city + ", State=" + State + ", zip=" + zip + "]";
	}
	
	
}

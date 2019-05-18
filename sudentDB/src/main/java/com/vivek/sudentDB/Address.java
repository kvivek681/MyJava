package com.vivek.sudentDB;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String buildingNo;
	private String address1;
	private String address2;
	private int pincode;
	public String getBuildingNo() {
		return buildingNo;
	}
	public void setBuildingNo(String buildingNo) {
		this.buildingNo = buildingNo;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [buildingNo=" + buildingNo + ", address1=" + address1 + ", address2=" + address2 + ", pincode="
				+ pincode + "]";
	}
	
	
}

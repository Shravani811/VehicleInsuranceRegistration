package com.vehicleinsurance.beans;

import java.util.Date;

public class VehicleDetails {
	
	private String vehicleNo;
	private int insurancePeriod,vehicleType;
	private String aadharNo,mobileNo;
	private String dateOfRegistration;

	public VehicleDetails( int vehicleType,int insurancePeriod, String aadharNo,String mobileNo,String dateOfRegistration) {
		this.mobileNo = mobileNo;
		this.insurancePeriod = insurancePeriod;
		this.aadharNo = aadharNo;
	    this.vehicleType = vehicleType;
	    this.dateOfRegistration = dateOfRegistration;
	}
	
	
	//default constructor
	public VehicleDetails() {
		
	}
	// getters and setters
	

	
	public String getDateOfRegistration() {
		return dateOfRegistration;
	}
	public void setDateOfRegistration(String dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}
	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public int getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(int i) {
		this.vehicleType = i;
	}
	
	public int getInsurancePeriod() {
		return insurancePeriod;
	}
	public void setInsurancePeriod(int insurancePeriod) {
		this.insurancePeriod = insurancePeriod;
	}
	
	
}

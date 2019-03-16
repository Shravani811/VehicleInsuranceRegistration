package com.vehicleinsurance.service;

import com.vehicleinsurance.beans.VehicleDetails;
import com.vehicleinsurance.dao.VehicleInsuranceDAO;
import com.vehicleinsurance.dao.VehicleInsuranceDAOImpl;
import com.vehicleinsurance.exceptions.InvalidAadharException;
import com.vehicleinsurance.exceptions.InvalidMobileNoException;
import com.vehicleinsurance.exceptions.InvalidVehicleTypeException;

public class VehicleInsuranceServiceImpl implements VehicleInsuranceService{
	
	VehicleInsuranceDAO vehicleDao = new VehicleInsuranceDAOImpl();
	public VehicleDetails vehicleInsuranceRegistration(VehicleDetails vehicleDetails) {
		//validating aadhar number and mobile number
		 if(vehicleDetails.getAadharNo().length() != 12) {
			 try {
				throw new InvalidAadharException();
			} catch (InvalidAadharException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 vehicleDetails = null;
		 }
		 if(vehicleDetails.getMobileNo().length() != 10) {
			 try {
				throw new InvalidMobileNoException();
			} catch (InvalidMobileNoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
			 vehicleDetails = null;
		 }
		 if(vehicleDetails.getVehicleType() != 1 ||  vehicleDetails.getVehicleType() != 2 || vehicleDetails.getVehicleType()!= 3) {
			 
			 try {
					throw new InvalidVehicleTypeException();
				} catch (InvalidVehicleTypeException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 vehicleDetails = null;
			 }
		
		return vehicleDao.vehicleInsuranceRegistration(vehicleDetails);
		
	}

	public VehicleDetails insuranceValidityCheck(String vehicleNo,int insurancePeriod,String dateOfRegistration) {
		
		return vehicleDao.insuranceValidityCheck(vehicleNo, insurancePeriod, dateOfRegistration);
	}

}

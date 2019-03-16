package com.vehicleinsurance.service;

import com.vehicleinsurance.beans.VehicleDetails;

//service layer
public interface VehicleInsuranceService {
	 VehicleDetails vehicleInsuranceRegistration(VehicleDetails vehicleDetails);
	  VehicleDetails insuranceValidityCheck(String vehicleNo,int insurancePeriod,String dateOfRegistration);
}

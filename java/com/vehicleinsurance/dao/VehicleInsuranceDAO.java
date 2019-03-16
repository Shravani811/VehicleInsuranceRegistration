package com.vehicleinsurance.dao;

import com.vehicleinsurance.beans.VehicleDetails;
// interface for insurance methods
public interface VehicleInsuranceDAO {

	  VehicleDetails vehicleInsuranceRegistration(VehicleDetails vehicleDetails);
	  VehicleDetails insuranceValidityCheck(String vehicleNo,int insurancePeriod,String dateOfRegistration);
}

package com.vehicleinsurance.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.vehicleinsurance.beans.VehicleDetails;




public class VehicleInsuranceDAOImpl implements VehicleInsuranceDAO{
	
	
public VehicleDetails vehicleInsuranceRegistration(VehicleDetails vehicleDetails) {
	
	//creating a map for registration
	//taking vehicle number as key and object as value
	Map<String,VehicleDetails> registerMap = new HashMap<String,VehicleDetails>();
		
	registerMap.put(vehicleDetails.getVehicleNo(), new VehicleDetails(vehicleDetails.getVehicleType(),vehicleDetails.getInsurancePeriod(),vehicleDetails.getAadharNo(),vehicleDetails.getMobileNo(),vehicleDetails.getDateOfRegistration()) );
	
		return vehicleDetails;
	}
	VehicleDetails vehicleDetails = new VehicleDetails();

	public VehicleDetails insuranceValidityCheck(String vehicleNo,int insurancePeriod,String dateOfRegistration) {
		String dateOfExpiry;
		
		try {
			Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(dateOfRegistration);
			//Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(dateOfExpiry);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		if(insurancePeriod == 1) {
		/*	Calendar c = Calendar.getInstance();
			try{
			   c.setTime(sdf.parse(oldDate));
			}catch(ParseException e){
			   e.printStackTrace();
			 }
			//Incrementing the date by 1 day
			c.add(Calendar.DAY_OF_MONTH, 1);  
			String newDate = sdf.format(c.getTime());  
			*/
		}
		
		return vehicleDetails;
		
		
	}

}

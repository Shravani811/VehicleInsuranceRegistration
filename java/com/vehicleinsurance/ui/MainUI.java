package com.vehicleinsurance.ui;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.vehicleinsurance.beans.VehicleDetails;
import com.vehicleinsurance.service.VehicleInsuranceServiceImpl;

public class MainUI {
	public void selection() {
		Scanner input = new Scanner(System.in);
		VehicleDetails vehicleDetails = new VehicleDetails();
		VehicleInsuranceServiceImpl vehicleService = new VehicleInsuranceServiceImpl();
		System.out.println("enter your choice:\n 1.Vehicle Insurance Registration \n 2.Insurance Validity Check \n 3.Exit");
		int choice = input.nextInt();
		
		switch(choice) {
		case 1:
			//vehicle insurance registration
			System.out.println("enter your vehicle number");
			vehicleDetails.setVehicleNo(input.next());
			System.out.println("enter your vehicle type 1-2Wheeler, 2-4wheeler, 3-8wheeler");
			vehicleDetails.setVehicleType(input.nextInt());
			System.out.println("enter your insurance period");
			vehicleDetails.setInsurancePeriod(input.nextInt());
			System.out.println("enter your aadhar number");
			vehicleDetails.setAadharNo(input.next());
			System.out.println("enter your mobile number");
			vehicleDetails.setMobileNo(input.next());
			System.out.println("date of registration");
			vehicleDetails.setDateOfRegistration(input.next());
			vehicleDetails = vehicleService.vehicleInsuranceRegistration(vehicleDetails);
			System.out.println("successfully registered. Your registration  vehicle number is:"+ vehicleDetails.getVehicleNo());
			break;
		case 2:
			//vehicle insurance validity check
			
			String vehicleNo =vehicleDetails.getVehicleNo();
			
			
			int insurancePeriod = vehicleDetails.getInsurancePeriod();
			
			//String dateOfRegistration = vehicleDetails.getDateOfRegistration();
			
			vehicleService.insuranceValidityCheck(vehicleDetails.getVehicleNo(),vehicleDetails.getInsurancePeriod(), vehicleDetails.getDateOfRegistration());
			System.out.println("your expiry date is");
			
			System.out.println("number of days to renewal are:");
			break;
		case 3:
			System.exit(0);
		}
		
	}

	public static void main(String[] args) {
		MainUI m = new MainUI();
		m.selection();

	}

}

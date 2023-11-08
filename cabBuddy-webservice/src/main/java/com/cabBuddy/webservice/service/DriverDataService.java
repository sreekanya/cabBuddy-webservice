package com.cabBuddy.webservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cabBuddy.webservice.entity.DriverData;
import com.cabBuddy.webservice.repository.DriverDataRepository;


@Service
public class DriverDataService {

	@Autowired
	DriverDataRepository driverDataRepository;
	
	//Get All DriverData
	public List<DriverData> getAllDriverData(){
		return driverDataRepository.findAll();
	}
	
	//Get one DriverData by driverId
	public DriverData getDriverData(int driverId) {
		return driverDataRepository.findById(driverId).get();
	}
	
	//Add DriverData
	public DriverData addDriverData(DriverData driverData) {
		return driverDataRepository.save(driverData);
	}
	
	//Update DriverData
	public DriverData updateDriverData(DriverData driverData) {
		if(driverDataRepository.existsById(driverData.getDriverId()))
			return driverDataRepository.save(driverData);
		else
			return null;
				
	}
	
	//Delete DriverData
	public void deleteDriverData(int driverId) {
		driverDataRepository.deleteById(driverId);
				
	}
}

package com.cabBuddy.webservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cabBuddy.webservice.entity.DriverData;
import com.cabBuddy.webservice.service.DriverDataService;

@RestController
public class DriverDataController {
	
	@Autowired
	DriverDataService driverDataService;
	
	@GetMapping("/driver-data")
	public List<DriverData> getAllDriverData(){
		return driverDataService.getAllDriverData();
	}
	
	@GetMapping("/driver-data/{driverId}")
	public DriverData getOneDriverData(@PathVariable int driverId){
		return driverDataService.getDriverData(driverId);
	}
	
	@PostMapping("/driver-data")
	public DriverData addDriver(@RequestBody DriverData driverData){
		return driverDataService.addDriverData(driverData);
	}
	
	@PutMapping("/driver-data")
	public DriverData updateDriver(@RequestBody DriverData driverData) {
		return driverDataService.updateDriverData(driverData);
	}
	
	@DeleteMapping("/driver-data/{driverId}")
	public String deleteDriver(@PathVariable int driverId){
		driverDataService.deleteDriverData(driverId);
		return "Driver Data is deleted sucessfully with driverId : "+driverId;
	}
}

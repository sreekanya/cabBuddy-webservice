package com.cabBuddy.webservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cabBuddy.webservice.entity.Cabs;
import com.cabBuddy.webservice.repository.CabsRepository;

@Service
public class CabsService {

	@Autowired
	CabsRepository cabsRepository;
	
	//Get All Cabs
	public List<Cabs> getCabs(){
		return cabsRepository.findAll();
	}
	
	//Get one Cab by CabId
	public Cabs getCab(int cabId) {
		return cabsRepository.findById(cabId).get();
	}
	
	//Add Cab
	public Cabs addCab(Cabs cab) {
		return cabsRepository.save(cab);
	}
	
	//Update Cab
	public Cabs updateCab(Cabs cab) {
		if(cabsRepository.existsById(cab.getCabId()))
			return cabsRepository.save(cab);
		else
			return null;
				
	}
	
	//Delete Cab
	public void deleteCab(int cabId) {
		cabsRepository.deleteById(cabId);
				
	}
}

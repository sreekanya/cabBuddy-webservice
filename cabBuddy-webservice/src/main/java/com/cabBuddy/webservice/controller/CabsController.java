package com.cabBuddy.webservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cabBuddy.webservice.dto.ResponseDto;
import com.cabBuddy.webservice.entity.Cabs;
import com.cabBuddy.webservice.service.CabsService;

@RestController
public class CabsController {
	
	@Autowired
	CabsService cabsService;
	
	@GetMapping("/cabs")
	public List<Cabs> getCabs(){
		return cabsService.getCabs();
	}
	
	@GetMapping("/cabs/{cabId}")
	public Cabs getCab(@PathVariable int cabId){
		return cabsService.getCab(cabId);
	}
	
	@PostMapping("/cabs")
	public Cabs addCab(@RequestBody Cabs cab){
		return cabsService.addCab(cab);
	}
	
	@PutMapping("/cabs")
	public Cabs updateCab(@RequestBody Cabs cab) {
		return cabsService.updateCab(cab);
	}
	
	@DeleteMapping("/cabs/{cabId}")
	public ResponseDto deleteCab(@PathVariable int cabId){
		cabsService.deleteCab(cabId);
		//return "Cab is deleted sucessfully with cabId : "+cabId;
		

		return new ResponseDto("Cab is deleted sucessfully with cabId : "+cabId);
	}
}

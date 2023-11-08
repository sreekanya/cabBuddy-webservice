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

import com.cabBuddy.webservice.entity.BookingsData;
import com.cabBuddy.webservice.service.BookingsDataService;


@RestController
public class BookingsDataController {
	
	@Autowired
	BookingsDataService bookingsDataService;
	
	@GetMapping("/bookings")
	public List<BookingsData> getAllDriverData(){
		return bookingsDataService.getAllBookingsData();
	}
	
	@GetMapping("/bookings/{bookingId}")
	public BookingsData getOneDriverData(@PathVariable int bookingId){
		return bookingsDataService.getBookingsData(bookingId);
	}
	
	@PostMapping("/bookings")
	public BookingsData addDriver(@RequestBody BookingsData bookingData){
		return bookingsDataService.addBookingsData(bookingData);
	}
	
	@PutMapping("/bookings")
	public BookingsData updateDriver(@RequestBody BookingsData bookingData) {
		return bookingsDataService.updateBookingsData(bookingData);
	}
	
	@DeleteMapping("/bookings/{bookingId}")
	public String deleteDriver(@PathVariable int bookingId){
		bookingsDataService.deleteBookingsData(bookingId);
		return "Bookings Data is deleted sucessfully with bookingId : "+bookingId;
	}
}

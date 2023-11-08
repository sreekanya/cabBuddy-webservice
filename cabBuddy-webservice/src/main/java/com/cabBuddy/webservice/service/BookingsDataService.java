package com.cabBuddy.webservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cabBuddy.webservice.entity.BookingsData;
import com.cabBuddy.webservice.repository.BookingsDataRepository;


@Service
public class BookingsDataService {

	@Autowired
	BookingsDataRepository bookingsDataRepository;
	
	//Get All BookingsData
	public List<BookingsData> getAllBookingsData(){
		return bookingsDataRepository.findAll();
	}
	
	//Get one BookingsData by driverId
	public BookingsData getBookingsData(int bookingId) {
		return bookingsDataRepository.findById(bookingId).get();
	}
	
	//Add BookingsData
	public BookingsData addBookingsData(BookingsData bookingData) {
		return bookingsDataRepository.save(bookingData);
	}
	
	//Update BookingsData
	public BookingsData updateBookingsData(BookingsData bookingData) {
		if(bookingsDataRepository.existsById(bookingData.getBookingId()))
			return bookingsDataRepository.save(bookingData);
		else
			return null;
				
	}
	
	//Delete BookingsData
	public void deleteBookingsData(int bookingId) {
		bookingsDataRepository.deleteById(bookingId);
				
	}
}

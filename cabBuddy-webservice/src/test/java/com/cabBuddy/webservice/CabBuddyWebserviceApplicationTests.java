package com.cabBuddy.webservice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import com.cabBuddy.webservice.controller.BookingsDataController;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@DisplayName("WebService Appliation Test")
class CabBuddyWebserviceApplicationTests {
	
	@Autowired
	private BookingsDataController bookingsDataController;
	
	@LocalServerPort
	private int randomPort;
	
	@Autowired
	private TestRestTemplate restTempClient;
	
	@Test
	@DisplayName("Application context should not be null")
	void contextLoads() {
		assertNotNull(bookingsDataController);
	}
	
	@Test
	@DisplayName("Application server should be running")
	void serverLoadingTest() {
		String URL ="http://localhost:"+randomPort+"/cabbuddy-webservice/api/bookings";
		ResponseEntity<String> response = restTempClient.getForEntity(URL, String.class);		
		assertEquals(200, response.getStatusCodeValue());
	}


}

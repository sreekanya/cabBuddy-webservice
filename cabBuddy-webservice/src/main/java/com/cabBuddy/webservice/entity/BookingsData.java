package com.cabBuddy.webservice.entity;

import java.io.IOException;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="bookings_data")
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class BookingsData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "booking_id")
	private int bookingId;
	
	@Column(name = "customer_name")
    private String customerName;
	
	@Column(name = "customer_email")
    private String customerEmail;
	
	@Column(name = "customer_phone")
    private String customerPhone;
	
	@Column(name = "date_booking")
    private Date dateBooking;
	
	@Column(name = "booking_from")
    private String bookingFrom;
	
	@Column(name = "booking_to")
    private String bookingTo;
	
	@ManyToOne
	@JoinColumn(name="driver_id",nullable=false)
    private DriverData driverId;
	
	//@OneToMany(mappedBy = "Cabs",cascade = CascadeType.ALL)
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="cab_id", nullable=false)
    private Cabs cabId;
	
	@Column(name = "num_passengers")
    private int numPassengers;
	
	@Column(name = "total_pay")
    private int totalPay;
	
	public BookingsData() {
		
	}

	@JsonCreator
	public BookingsData(@JsonProperty("bookingId") int bookingId, @JsonProperty("customerName") String customerName, @JsonProperty("customerEmail") String customerEmail, @JsonProperty("customerPhone") String customerPhone,
			@JsonProperty("dateBooking") Date dateBooking,  @JsonProperty("bookingFrom") String bookingFrom, @JsonProperty("bookingTo") String bookingTo,  @JsonProperty("driverId") DriverData driverId, @JsonProperty("cabId") Cabs cabId, @JsonProperty("numPassengers") int numPassengers,
			@JsonProperty("totalPay") int totalPay) {
		super();
		this.bookingId = bookingId;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerPhone = customerPhone;
		this.dateBooking = dateBooking;
		this.bookingFrom = bookingFrom;
		this.bookingTo = bookingTo;
		this.driverId = driverId;
		this.cabId = cabId;
		this.numPassengers = numPassengers;
		this.totalPay = totalPay;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public Date getDateBooking() {
		return dateBooking;
	}

	public void setDateBooking(Date dateBooking) {
		this.dateBooking = dateBooking;
	}

	public String getBookingFrom() {
		return bookingFrom;
	}

	public void setBookingFrom(String bookingFrom) {
		this.bookingFrom = bookingFrom;
	}

	public String getBookingTo() {
		return bookingTo;
	}

	public void setBookingTo(String bookingTo) {
		this.bookingTo = bookingTo;
	}

	public DriverData getDriverId() {
		return driverId;
	}

	public void setDriverId(DriverData driverId) {
		this.driverId = driverId;
	}

	public Cabs getCabId() {
		return cabId;
	}

	public void setCabId(Cabs cabId) {
		this.cabId = cabId;
	}

	public int getNumPassengers() {
		return numPassengers;
	}

	public void setNumPassengers(int numPassengers) {
		this.numPassengers = numPassengers;
	}

	public int getTotalPay() {
		return totalPay;
	}

	public void setTotalPay(int totalPay) {
		this.totalPay = totalPay;
	}

	
	
	
	
}

package com.cabBuddy.webservice.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="driver_data")
@JsonIgnoreProperties({"BookingsData"})
public class DriverData {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "driver_id")
	//@OneToMany(cascade=CascadeType.ALL, mappedBy="driver_data")
	private int driverId;
	
	@Column(name = "driver_name")
	private String driverName;
	
	@Column(name = "driver_email")
	private String driverEmail;
	
	@Column(name = "driver_phone")
	private String driverPhone;
	
	@Column(name = "driver_address")
	private String driverAddress;

	public DriverData() {
		
	}
	
	public DriverData(int driverId, String driverName, String driverEmail, String driverPhone, String driverAddress) {
		super();
		this.driverId = driverId;
		this.driverName = driverName;
		this.driverEmail = driverEmail;
		this.driverPhone = driverPhone;
		this.driverAddress = driverAddress;
	}

	
	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getDriverEmail() {
		return driverEmail;
	}

	public void setDriverEmail(String driverEmail) {
		this.driverEmail = driverEmail;
	}

	public String getDriverPhone() {
		return driverPhone;
	}

	public void setDriverPhone(String driverPhone) {
		this.driverPhone = driverPhone;
	}

	public String getDriverAddress() {
		return driverAddress;
	}

	public void setDriverAddress(String driverAddress) {
		this.driverAddress = driverAddress;
	}

	@Override
	public String toString() {
		return "DriverData [driverId=" + driverId + ", driverName=" + driverName + ", driverEmail=" + driverEmail
				+ ", driverPhone=" + driverPhone + ", driverAddress=" + driverAddress + "]";
	}
	
	
}

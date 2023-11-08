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
@Table(name="cabs")
@JsonIgnoreProperties({"BookingsData"})
public class Cabs {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cab_id")
	//@OneToMany(cascade=CascadeType.ALL, mappedBy="cabs")
	private int cabId;
	
	@Column(name = "cab_model")
	private String cabModel;
	
	@Column(name = "cab_type")
	private String cabType;
	
	public Cabs() {
		
	}
	
	public Cabs(int cabId, String cabModel, String cabType) {
		super();
		this.cabId = cabId;
		this.cabModel = cabModel;
		this.cabType = cabType;
	}
	
	public int getCabId() {
		return cabId;
	}

	public void setCabId(int cabId) {
		this.cabId = cabId;
	}

	public String getCabModel() {
		return cabModel;
	}
	public void setCabModel(String cabModel) {
		this.cabModel = cabModel;
	}
	public String getCabType() {
		return cabType;
	}
	public void setCabType(String cabType) {
		this.cabType = cabType;
	}
	
	@Override
	public String toString() {
		return "Cabs [cabId=" + cabId + ", cabModel=" + cabModel + ", carType=" + cabType + "]";
	}
	
	
}

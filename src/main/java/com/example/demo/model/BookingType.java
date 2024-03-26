package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BookingType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int booking_id;

	private int journey_type;
	
	private String class_of_travel;
	
	private String passenger_type;

	public BookingType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookingType(int booking_id, int journey_type, String class_of_travel, String passenger_type) {
		super();
		this.booking_id = booking_id;
		this.journey_type = journey_type;
		this.class_of_travel = class_of_travel;
		this.passenger_type = passenger_type;
	}

	public int getBooking_id() {
		return booking_id;
	}

	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}

	public int getJourney_type() {
		return journey_type;
	}

	public void setJourney_type(int journey_type) {
		this.journey_type = journey_type;
	}

	public String getClass_of_travel() {
		return class_of_travel;
	}

	public void setClass_of_travel(String class_of_travel) {
		this.class_of_travel = class_of_travel;
	}

	public String getPassenger_type() {
		return passenger_type;
	}

	public void setPassenger_type(String passenger_type) {
		this.passenger_type = passenger_type;
	}
	
	
	
}

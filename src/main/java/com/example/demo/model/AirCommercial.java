package com.example.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class AirCommercial {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	public List<String> booking_source;
	
	private String category;
	
	private String country;
	
	private String currency;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sbt_id")
	private Sbt sbt;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ctets_id")
	private CtEts ctEts;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ctstandard_id")
	private CtStandard ctStandard;
	

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "booking_id")
	private BookingType bookingType;
	
	
	
	public Sbt getSbt() {
		return sbt;
	}

	public void setSbt(Sbt sbt) {
		this.sbt = sbt;
	}

	public CtEts getCtEts() {
		return ctEts;
	}

	public void setCtEts(CtEts ctEts) {
		this.ctEts = ctEts;
	}

	public CtStandard getCtStandard() {
		return ctStandard;
	}

	public void setCtStandard(CtStandard ctStandard) {
		this.ctStandard = ctStandard;
	}

	public BookingType getBookingType() {
		return bookingType;
	}

	public void setBookingType(BookingType bookingType) {
		this.bookingType = bookingType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String product;

	public AirCommercial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AirCommercial(List<String> booking_source, String category, String country, String currency,
			String product) {
		super();
		this.booking_source = booking_source;
		this.category = category;
		this.country = country;
		this.currency = currency;
		this.product = product;
	}

	public List<String> getBooking_source() {
		return booking_source;
	}

	public void setBooking_source(List<String> booking_source) {
		this.booking_source = booking_source;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}
	
	
	}

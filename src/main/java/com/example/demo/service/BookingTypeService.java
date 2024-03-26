package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.BookingType;
import com.example.demo.repository.BookingTypeRepo;

@Service
public class BookingTypeService {

	@Autowired
	
	private BookingTypeRepo bookingTypeRepo;
	
	public List<BookingType> getAllBookingType()
	{
		return bookingTypeRepo.findAll();
	}
	
	public BookingType addBookingType(BookingType bookingType)
	{
		return bookingTypeRepo.save(bookingType);
	}
	
	public void deleteBookingType(int id)
	{
		bookingTypeRepo.deleteById(id);
	}
}

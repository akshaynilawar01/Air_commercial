package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BookingType;
import com.example.demo.service.BookingTypeService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/booking")
public class BookingTypeController {

	
	@Autowired
	
	private BookingTypeService bookingTypeService;
	
	@GetMapping("/all")
	public List<BookingType> getAllBookingType()
	{
		return bookingTypeService.getAllBookingType();
	}
	
	@PostMapping("/add")
	public BookingType addBookingType(@RequestBody BookingType bookingType)
	{
		return bookingTypeService.addBookingType(bookingType);
	}
	
	@DeleteMapping("/delete")
	public void deleteBookinType(@PathVariable int id)
	{
		bookingTypeService.deleteBookingType(id);
	}
}

package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CtEts;
import com.example.demo.service.CtEtsService;

@RestController
@RequestMapping("/ctets")
public class CtEtsController {

	@Autowired
	
	private CtEtsService ctEtsService;
	
	@GetMapping("/all")
	public List<CtEts> getAllCtEts()
	{
		return ctEtsService.getAllCtEts();
	}
	
	@PostMapping("/add")
	public CtEts addCtEts(@RequestBody CtEts ctEts)
	{
		return ctEtsService.addCtEts(ctEts);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteCtEts(@PathVariable int id)
	{
		ctEtsService.deleteCtEts(id);
	}
}

package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.CtEts;
import com.example.demo.repository.CtEtsRepo;

@Service
public class CtEtsService {

	@Autowired
	
	private CtEtsRepo ctEtsRepo;
	
	public List<CtEts> getAllCtEts()
	{
		return ctEtsRepo.findAll();
		
	}
	
	public CtEts addCtEts(CtEts ctEts)
	{
		return ctEtsRepo.save(ctEts);
	}
	
	public void deleteCtEts(int id)
	{
		ctEtsRepo.deleteById(id);
	}
	
}

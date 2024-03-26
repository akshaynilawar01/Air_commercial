package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.CtStandard;

import com.example.demo.repository.CtStandardRepo;
@Service
public class CtStandardService {


	@Autowired
	
	private CtStandardRepo ctStandardRepo;
	
	public List<CtStandard> getAllCtStandard()
	{
		return ctStandardRepo.findAll();
		
	}
	
	public CtStandard addCtStandard(CtStandard ctStandard)
	{
		return ctStandardRepo.save(ctStandard);
	}
	
	public void deleteCtStandard(int id)
	{
		ctStandardRepo.deleteById(id);
	}

	

	


	
}

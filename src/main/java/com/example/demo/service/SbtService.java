package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Sbt;
import com.example.demo.repository.SbtRepo;

@Service
public class SbtService {

	@Autowired
	
	private SbtRepo sbtRepo;
	
	public List<Sbt> getAllSbt()
	{
		return sbtRepo.findAll();
		
	}
	
	public Sbt addSbt(Sbt sbt)
	{
		return sbtRepo.save(sbt);
				
	}
	
	public void deleteSbt(int id)
	{
	    sbtRepo.deleteById(id);
	}
}

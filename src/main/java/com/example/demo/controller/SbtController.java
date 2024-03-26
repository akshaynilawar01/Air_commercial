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

import com.example.demo.model.Sbt;

import com.example.demo.service.SbtService;

@RestController
@RequestMapping("/sbt")
public class SbtController {

	@Autowired 
	
	private SbtService sbtService;
	
	@GetMapping("/all")
	public List<Sbt> getAllSbt()
	{
		return sbtService.getAllSbt();
	}
	
	@PostMapping("/addsbt")
	public Sbt addSbt(@RequestBody Sbt sbt)
	{
		return sbtService.addSbt(sbt);
	}
	
	@DeleteMapping("/deletesbt/{id}")
	public void deleteSbt(@PathVariable int id)
	{
		sbtService.deleteSbt(id);
	}
}

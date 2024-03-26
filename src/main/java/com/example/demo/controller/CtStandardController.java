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


import com.example.demo.model.CtStandard;

import com.example.demo.service.CtStandardService;

@RestController
@RequestMapping("/ctstandard")
public class CtStandardController {

    @Autowired
	private CtStandardService ctStandardService;
	
	@GetMapping("/all")
	public List<CtStandard> getAllCtStandard()
	{
		return ctStandardService.getAllCtStandard();
	}
	
	@PostMapping("/add")
	public CtStandard addCtStandard(@RequestBody CtStandard ctStandard)
	{
		return ctStandardService.addCtStandard(ctStandard);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteCtStandard(@PathVariable int id)
	{
		ctStandardService.deleteCtStandard(id);
	}
}

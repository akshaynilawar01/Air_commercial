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

import com.example.demo.model.AirCommercial;
import com.example.demo.service.AirService;

@RestController
@RequestMapping("/air")
public class AirController {
	
	@Autowired
	
	private AirService airService;

	@GetMapping
	public List<AirCommercial> getAllCommercial()
	{
		return airService.getAllCommercial();
	}
	
	@PostMapping("/add/{id}/{ctetsid}/{ctstandardid}/{bookingtypeid}")
	public AirCommercial addAirCommercial(@RequestBody AirCommercial airCommercial ,@PathVariable int id, @PathVariable int ctetsid, @PathVariable int ctstandardid, @PathVariable int bookingtypeid)
	{
		return airService.addAirCommercial(airCommercial,id, ctetsid, ctstandardid, bookingtypeid);
	}
	
	@DeleteMapping("/delete")
	public void deleteAirCommercial(@PathVariable int id)
	{
		airService.deleteAirCommercial(id);
	}
}

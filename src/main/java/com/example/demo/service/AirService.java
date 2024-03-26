package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AirCommercial;
import com.example.demo.model.BookingType;
import com.example.demo.model.CtEts;
import com.example.demo.model.CtStandard;
import com.example.demo.model.Sbt;
import com.example.demo.repository.AirRepo;
import com.example.demo.repository.BookingTypeRepo;
import com.example.demo.repository.CtEtsRepo;
import com.example.demo.repository.CtStandardRepo;
import com.example.demo.repository.SbtRepo;

@Service
public class AirService {

	@Autowired
	
	private AirRepo airRepo;
	
    @Autowired
	
	private SbtRepo sbtRepo;
    
    @Autowired
	
	private CtEtsRepo ctEtsRepo;

    @Autowired

    private CtStandardRepo ctStandardRepo;
	
    

    @Autowired

    private BookingTypeRepo bookingTypeRepo;
	 
	public List<AirCommercial> getAllCommercial()
	{
		return airRepo.findAll();
	}
	
	public AirCommercial addAirCommercial(AirCommercial airCommercial, int id, int ctetsid, int ctstandard, int bookingtypeid)
	{
		
		BookingType b = bookingTypeRepo.findById(bookingtypeid).get();
		airCommercial.setBookingType(b);
		for(String name : airCommercial.booking_source)
		{
			if(name.equals("sbt"))
			{
				Sbt s = sbtRepo.findById(id).orElse(null);
				airCommercial.setSbt(s);
			}
			
			if(name.equals("ctets"))
			{
				CtEts c = ctEtsRepo.findById(ctetsid).orElse(null);
				airCommercial.setCtEts(c);
			}
			
			if(name.equals("ctstandard"))
			{
				CtStandard cs = ctStandardRepo.findById(ctstandard).orElse(null);
				airCommercial.setCtStandard(cs);
			}
		}
		return airRepo.save(airCommercial);
	}
	
	public void deleteAirCommercial(int id)
	{
		airRepo.deleteById(id);
	}
}

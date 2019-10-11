package com.webservice.restfulservice.SalonService;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalonEndpoint {

	@Autowired
	private SalonService ss;
	
	@CrossOrigin
	@RequestMapping(value="/getSalons",method=RequestMethod.GET)
	public Iterable<Salon> getSalons(){
		return ss.getSalons();
	}
	@CrossOrigin
	@RequestMapping(value="/findBySalon/{email}",method=RequestMethod.GET)
	public Optional<Salon> findBySalon(@PathVariable String email){
		return ss.findBySalon(email);
	}
	@CrossOrigin
	@RequestMapping(value="/AddSalon",method=RequestMethod.POST)
	public void AddSalon(@RequestBody Salon salon) {
		ss.AddSalon(salon);
	}
}

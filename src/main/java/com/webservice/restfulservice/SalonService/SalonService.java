package com.webservice.restfulservice.SalonService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SalonService {

	@Autowired
	private SalonInterface si;
	
	public Iterable<Salon> getSalons(){
		return si.findAll();
	}
	public Optional<Salon>findBySalon(String semail) {
		return si.findById(semail);
	}
	
	public void AddSalon(Salon salon) {
		Optional<Salon> lCheckexist = si.findById(salon.getEmail());
		if(!lCheckexist.isPresent()) {
			si.save(salon);
		}
	}
}

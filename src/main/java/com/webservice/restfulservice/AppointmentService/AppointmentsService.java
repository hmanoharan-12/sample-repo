package com.webservice.restfulservice.AppointmentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentsService {

	@Autowired
	private AppointmentsInterface ai;
	
	public  Iterable<Appointments> getAppointments(){
		return ai.findAll();
	}
	
	public void AddAppointment(Appointments app) {
		ai.save(app);
	}
	public List<Appointments> findByUser(String uemail){
		return ai.findByuemail(uemail);
	}
	public void deleteAppointment(Integer appid) {
		ai.deleteById(appid);
	}
}

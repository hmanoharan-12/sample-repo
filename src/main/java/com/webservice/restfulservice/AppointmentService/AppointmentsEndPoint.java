package com.webservice.restfulservice.AppointmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppointmentsEndPoint {

	@Autowired
	private AppointmentsService as;
	
	@CrossOrigin
	@RequestMapping(value="/getAppointments",method=RequestMethod.GET)
	public Iterable<Appointments> getAppointments(){
		return as.getAppointments();
	}
	
	@CrossOrigin
	@RequestMapping(value="/AddAppointment",method=RequestMethod.POST)
	public void AddAppointment(@RequestBody Appointments app) {
		as.AddAppointment(app);
	}
	@CrossOrigin
	@RequestMapping(value="/findByUser/{uemail}",method=RequestMethod.GET)
	public Iterable<Appointments> findByUser(@PathVariable String uemail){
		return as.findByUser(uemail);
	}
	@CrossOrigin
	@RequestMapping(value="/deleteById",method=RequestMethod.POST)
	public void deleteById(@RequestBody Integer appid) {
		as.deleteAppointment(appid);
	}
}

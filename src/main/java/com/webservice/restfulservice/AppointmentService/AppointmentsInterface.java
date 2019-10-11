package com.webservice.restfulservice.AppointmentService;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface AppointmentsInterface extends CrudRepository<Appointments, Integer> {
	
	List<Appointments> findByuemail(String uemail);

}

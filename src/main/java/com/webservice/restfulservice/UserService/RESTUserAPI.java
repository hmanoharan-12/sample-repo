package com.webservice.restfulservice.UserService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTUserAPI {

	@Autowired
	private UserService sl;
	
	@CrossOrigin
	@RequestMapping(value="/getuser",method = RequestMethod.GET)
	public Iterable<User> getuser() {
		return sl.getUser();
	}
	@CrossOrigin
	@RequestMapping(value="/addUser",method = RequestMethod.POST)
	public void addUser(@RequestBody User user) {
		sl.addUser(user);
	}
	
	@CrossOrigin
	@RequestMapping(value="/findByEmail/{email}",method = RequestMethod.GET)
	public List<User> findByEmail(@PathVariable("email") String email){
		return sl.findByEmail(email);
	}
}

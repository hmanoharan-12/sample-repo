package com.webservice.restfulservice.UserService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserInterface in;
	
	public Iterable<User> getUser() {
		return in.findAll();
	}
	public void addUser(User user) {
		List<User> luser = in.findByemail(user.getEmail());
		if(luser.size()==0) {
			in.save(user);
		}
	}
	public List<User> findByEmail(String email){
		return in.findByemail(email);
		
	}
}

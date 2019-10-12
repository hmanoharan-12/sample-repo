package com.Wallet.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Wallet.Model.UserAccount;
import com.Wallet.Repository.UserRepo;
import com.Wallet.ServiceImpl.UserAccountServiceImp;


@RestController
public class UserController {
	
	
	 @Autowired
	 UserAccountServiceImp userRepo;
	
	
	
	    @CrossOrigin
		@RequestMapping(value="/users",method = RequestMethod.GET)
		public Iterable<UserAccount> getuser() {
			return userRepo.getUsers();
		}
	 
	    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
	    public Optional<UserAccount> getStudent(@PathVariable int id) {
	    	return userRepo.getUser(id);
	    }
}

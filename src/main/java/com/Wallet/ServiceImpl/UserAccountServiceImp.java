package com.Wallet.ServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Wallet.Model.UserAccount;
import com.Wallet.Repository.UserRepo;


@Service
public class UserAccountServiceImp {
    
@Autowired	
private UserRepo repo;

public Iterable<UserAccount> getUsers() {
	return repo.findAll();
}
public void addUser(UserAccount user) {
	repo.save(user);
	
}
public Optional<UserAccount> getUser(int id) {
    return repo.findById(id);
}

 
}

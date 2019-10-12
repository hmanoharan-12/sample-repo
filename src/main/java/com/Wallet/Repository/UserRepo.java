package com.Wallet.Repository;

import java.util.List;
import java.util.Optional;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Wallet.Exceptions.UserNotFoundException;
import com.Wallet.Model.UserAccount;

public interface UserRepo extends CrudRepository<UserAccount, Integer>{
	
}



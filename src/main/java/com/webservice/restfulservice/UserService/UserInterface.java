package com.webservice.restfulservice.UserService;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;;

@Repository
public interface UserInterface extends CrudRepository<User, Integer> {
	
	List<User> findByemail(String email);

}

package com.fajle.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fajle.model.User;

@Service
public class UserService {
	List<User> users = new ArrayList<>(0);

    public User save(User user){
    	System.out.println(user.getEmail());
        users.add(user);
        return user;
    }
    
    public List<User> getAllUsers(){
        return this.users;
    }

	
}

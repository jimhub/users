package com.springguild.users.service;

import com.springguild.users.data.entity.*;
import com.springguild.users.data.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

/**
 * Created by jamesliljenquist on 10/28/15.
 */
@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User getUser(long id) {
		return userRepository.findOne(id);
	}

	public List<User> getAllUsers() {
		List<User> users = new ArrayList<User>();

		for(User u : userRepository.findAll()) {
			users.add(u);
		}

		return users;
	}
}

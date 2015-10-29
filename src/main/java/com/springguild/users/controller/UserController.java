package com.springguild.users.controller;

import com.springguild.users.data.entity.*;
import com.springguild.users.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

/**
 * Created by jamesliljenquist on 10/28/15.
 */
@RestController
@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/{id}")
	@ResponseBody
	public User userGuy(@PathVariable("id") long id) {
		User user = userService.getUser(id);

		return user;
	}

}

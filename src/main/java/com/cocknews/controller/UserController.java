package com.cocknews.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cocknews.model.User;
import com.cocknews.service.UserService;

@CrossOrigin("http://localhost:4200")
@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/auth/reg")
	public User registerNewUser(@RequestBody User user)
	{
		return userService.registerNewUser(user);
	}
	
	
	
	
	@GetMapping("/auth/foradmin")
	//@PreAuthorize("hasRole('admin')")
	public String forAdmin()
	{
		return "only accesable to admin";
	}
	
	@GetMapping("/foruser")
	@PreAuthorize("hasRole('user')")
	public String forUser()
	{
		return "only accesable to user";
	}
	
	@PutMapping("auth/addrole/{roleName}/{userName}")
	public User addRoleToUser(@PathVariable String roleName,@PathVariable String userName)
	{
		return userService.addRoleToUser(roleName,userName);
	}
}

package com.cocknews.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cocknews.model.Role;
import com.cocknews.service.RoleService;
@CrossOrigin("http://localhost:4200")
@RestController
public class RoleController {

	@Autowired
	private RoleService roleService;
	
	@PostMapping("/auth/createnewrole")
	public Role createNewRole(@RequestBody Role role)
	{
		return roleService.createNewRole(role);
	}

	
	
	
	
}

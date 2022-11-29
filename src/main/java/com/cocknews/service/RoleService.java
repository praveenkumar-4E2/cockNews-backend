package com.cocknews.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cocknews.model.Role;
import com.cocknews.model.User;
import com.cocknews.repository.RoleRepository;

@Service
public class RoleService {

	@Autowired
	private RoleRepository roleRepository;
	
	
	public Role createNewRole(Role role)
	{
		return roleRepository.save(role);
	}
	
	public Role findByRoleName(String roleName)
	{
		return roleRepository.findByroleName(roleName);
	}
	

}

package com.cocknews.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.cocknews.model.Role;
import com.cocknews.model.User;
import com.cocknews.repository.UserRepository;

@Service
public class UserService {


	@Autowired
	private UserRepository userRepository;
	@Autowired
    private PasswordEncoder passwordEncoder;
	@Autowired
	private RoleService roleService;


	public User registerNewUser(User user)
	{
		User newUser=new User();
		newUser.setName(user.getName());
		newUser.setEmail(user.getEmail());
		newUser.setPassword(passwordEncoder.encode(user.getPassword()));
		newUser.setRoles(user.getRoles());
		return userRepository.save(newUser);
	}


	public User addRoleToUser(String roleName, String userName) {
		User existingUser=userRepository.findByName(userName);
		Role existingRole=roleService.findByRoleName(roleName);
		Set<Role> roles=existingUser.getRoles();
		roles.add(existingRole);
		existingUser.setRoles(roles);
		return userRepository.save(existingUser);
	}
	
	
}

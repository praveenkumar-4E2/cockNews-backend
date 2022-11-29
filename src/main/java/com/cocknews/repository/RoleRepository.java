package com.cocknews.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cocknews.model.Role;

@Repository
public interface RoleRepository  extends JpaRepository<Role, Integer>{

	public Role findByroleName(String rollName);
}

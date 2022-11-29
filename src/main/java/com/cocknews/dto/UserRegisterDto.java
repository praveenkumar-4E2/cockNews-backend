package com.cocknews.dto;

import java.util.Set;

import com.cocknews.model.Role;
import com.cocknews.model.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class UserRegisterDto {

	private String userName;
	private String password;
	private String email;
	private Set<Role> roles;
}

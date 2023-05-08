package com.registration.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.registration.dto.UserRegistrationDto;
import com.registration.entities.User;

public interface UserService 
extends UserDetailsService {

User save(UserRegistrationDto registrationDto);
List<User> getAll();
}

package com.stacksimplify.restservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stacksimplify.restservices.entities.User;
import com.stacksimplify.restservices.repositories.UserRepository;
import com.sun.el.stream.Optional;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
public User createUser(User user)
{
	return userRepository.save(user);
}
public java.util.Optional<User> getUserById(Long id)
{
	java.util.Optional<User> user=userRepository.findById(id);
	return user;
}
public User updateUserById(Long id,User user)
{
	user.setId(id);
	return userRepository.save(user);
}
public void deleteUserById(Long id)
{
	if(userRepository.findById(id).isPresent())
	{
		userRepository.deleteById(id);
	}
}
public User getUserByUserName(String userName)
{
	return userRepository.findByUserName(userName);
}
}

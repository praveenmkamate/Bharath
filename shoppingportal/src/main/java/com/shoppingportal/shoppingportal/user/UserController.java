package com.shoppingportal.shoppingportal.user;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/user/list")
	public Iterable<User> getUsers(){
		return userRepository.findAll();
	}
	
	@GetMapping("/user/list/{id}")
	public Optional<User> getBook(@PathVariable("id") Integer id) {
		return userRepository.findById(id);
	}
	
	@PostMapping("/user/create")
	public HttpStatus addUser(@RequestBody User user) {
		userRepository.save(user);
		return HttpStatus.CREATED;
	}
}

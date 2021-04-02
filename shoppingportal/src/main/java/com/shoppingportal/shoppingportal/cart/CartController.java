package com.shoppingportal.shoppingportal.cart;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingportal.shoppingportal.item.Item;
import com.shoppingportal.shoppingportal.user.User;
import com.shoppingportal.shoppingportal.user.UserRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CartController {
	@Autowired
	CartRepository cartRepository;
	
	@GetMapping("/cart/list")
	public Iterable<Cart> getCarts(){
		return cartRepository.findAll();
	}
	
	@GetMapping("/cart/list/{id}")
	public Optional<Cart> getBook(@PathVariable("id") Integer id) {
		return cartRepository.findById(id);
	}
	
	@PostMapping("/cart/add")
	public HttpStatus addItem(@RequestBody Item item) {
		
		return HttpStatus.ACCEPTED;
	}
}

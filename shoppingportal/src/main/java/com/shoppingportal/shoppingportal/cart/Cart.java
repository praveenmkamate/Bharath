package com.shoppingportal.shoppingportal.cart;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.shoppingportal.shoppingportal.user.User;

@Entity
@Table(name = "cart")
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Boolean is_purchased;
	private User user;
	
	
	public Cart(Integer id, Boolean is_purchased, User user) {
		super();
		this.id = id;
		this.is_purchased = is_purchased;
		this.user = user;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Boolean getIs_purchased() {
		return is_purchased;
	}
	public void setIs_purchased(Boolean is_purchased) {
		this.is_purchased = is_purchased;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
}

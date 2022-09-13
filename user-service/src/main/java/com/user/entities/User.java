package com.user.entities;

import java.util.ArrayList;
import java.util.List;

public class User {
	private Long userId;
	private String name;
	private int phone;
	List<Contact> contact = new ArrayList<>();

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public List<Contact> getContacts() {
		return contact;
	}

	public void setContacts(List<Contact> contacts) {
		this.contact = contacts;
	}

	public User(Long userId, String name, int phone) {
		super();
		this.userId = userId;
		this.name = name;
		this.phone = phone;
	}

	public User(Long userId, String name, int phone, List<Contact> contacts) {
		super();
		this.userId = userId;
		this.name = name;
		this.phone = phone;
		this.contact = contacts;
	}
}

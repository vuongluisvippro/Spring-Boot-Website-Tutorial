package com.tutorial.genealogy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("all")
@Entity
@Table(name = "user")
public class User {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="user_name")
	private String username;
	
	@Column(name="role")
	private String role;
	
	public User() {
	}
	
	public User(String username, String role) {
		super();
		this.username = username;
		this.role = role;
	}

	public User(Integer id, String username, String role) {
		super();
		this.id = id;
		this.username = username;
		this.role = role;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String username) {
		this.username = username;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
}

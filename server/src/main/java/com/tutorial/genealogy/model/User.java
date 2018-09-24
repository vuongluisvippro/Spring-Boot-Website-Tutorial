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
	private String userName;
	
	@Column(name="role")
	private String role;
	
	public User() {
	}
	
	public User(String userName, String role) {
		super();
		this.userName = userName;
		this.role = role;
	}

	public User(Integer id, String userName, String role) {
		super();
		this.id = id;
		this.userName = userName;
		this.role = role;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
}

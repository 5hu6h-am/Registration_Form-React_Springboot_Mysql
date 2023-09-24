package com.wipro.topcrowd.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//import javax.validation.constraints.Email;
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.Size;

@Entity
public class User {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

// @NotBlank(message = "Name is required")
// @Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
 private String name;

// @Email(message = "Invalid email address")
// @NotBlank(message = "Email is required")
 private String email;

// @NotBlank(message = "Password is required")
// @Size(min = 6, message = "Password must be at least 6 characters")
 private String password;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public User() {
	super();
	// TODO Auto-generated constructor stub
}

public User(Long id, String name, String email, String password) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.password = password;
}
 
 
}


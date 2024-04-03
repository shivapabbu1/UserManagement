package com.users.base.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usertable")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	
	  @Column(name = "first_name")
	    private String firstname;

	    @Column(name = "last_name")
	    private String lastname;

	    @Column(name = "user_email")
	    private String email;
	    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lasttname) {
		this.lastname = lasttname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public User() {
		super();
		
	}
	public User( String firstname, String lastname, String email) {
		super();
	
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}
	
	
	
}

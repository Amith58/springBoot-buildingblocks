package com.stacksimplify.restservices.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


//@Entity(name="Users")
@Entity
//@Table(name="user", schema="usermanagement")
@Table(name="user") 
public class User {
	@Id
	@GeneratedValue
	private Long id;
	@NotEmpty(message="Username is mandatory field, Pleas provide username")
	@Column(name="USER_NAME",length=50,nullable=false,unique=true)
	private String userName;
	@Size(min=2,message="first name should have minimum 2 characters")
	@Column(name="FIRST_NAME",length=50,nullable=false,unique=true)
	private String firstName;
	@Column(name="LAST_NAME",length=50,nullable=false,unique=true)
	private String lastName;
	@Column(name="EMAIL_ADDRESS",length=50,nullable=false,unique=true)
	private String email;
	@Column(name="ROLE",length=50,nullable=false,unique=true)
	private String role;
	@Column(name="SSN",length=50,nullable=false,unique=true)
	private String SSN;
	@OneToMany(mappedBy="user") 
	private List<Order> orders;
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	public User(Long id, String userName, String firstName, String lastName, String email, String role, String sSN) {
		this.id = id;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.role = role;
		SSN = sSN;
	}
	public User() {
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	
	

}

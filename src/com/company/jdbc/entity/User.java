package com.company.jdbc.entity;
import java.math.BigDecimal;

public class User {

	private int id;
	private String username;
	private String password;
	private BigDecimal sal;
	
	public User() {
	}
	
	public User(String username, String password, BigDecimal sal) {
		super();
		this.username = username;
		this.password = password;
		this.sal = sal;
	}

	public User(int id, String username, String password, BigDecimal sal) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public BigDecimal getSal() {
		return sal;
	}
	public void setSal(BigDecimal sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", sal=" + sal + "]";
	}
	
}

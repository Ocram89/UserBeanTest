package com.marco.bean;

import java.io.Serializable;

import com.marco.dao.UserDAO;
import com.marco.dao.UserDAOSimpleImpl;
import com.marco.service.UserController;

public class UserBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3369140507952239573L;
	
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private int age;
	private Boolean isLogged; 
	
	public UserBean(){
		isLogged = false;
	}
	
	public UserBean(String username, String password, String firstName, String lastName, Integer age){
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public String getUsername(){
		return this.username;
	}
	
	public void setUsername(String username){
		this.username = username;
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
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean login(){
		if(UserController.getInstance().login(this)){
			this.isLogged = true;
		}
		return this.isLogged;
	}
	
	public Boolean save(){
		System.out.println(this);
		return UserController.getInstance().insert(this);
	}
	
	public void logout(){
		this.isLogged = false;
		this.username = null;
		this.password = null;
		this.age = -1;
		this.firstName = null;
		this.lastName = null;
	}
	
	public Boolean isLogged(){
		return this.isLogged;
	}
	
	@Override
	public String toString(){
		String str = ("username: " + username);
		str += (", firstname: " + firstName);
		str += (", lastname: " + lastName);
		str += (", age: " + Integer.toString(age));
		return str;
	}
	
}

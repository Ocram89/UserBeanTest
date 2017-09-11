package com.marco.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.marco.bean.UserBean;

public class UserDAOSimpleImpl implements UserDAO, Serializable {

	/**
	 * 
	 */
	
	List<UserBean> userList;
	
	
	private static final long serialVersionUID = 2927607285058681035L;

	public UserDAOSimpleImpl() {
		userList = new ArrayList<UserBean>();
		UserBean user1 = new UserBean("spongebob", "1234", "Spongebob", "Squarepants", 20);
		UserBean user2 = new UserBean("patrick", "password", "Patrick", "Star", 20);
		UserBean user3 = new UserBean("squidward", "qwerty", "Squidward", "Tentacles", 31);
		
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
	}
	
	@Override
	public Boolean login(UserBean user) {
		for(UserBean u : userList){
			if(u.getUsername().equals(user.getUsername()) && u.getPassword().equals(user.getPassword())){
				user.setFirstName(u.getFirstName());
				user.setLastName(u.getLastName());
				user.setAge(u.getAge());
				
				return true;
			}
		}
		
		return false;
	}

	@Override
	public Boolean exists(String username) {
		for(UserBean u : userList){
			if(u.getUsername().equals(username)){
				return true;
			}
		}
		return false;
	}

	@Override
	public Boolean insert(UserBean user) {
		if(exists(user.getUsername())){
			return false;
		}
		userList.add(user);
		return true;
	}

	@Override
	public void delete(UserBean user) {
		
	}

	@Override
	/**
	 * Not a DB implementation, this method does nothing
	 */
	public void update(UserBean user) {
		return;
	}

}

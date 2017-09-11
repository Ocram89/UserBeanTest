package com.marco.service;

import com.marco.bean.UserBean;
import com.marco.dao.UserDAO;
import com.marco.dao.UserDAOSimpleImpl;

public class UserController {
	private static UserController instance;
	private UserDAO userDao;

	public UserController() {
		this.userDao = new UserDAOSimpleImpl();
	}
	
	public static UserController getInstance() {
		// Singleton
		if (instance == null)
			instance = new UserController();
		return instance;
	}
	
	public boolean insert(UserBean userBean) {
		return userDao.insert(userBean);
	}
	
	public boolean login (UserBean userBean) {
		return userDao.login(userBean);
	}
	
	public boolean exists (String username) {
		return userDao.exists(username);
	}
	
	public void delete(UserBean userBean) {
		userDao.delete(userBean);
	}
	
	public void update(UserBean userBean) {
		userDao.update(userBean);
	}
}

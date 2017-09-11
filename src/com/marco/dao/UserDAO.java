package com.marco.dao;

import com.marco.bean.UserBean;

public interface UserDAO {

	public Boolean login(UserBean user);
	public Boolean exists(String username);
	public Boolean insert(UserBean user);
	public void delete(UserBean user);
	public void update(UserBean user);
}

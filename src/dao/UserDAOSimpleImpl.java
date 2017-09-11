package dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.marco.bean.User;

public class UserDAOSimpleImpl implements UserDAO, Serializable {

	/**
	 * 
	 */
	
	List<User> userList;
	
	
	private static final long serialVersionUID = 2927607285058681035L;

	public UserDAOSimpleImpl() {
		userList = new ArrayList<User>();
		User user1 = new User("spongebob", "1234", "Spongebob", "Squarepants", 20);
		User user2 = new User("patrick", "password", "Patrick", "Star", 20);
		User user3 = new User("squidward", "qwerty", "Squidward", "Tentacles", 31);
		
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
	}
	
	@Override
	public Boolean login(User user) {
		for(User u : userList){
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
		for(User u : userList){
			if(u.getUsername().equals(username)){
				return true;
			}
		}
		return false;
	}

	@Override
	public Boolean insert(User user) {
		if(exists(user.getUsername())){
			return false;
		}
		userList.add(user);
		return true;
	}

	@Override
	public void delete(User user) {
		
	}

	@Override
	/**
	 * Not a DB implementation, this method does nothing
	 */
	public void update(User user) {
		return;
	}

}

package dao;

import com.marco.bean.User;

public interface UserDAO {

	public Boolean login(User user);
	public Boolean exists(String username);
	public Boolean insert(User user);
	public void delete(User user);
	public void update(User user);
}

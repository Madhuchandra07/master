package reg.dao;

import java.util.List;



public interface UserDao {
	
	public Integer saveUser(User user);
	public List<User> getAllUsers();
	public User getUser(Integer id);
	public void deleteUser(Integer id);
	public void updateUser(User user);
}

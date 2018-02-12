package reg.service;

import java.util.List;


public interface UserService {
	
	public Integer saveUser(UserBean userBean);
	public List<UserBean> getAllUsers();
	public UserBean getUser(Integer id);
	public void modifyuser(UserBean userBean);
	
}

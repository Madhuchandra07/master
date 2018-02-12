package reg.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;


public class UserDaoImpl implements UserDao{

	private HibernateTemplate ht;	
	
	public UserDaoImpl( HibernateTemplate ht){
		this.ht=ht;
	}
	
	public Integer saveUser(User user){
		
		Integer i=(Integer)ht.save(user);
		
		return null;
		
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		
		return ht.find("from user");

		
	}

	@Override
	public User getUser(Integer id) {
		// TODO Auto-generated method stub
		return (User)ht.get(User.class, id);

	}

	@Override
	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub
		ht.delete(getUser(id));
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		ht.update(user);

	}
}
package nLayeredeTrade.dataaccess.abstracts;

import java.util.ArrayList;

import nLayeredeTrade.entities.concretes.User;

public interface UserDao {
	
	void add(User user);
	
	void update(User user);
	
	void delete(User user);
	
	User get(int id);
	
	User getByEmail(String email);
	
	ArrayList<User> getAll();


}

package nLayeredeTrade.business.abstracts;


import nLayeredeTrade.entities.concretes.User;

public interface UserService {

	void add(User user);
	
	void delete(User user);
	
	void update(User user);
	
	User get(int id);
	
	User getByMail(String email);

	
}

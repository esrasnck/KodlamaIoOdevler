package nLayeredeTrade.business.abstracts;

import nLayeredeTrade.entities.concretes.User;

public interface AuthService {

	
	void login(User user);
	
	void register(User user);	
	
	void loginWithGoogle();
	
	void verify(User user,String code);

}

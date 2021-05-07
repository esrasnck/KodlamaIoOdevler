
import nLayeredeTrade.business.concretes.AuthManager;
import nLayeredeTrade.business.concretes.UserManager;
import nLayeredeTrade.dataaccess.concretes.InMemoryUserDao;
import nLayeredeTrade.entities.concretes.User;


public class Main {

	public static void main(String[] args) {
    


		AuthManager au = new AuthManager(new UserManager(new InMemoryUserDao()));
		
		User user1 = new User(6,"Esra","Sancak","esrasancak3@gmail.com","123132131");
		au.register(user1);
		
		User user2 = new User(7,"Esra","Sancak","esrasancak@gmail.com","1234567");
		au.login(user2);
		
		
		au.loginWithGoogle();
		au.register(user2);
		System.out.println(user1.getVerificationCode());
		au.verify(user1, user1.getVerificationCode());
		 
		
	}

}

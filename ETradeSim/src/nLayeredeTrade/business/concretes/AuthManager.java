package nLayeredeTrade.business.concretes;

import nLayeredeTrade.adapters.GoogleMailManager;
import nLayeredeTrade.business.abstracts.AuthService;
import nLayeredeTrade.business.abstracts.UserService;
import nLayeredeTrade.core.EmailValidator;
import nLayeredeTrade.core.GoogleService;
import nLayeredeTrade.entities.concretes.User;
import nLayeredeTrade.fakeService.GmailClass;

public class AuthManager implements AuthService {
	
	private UserService userService;
	
	public AuthManager(UserService userService) {
		
		this.userService = userService;
	}

	@Override
	public void login(User user) {
		
		if(!checkUser(user)) {
			
			System.out.println("email and password should be bende ingilizce bu kadar.");
			return;
			
		}
		
		User userToLogin = this.userService.getByMail(user.getEmail());
		if(userToLogin.isActive() ==true) {
		if(userToLogin!=null && user.getPassword() == userToLogin.getPassword()) {
			System.out.println("Login");
			
		}
		
		else {
			System.out.println("Invalid password or user email.");
		}
		
		}
		
	}

	@Override
	public void register(User user) {
		
		if(this.userService.getByMail(user.getEmail())!=null) {
			System.out.println("Email is used. ");
			return;
		}
	
       
	    int rnd = (int)Math.floor(Math.random()*99999);
	    String verify = user.getFirstName().substring(0,1) + user.getId() + user.getLastName().substring(0,1) + rnd;
	    user.setVerificationCode(verify);
	    
	 	this.userService.add(user);
	    System.out.println("Registered " + user.getFirstName());
		
	}
	
	
	@Override
	public void verify(User user, String code) {
		
		User user1 = this.userService.get(user.getId());
		// System.out.println(user1.getVerificationCode() + " " + user1.getId());
		if(user1.getVerificationCode()== code) {
			user1.setActive(true);
			
			System.out.println("Verified ");
			return;
		}
		System.out.println("verification code is invalid");
		
	
	}
	
	
	@Override
	public void loginWithGoogle() {
		
		GoogleService gs = new GoogleMailManager();
	   
		User user = gs.registerWithGoogle();
	    
		if(this.userService.getByMail(user.getEmail())!=null) {
		 
			this.userService.getByMail(user.getEmail()).setActive(true);
			
		}
		else {
			
	     this.userService.add(user);
	     user.setActive(true);
		}
		System.out.println("logged in. thank you Umut :) ");

	}

	
    private boolean checkUser(User user) {      
    	
    	if(user.getEmail().length()>0 && user.getPassword().length()>0) {
    		
    		return true;
    	}
    	else {
    	
    		return false;
    	}
    }
 

}

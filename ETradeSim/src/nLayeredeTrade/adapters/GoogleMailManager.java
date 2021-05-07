package nLayeredeTrade.adapters;

import java.util.ArrayList;

import nLayeredeTrade.core.GoogleService;
import nLayeredeTrade.entities.concretes.User;
import nLayeredeTrade.fakeService.Gmail;
import nLayeredeTrade.fakeService.GmailClass;


public class GoogleMailManager implements GoogleService{

	
	
	
	@Override
	public User registerWithGoogle() {
		
       Gmail gmail = new Gmail();
       
       ArrayList<GmailClass> emails = gmail.emailAndPassword();
       
       int rnd = (int)Math.floor(Math.random() * emails.size()-1);
       
       User user = new User(10,emails.get(rnd).getFirstName(),emails.get(rnd).getLastName(),emails.get(rnd).getEmail(),emails.get(rnd).getPassword());
       

	   return user;
     
		
	}

}


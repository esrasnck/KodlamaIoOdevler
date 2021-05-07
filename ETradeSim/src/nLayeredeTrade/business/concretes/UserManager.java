package nLayeredeTrade.business.concretes;

import nLayeredeTrade.business.abstracts.UserService;
import nLayeredeTrade.core.EmailValidator;
import nLayeredeTrade.dataaccess.abstracts.UserDao;
import nLayeredeTrade.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;
	
	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {   // kubramla test et
		
		if(!this.validationRules(user)) {
			System.out.println("Try again");
			return;
			}
		
        this.userDao.add(user);
        		
	}

	@Override
	public void delete(User user) {
		this.userDao.delete(user);
		
	}

	@Override
	public void update(User user) {
		
		if(!this.validationRules(user)) {
			System.out.println("Try again");
			return;
			}
		
		this.userDao.update(user);
		
	}

	@Override
	public User get(int id) {
		
	  return  this.userDao.get(id);
	}

	@Override
	public User getByMail(String email) {
		
		return this.userDao.getByEmail(email);

	}
	

	
	
	private boolean checkIfNameValid(String name) {
		
		if(name.length()<2) {
			
			return false;
		}
		return true;

	}
	
	private boolean checkIfLastNameValid(String lastName) {
		
		if(lastName.length()<2) {
		
			return false;
		}
		return true;

	}
	
	private boolean checkIfPasswordValid(String password) {
		
		if(password.length()<6) {
			
			return false;
		}
		return true;

	}
	
	private boolean checkIfemailValid(String email) {
		
		if(EmailValidator.isEmailValid(email)) {
			return true;
		}
		else {
		return false;
		}

		
	}



    private boolean validationRules(User user) {
    	
		if(!this.checkIfNameValid(user.getFirstName())) {
			System.out.println("First Name must be longer than 2 char. ");
			return false;
		}
		if(!this.checkIfLastNameValid(user.getLastName())) {
			System.out.println("Last Name must be longer than 2 char. ");
			return false;
		}
		if(!this.checkIfPasswordValid(user.getPassword())) {
			System.out.println("Password must be longer than 2 char. ");
			return false;
		}
		
		if(!this.checkIfemailValid(user.getEmail())) {
			System.out.println("Invalid email.");
			return false;
		}
		
		return true;
    }




}

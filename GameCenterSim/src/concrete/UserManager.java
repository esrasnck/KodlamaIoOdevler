package concrete;

import abstracts.UserCheckService;
import abstracts.UserService;
import entities.User;

public class UserManager implements UserService{
	
	private UserCheckService userCheckService;

	public UserManager(UserCheckService userCheckService) {
		super();
		this.userCheckService = userCheckService;
	}

	@Override
	public void add(User user) {
		if(this.userCheckService.CheckIfRealPerson(user)) {
			
			System.out.println("Kullanici eklendi : " + user.getFirstName() + " " + user.getLastName());
		}
		else {
		System.out.println("Kullanici dogru degil");
		}
	
		
	}

	@Override
	public void update(User user) {

			System.out.println("Kullanici güncellendi . ");
	
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanici güncelledi .");
		
	}


}

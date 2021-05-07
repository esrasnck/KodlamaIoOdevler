package nLayeredeTrade.dataaccess.concretes;

import java.util.ArrayList;



import nLayeredeTrade.dataaccess.abstracts.UserDao;
import nLayeredeTrade.entities.concretes.User;

public class InMemoryUserDao implements UserDao {

	ArrayList<User> users = new ArrayList<User>();
	
	public InMemoryUserDao() {
		
		User user = new User(1,"Esra","Sancak","esrasancak@gmail.com","1234567");
		User user1= new User(2,"Aysel","Mehmetzade","aysel123@gmail.com","123");
		User user2 = new User(3,"Kübra","Terzi","kubraterzi@gmail.com","123245");
		User user3= new User(4,"Fatih","Kayan","fatihkayan@gmail.com","1324");
		User user4= new User(5,"Umut","Kose","umutkose@gmail.com","1324684");
		
		
		users.add(user);
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		
	}


	
	
	@Override
	public ArrayList<User> getAll() {
	
		return this.users;
	}

	
	
	@Override
	public void add(User user) {
	   this.users.add(user);
	   System.out.println("Kullanici eklendi 1 " + user.getFirstName() +" " +user.getId());
	}

	@Override
	public void update(User user) {
		
      System.out.println("Kullanici güncellendi : /arastirilacak...");
	}

	@Override
	public void delete(User user) {

     System.out.println("Kullanici silindi : /arastirilacak");
		
	}

	@Override
	public User get(int id) {
	   
        User selectedUser= this.users.stream().filter((u) -> u.getId() == id).findFirst().get(); // stream-> linq sorguları ile aynı işlevi gören yapılardır. filtreleme,sorgulama, eşleştirme, map leme, sıralama gibi birçok metot taşır.
        return selectedUser;
	}

	@Override
	public User getByEmail(String email) {

         User userForEmail = this.users.stream().filter(user-> user.getEmail().equals(email)).findFirst().orElse(null);

		return userForEmail;
	}




}

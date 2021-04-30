
public class UserManager {

	public void add(User user) {
		System.out.println(user.firstName + " " + user.lastName + " Isimli kullanıcı eklendi.");
	}
	
	public void update(User user) {
		System.out.println(user.firstName + " " + user.lastName + " Isimli kullanıcı güncellendi.");
	}
	
	public void delete(User user) {
		
		System.out.println(user.firstName + " " + user.lastName + " Isimli kullanıcı silindi");
	}
	
	public void addMultiple(User[] users) {
		for (User user : users) {
			
			add(user);
		}
		
	}
	
	public void addComment() {
		System.out.println(" Yorum eklendi ");
	}
	
	public void updateComment() {
		System.out.println(" Yorum güncellendi ");
	}
	
	public void deleteComment() {
		System.out.println(" Yorum silindi ");
	}
	
}


public class Main {

	public static void main(String[] args) {
		
		UserManager userManager = new UserManager();
		
		User user = new User();
		user.id =1;
		user.firstName="Esra";
		user.lastName ="Sancak";
		user.email="esrasancak@gmail.com";
		user.passWord="1234";
		
		userManager.add(user);
		userManager.update(user);
		userManager.delete(user);
		
		User user1 = new User();
		user1.id =2;
		user1.firstName="Aysel";
		user1.lastName ="Çiçeğim";
		user1.email="ayselcicegim@gmail.com";
		user1.passWord="1234";
		
		User[] users= {user,user1};
		userManager.addMultiple(users);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addHomeWork();
		instructorManager.absenceOpen();
		instructorManager.absenceClose();
		
		StudentManager studentManager = new StudentManager();
		studentManager.absenceComplete();
		
		

	}

}

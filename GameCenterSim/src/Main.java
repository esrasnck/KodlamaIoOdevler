import adapters.MernisServiceAdapter;
import concrete.CampainManager;
import concrete.GameManager;
import concrete.SaleManager;
import concrete.UserManager;
import entities.Campain;
import entities.Game;
import entities.User;

public class Main {

	public static void main(String[] args) {
	
		Game game = new Game();
		game.setId(1);
		game.setGameName("valorant");
		game.setUnitPrice(100);
		
		User user = new User(1,"Latife Esra","Sancak",1984,"12131212331321"); // dogru bilgiler esliginde calisiyor.
		
		User user1=new User(2,"Conan","Boomer",1979,"132123131321");
		
		Campain campain = new Campain(1,"Bahar Kampanyasi",20);
		
		UserManager userManager = new UserManager(new MernisServiceAdapter());
		
		userManager.add(user);
		
		System.out.println("-----------------------------------------");
		
		userManager.add(user1);
		
		System.out.println("------------------------------------------");
		
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		
		System.out.println("------------------------------------------");
		
		SaleManager saleManager = new SaleManager(new CampainManager());
		saleManager.sale(game, user);
		
		System.out.println("------------------------------------------");
		
		saleManager.saleWithCampain(game, campain);
		
		System.out.println("------------------------------------------");

	}

}

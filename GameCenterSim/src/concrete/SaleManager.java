package concrete;


import abstracts.CampainService;
import abstracts.SaleService;
import entities.Campain;
import entities.Game;
import entities.User;

public class SaleManager implements SaleService{
	
	private CampainService campainService;
	
	public SaleManager(CampainService campainService) {
	
		this.campainService = campainService;
	}



	@Override
	public void sale(Game game, User user) {
		
		System.out.println( game.getGameName()+ " isimli oyun " + user.getFirstName() + " isimli kullanciya satildi. ");
	}



	@Override
	public void saleWithCampain(Game game, Campain campain) {
	   if(this.campainService.campainExist())
	   {
		
		System.out.println( game.getGameName() + " isimli oyuna " + campain.getCampainName() +" isimli kampanya uygulandi. kadarlik indirim aldi ");
	   }
	   
	   else {
		   System.out.println( game.getGameName()+ " isimli oyun satildi.");
	   }
	   
	}
	

}

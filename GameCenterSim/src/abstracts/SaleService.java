package abstracts;

import entities.Campain;
import entities.Game;
import entities.User;

public interface SaleService {

	public void sale(Game game, User user);
	
	public void saleWithCampain(Game game, Campain campain);
	
}

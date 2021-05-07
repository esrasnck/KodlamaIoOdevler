





import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;

import concrete.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args)  {
		
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
	    customerManager.Save(new Customer(1,"LATiFE ESRA","SANCAK",1984,"23758191646"));

		
		
		
	}

}

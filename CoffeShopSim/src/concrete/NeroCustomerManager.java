package concrete;

import abstracts.BaseCustomerManager;
import entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{

	@Override
	public void Save(Customer customer) {
		System.out.println("Save to db : " +customer.getFirstName() +  " " + customer.getLastName());
		
	}
}

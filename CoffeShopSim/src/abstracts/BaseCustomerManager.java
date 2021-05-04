package abstracts;



import entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	
	  public abstract void Save(Customer customer) ;
}
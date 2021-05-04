package adapters;

import java.rmi.RemoteException;

import abstracts.CustomerCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {
	

	@Override
	public boolean CheckIfRealPerson(Customer customer)  {

		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
        boolean result=true;
        System.out.println(customer.getFirstName().toUpperCase() + " "+
				customer.getLastName().toUpperCase()+ " " + customer.getTimeOfBirth());
        
		try {		
			result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName(),
				customer.getLastName(),customer.getTimeOfBirth());
		}catch (RemoteException e) {
		
			e.printStackTrace();
		}
		System.out.println(result);
	return result;
		
		
		
	}

}

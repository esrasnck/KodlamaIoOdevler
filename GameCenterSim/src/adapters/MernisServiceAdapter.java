package adapters;

import java.rmi.RemoteException;
import java.util.Locale;

import abstracts.UserCheckService;

import entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckService{

	@Override
	public boolean CheckIfRealPerson(User user) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
	    boolean result=true;
	    
		try {		
			result = client.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()),user.getFirstName().toUpperCase(new Locale("tr")),
				user.getLastName().toUpperCase(new Locale("tr")),user.getTimeOfBirth());
		}catch (RemoteException e) {
		
			e.printStackTrace();
		}

	return result;
		
	}

}


	



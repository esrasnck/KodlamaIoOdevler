package concrete;



import abstracts.CampainService;
import entities.Campain;

public class CampainManager implements CampainService{

	@Override
	public void add(Campain campain) {
		System.out.println("Kampanya eklendi. " +  campain.getCampainName());
		
	}

	@Override
	public void update(Campain campain) {
		System.out.println("Kampanya güncellendi ." + campain.getCampainName());
		
	}

	@Override
	public void delete(Campain campain) {
		System.out.println(campain.getCampainName() + " isimli Kampanya silindi. ");
		
	}

	@Override
	public boolean campainExist() {
		// TODO Auto-generated method stub
		return true;
	}





}

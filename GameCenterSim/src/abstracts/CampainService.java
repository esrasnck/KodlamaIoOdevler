package abstracts;



import entities.Campain;


public interface CampainService {

    public void add(Campain campain);
	
    public	void update(Campain campain);
	
	public void delete(Campain campain);
	
	public boolean campainExist();  // yanlis
}

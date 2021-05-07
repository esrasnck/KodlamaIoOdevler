package nLayeredeTrade.fakeService;



import java.util.ArrayList;



public class Gmail {


	public ArrayList<GmailClass>  emailAndPassword() {
		
		ArrayList<GmailClass>  gmClass = new ArrayList<GmailClass>();
		
	
		gmClass.add(new GmailClass("esra","sancak","esrasancak@gmail.com","1234567"));
		gmClass.add(new GmailClass("umut","kose","umutkose@gmail.com","1324684"));
		gmClass.add(new GmailClass("aysel","matmazel","aysel123@gmail.com","123"));
		gmClass.add(new GmailClass("kubra","terzi","kubraterzi@gmail.com","123245"));
		gmClass.add(new GmailClass("fatih","kayan","fatihkayan@gmail.com","1324"));

		
		return gmClass;
	
	}
	


}
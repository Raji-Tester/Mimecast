package step_Files;



import cucumber.api.java.After;
import cucumber.api.java.Before;
import util.TestBase;
import util.ShortCode;

public class Hooks extends ShortCode implements TestBase {
	

	
		
	@Before 
	public void openbrowser() throws Exception{
		    log.debug("this is for Before Test" );
		
	    	log.debug("Initializing Browser and open Browser" );
			//Initializing Browser and open Browser 
			Browser.openBrowser("chrome");
			
			log.debug("initializing property file" );
			//initializing property file
			ORpro.property();
	    	
	       
	    }
	
	 @After
	    public void tearDown() {
		 
	    	log.debug("this is for after Test" );
	    	
	    	log.debug("Close Browser");
	    	//Close Browser 
	    //	Browser.driver.close();
	    	
		}

	
}
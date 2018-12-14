package util;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	
	public WebDriver driver=null;
	
	 public void openBrowser(String Browser1) throws Exception {
	     System.out.println("Called openBrowser");
	     
	     if(Browser1.equalsIgnoreCase("chrome")){      
	     
	           //initialize browser 
	          String ChromeDriverepath=System.getProperty("user.dir")+"//src//main//chromedriver.exe";
		      System.setProperty("webdriver.chrome.driver",ChromeDriverepath);
	          driver = new ChromeDriver(); 
	 	 }
	     
	    else { 
	     
	    if(Browser1.equalsIgnoreCase("firefox")){
	     
		   driver = new FirefoxDriver();
	 	 } else {
				//If no browser passed throw exception
				throw new Exception("Browser is not correct");
			}	 	
	  } 
	     
	      //maximize chrome driver window  
	     driver.manage().window().maximize();
	     
	      //Implement implicitly wait it is global wait for 20 seconds 
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	         

	 }

}

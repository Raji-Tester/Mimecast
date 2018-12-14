package util;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ShortCode implements TestBase{
	
	
	//short code for getting xpath from config :OR.properties file 
	 public   WebElement getObject(String xpathKey)
	 {
		
				return  Browser.driver.findElement(By.xpath(ORpro.CON.getProperty(xpathKey)));
			
		
     }
	 
	 //short code for print outs 
	 
	 public  void println(WebElement cs)
	 {
		
				 System.out.println(cs);
			
		
     }
	 public  void println(String s)
	 {
		
				 System.out.println(s);
			
		
     }
	 public  void println(int t)
	 {
		
				 System.out.println(t);
			
		
     }
}

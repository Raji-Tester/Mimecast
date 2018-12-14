package util;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;



public  class ORpro  {
	
	        
			public    Properties CON;
	         
	
	
	 public void  property() throws IOException
	  { 
		
		 CON = new Properties();
		 FileInputStream fn = new FileInputStream(System.getProperty("user.dir")+"//src//main//resources//config//OR.properties");
		 CON.load(fn);
		 
		 System.out.println("OR file intizilation ");
				
      } 
	 
	
	 
	 
 } 
	


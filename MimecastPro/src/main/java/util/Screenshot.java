package util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Screenshot {
	
          public void takeScreenShot(WebDriver driver ,String filewithpath) throws IOException{
        	//Convert web driver object to TakeScreenshot
	
             TakesScreenshot takeshot=((TakesScreenshot)driver);
			
           //Call getScreenshotAs method to create image file

             File  sorcefile=takeshot.getScreenshotAs(OutputType.FILE);
             
           //Move image file to new destination

             File DestFile=new File(filewithpath);
             
             
             //Copy file at destination

             FileUtils.copyFile(sorcefile, DestFile);
             
             

	}

		
	
	}

package runnerfiles;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)


@CucumberOptions(	
		
		features ="src//test//resources//features//Test3.feature",
		
	
		glue = "step_Files" ,
		plugin="html:target//ClearScore_html_Report/"
		
		
		)

public class Runner_Clear_Score {
	
	
	

}

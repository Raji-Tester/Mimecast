package util;

import org.apache.log4j.Logger;

public interface TestBaseExtends {
	
	//Log4j intizilation
		Logger log = Logger.getLogger("devpinoyLogger");
		
		//properties file intizilation
		ORpro   ORpro= new ORpro();

}

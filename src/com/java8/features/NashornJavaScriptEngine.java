package com.java8.features;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashornJavaScriptEngine {

	public static void main(String[] args) throws ScriptException {
		
		//from java8 execute JavaScript code dynamically at JVM (Java Virtual Machine) 
		System.out.println("______________________________________________________________");
		
		 // Creating script engine  
		 ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");  
		 
	      // Evaluating Nashorn code 
		 
	        ee.eval("print('Hello Nashorn');"); 
	        
	      //or also we can  Reading Nashorn file  
	      //  ee.eval(new FileReader("js/hello.js"));    
	    }  

	}



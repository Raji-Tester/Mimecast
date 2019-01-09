package com.java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.System.*;



public class StreamApi {

	public static void main(String[] args) {
	
		//list of String array
		List<String> list=Arrays.asList("Raji","amer","varun","arun","arun");
		
		//apply parallel stream for multithreading
		out.println("  Achive multithreading using parallelStream ");
		list.parallelStream().forEach(out::println);
		out.println("___________________________________________________________________");
		
		
		//create stream and apply intermediate and terminate operation
		out.println("Create stream and apply intermediate and terminate operation");
		Stream <String > stream1 =list.stream(); 
		long count=stream1.filter(x-> x.startsWith("a")).sorted().count(); 
		out.println("This is a count of list  = "+count);
		out.println("___________________________________________________________________");	
		
		
		//create another stream  for convert list to set 
		out.println("Create another stream  for convert list to set ");
		Stream <String > stream2 =list.stream(); 
		stream2.collect(Collectors.toSet()).forEach(out::println);
		
	}

}

package com.java8.features;
/**
 * Three types of interface 
 * 		1.Normal Interface 
 * 		2.Functional Interface  &
 * 		3.Marker Interface 
 * 
 * Here we discuss about functional interface
 * it contains single Abstract Method 
 */


@FunctionalInterface  // or we can call it SAM
 interface  ShowMe{
	
	 void showOk();
	 
	public  default  void one()
	 {
	   System.out.println("method one  ");
      };
                         
    public   static void one1()
     {
       System.out.println("method one 1 ");
      };
      
      public  default  void one2()
 	 {
 	   System.out.println("method one2  ");
       };
       
   }

@FunctionalInterface 
interface say{
	
	void sayOneThing(String say);
	
	boolean equals(Object obj);
	
}

class A implements ShowMe{
	
@Override
public void showOk() {
	System.out.println("class A implement ShowMe interface for difine the method  showOk");
	
}	
	
}

public class SAMdemo {
	
	public static void main(String[] args) throws Throwable {
		
		
		//First way  
		A objA= new A();
		
		  objA.showOk();
		
		
		
		//second way
		
		ShowMe show = new ShowMe()
		{
			
		public void showOk() {
			
			
		System.out.println("Method difined inside the  annonymas class ");
			
		}};
	
		show.showOk();
		
	  //  apply lambda expression for this same code 
		
		ShowMe showLam =()-> {System.out.println("Lambada applyed  ");};
			
			showLam.showOk();
			
	// Define showOk method with MethodReference 
			
			ShowMe showMethod=SAMdemo::showSomethig;
			
			showMethod.showOk();
	}	
	
	
	public static  void showSomethig() {
		
		System.out.println("This is MethodRefence ");
	}
	
}
			

		
		


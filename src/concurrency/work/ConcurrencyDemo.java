package concurrency.work;

import java.util.concurrent.TimeUnit;

public class ConcurrencyDemo {

	public static void main(String[] args) throws InterruptedException {
		
	
	
		Runnable task = () -> {
		    String threadName = Thread.currentThread().getName();
		    
		    System.out.println("Hello " + threadName);
		};
		
		TimeUnit.SECONDS.sleep(1);

		task.run();
		//Create Thread 
		Thread thread = new Thread(task);
		
		 thread.setName("First Thread");
		System.out.println( thread.getName());
		 thread.start();
		
		//join represent the ask main thread to wait for this thread completion  
		 thread.join();
		 // method will check t1 is alive or not (true or falls )
		 System.out.println(thread.isAlive());
				
		System.out.println("Done!");

}}


package concurrency.work;


class Counter {
	
	int count;
	// add Synchronized for  avoid conflict

	public synchronized void increament() {    		
		
		count++;
		
	}

}

public class Synchronized {

	public static void main(String[] args) throws Exception  {
		
		Counter counter=new Counter ();
		
	// functional interface runnable define with lambda expression 
		Runnable runnable=()->{
			
              for(int i=1;i<=1000;i++) {
				
				counter.increament();
				
			}
			
		};
		
		//Create Threads
		Thread t1=new Thread(runnable);
		Thread t2=new Thread(runnable);
		
		//start Threads
		t1.start();	
		t2.start();	
		//join represent the ask main thread to wait for this threads completion
		t1.join();
		t2.join();
						
	System.out.println("count "+counter.count);	
		
	}
		
	}



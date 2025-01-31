class Assignment3 extends Thread{ 
	public void run(){
		System.out.print("Thread is Running.");
	}
public static void main(String args[]){  

		// Creating object of thread class
		Assignment3 thread=new Assignment3();  

                // Start the thread
		thread.start();
	}  
}
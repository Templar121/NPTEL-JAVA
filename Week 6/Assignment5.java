class Assignment5 extends Thread{  
    public void run(){  
      System.out.print("Thread is running.");  
    }  
   public static void main(String args[]){  
      Assignment5 t=new Assignment5();  
      System.out.println("Name of thread 't':"+ t.getName());
  // start the thread  
    t.start();  
  // set the name
    t.setName("NPTEL");
  System.out.println("New name of thread 't':"+ t.getName());  
   }  
  }
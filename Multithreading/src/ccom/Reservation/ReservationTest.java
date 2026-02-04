package ccom.Reservation;

public class ReservationTest{
	public static void main(String args[]) {
    Reservation r=new Reservation(2);//two tickets for each out of 3 threads,so booked for only one
   // Reservation r=new Reservation(1);// one ticket per thread out of three so booked for two threads 

    Thread t=new Thread(r,"devadatta");
    Thread t1=new Thread(r,"datta");
    Thread t2=new Thread(r,"hala");
    t.start();
    t1.start();
    t2.start();
  
	}
}
//Runnable interface is implemented by multiple threads on a shared obj so same lock same shared obj 
//If we want multiple threads to work on the same shared object, we should create one object and pass it to multiple threads. Implementing the Runnable interface is more recommended than extending the Thread class.
//“Runnable is preferred because multiple threads can share the same object easily.”
//In Thread, each thread has its own object, so locks are different,how many thread objts created that many objts created 
//and have diff locks on diff objts not same lock”
// Reservation t= new Reservation(2);
   //    t.setName("deva");
   //    t.start();
      
   //    Reservation t1= new Reservation(2);
   //    t1.setName("waste");
   //    t1.start();
       
   //    Reservation t2= new Reservation(2);
   //    t2.setName("fellow");
	  // t2.start();	

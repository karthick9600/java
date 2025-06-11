package source;
//class Book   implements Runnable {//extends Thread{} // covert in anonymous class in Runnable
	

class Num extends Thread{
	  public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			try {Thread.sleep(1000);} catch(InterruptedException e) {}
		}
	}
}

public class MultiThreadingDemo {

	public static void main(String[] args) throws InterruptedException {

     Runnable book=()-> {
    	 // book- thread  
     
    	
         //run
 		for(int i=1;i<=5;i++) {
 			System.out.println("UpdatingDb");
 			try {
 				Thread.sleep(2000);
 			} catch (InterruptedException e) {
 				
 				e.printStackTrace();
 			}
 		
 	
     }
     };
     Num num =new Num();
     Thread t1 =new Thread( book);
     t1.setName("Book1");
     t1.setPriority(Thread.MAX_PRIORITY);
     System.out.println(t1.getPriority());
     t1.start();
     num.start();
     
     //book.updateDb();
     
     
    /* book.start();    //run
     num.start();
     if(book.isAlice()) {
    	 System.out.println("still exceuting");
     }
     
     book.join();
     num.join();
     if(book.isAlice()) {
    	 System.out.println("still exceuting");
     } */
     System.out.println("Super");
     
	}

}

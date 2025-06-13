package sample;

class Demo implements Runnable{
	public void run() {
		String name=Thread.currentThread().getName();
		try {
			System.out.println(name+"is executing first line");
			Thread.sleep(3000);
			System.out.println(name+"is exceuting second line");
			Thread.sleep(3000);
			System.out.println(name+"is excecuting third line");
			Thread.sleep(3000);
			synchronized(this){
				System.out.println(name+"is exceuting in fourth line");
				Thread.sleep(3000);
				System.out.println(name+"is executing in fifth line");
				Thread.sleep(3000);
				
			}
			System.out.println(name+"is executing in sixth line");
			Thread.sleep(3000);
			System.out.println(name+"is executing in seventh line");
			Thread.sleep(3000);
			System.out.println(name+ "is executing in eighth line");
			Thread.sleep(3000);
			
		}catch(Exception e) {
			System.out.println("Some  problem occured ");
		}
	}
}
 public class MultiThreadSynchronizedObjectRef{
	 public static void main(String[] args) {
		 Demo  d=new Demo();
		 Thread  t1=new Thread(d);
		 Thread t2=new Thread(d);
		 Thread t3=new Thread(d);
		 t1.setName("&&");
		 t2.setName("@@");
		 t3.setName("**");
		 t1.start();
		 t2.start();
		 t3.start();
		
	}
 }
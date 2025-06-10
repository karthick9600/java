package source;

 class Demo11{
	void fun1() {
		System.out.println("connection is estd");
		try {
			int a=100;
			int b=0;
			int c=a/b;
			System.out.println(c);
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		System.out.println("Connection 2 is terminated");
	}
}
public class PrintStackTrace {

	public static void main(String[] args) {
		
		System.out.println("Connection1 is estd");
		Demo11 d1=new Demo11();
		d1.fun1();
		System.out.println("Connection 1 is terminated");
		

	}

}

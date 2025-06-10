package source;
class Demo13{
	void fun1() {
		System.out.println("connection2 is estd");
		try {
			int a=100;
			int b=0;
			int c=a/b;
			System.out.println(c);
			
		}
		catch(Exception  e) {
			System.out.println(e);
		}
		System.out.println();
	}
}

public class ExceptionReference {

	public static void main(String[] args) {
		System.out.println("connection1 is estd");
		Demo13 d1= new Demo13();
		d1.fun1();
		System.out.println("connection1 is terminated");

	}

}

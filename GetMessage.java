package source;
class Demo12{
	void fun1() {
		System.out.println("Connection2 is terminated");
		try {
			int a=100;
			int b=0;
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Connection2 is terminated");
	}
}

public class GetMessage {

	public static void main(String[] args) {
		System.out.println("Connection1 is estd");
        Demo12 d1=new Demo12();
        d1.fun1();
        System.out.println("Connection1 is terminated");

	}

}

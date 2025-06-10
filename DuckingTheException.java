package source;

import java.util.Scanner;



class Demoe1{
	void fun1() throws Exception {
		System.out.println("Connection 2 is estd");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numertor");
		int a=scan.nextInt();
		System.out.println("Enter the denominator");
		int b=scan.nextInt();
		int c=a/b;
		System.out.println(c);
		System.out.println("Exception handled in fun1()");
		System.out.println("Connection 2  is terminated");
		
	}
}

public class DuckingTheException {

	public static void main(String[] args) {
		System.out.println("connection 1 is estd");
		try {
			Demoe1 d1 =new Demoe1();
			d1.fun1();
		}
			
			catch(Exception e) {
				System.out.println("Exception handled in main()");
				
			}
			System.out.println("Connection is terminated");
			
				
			
		

	}

}

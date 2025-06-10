package source;

import java.util.Scanner;

public class HandlingTheException {
	 static class Demo1{
		void fun1() {
			System.out.println("coonctin is estd");
			Scanner scan=new Scanner(System.in);
			try {
				System.out.println("Enter the numerator");
				int a=scan.nextInt();
				System.out.println("Enter the denominator");
				int b=scan.nextInt();
				int c=a/b;
				System.out.println(c);
			}
			catch(Exception e){
				
				System.out.println("Exception handled in fun1()");
				
			}
			System.out.println("connection 2 is terminated");
		}
	}
	

	public static void main(String[] args) {
		System.out.println("Connection 1 is estd");
		Demo1 d1= new Demo1();
		d1.fun1();
		System.out.println("Connection is terminated");
	

	}

}

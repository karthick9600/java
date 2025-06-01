package project6789;

import java.util.Scanner;


public class ExceptionNormalTermination {

	public static void main(String[] args) {
		
           System.out.println("connection is estd");
           Scanner scan= new Scanner(System.in);
           System.out.println("Enter the  numerator");
           int a =scan.nextInt();
           System.out.println("Enter the  dinomirator");
           int b=scan.nextInt();
           int c=a/b;
           System.out.println(c);
           System.out.println("Connection  is terminated");
           

	}

}

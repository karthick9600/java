package project6789;

import java.util.Scanner;

public class ExceptionOccuredNormalTermination {

	public static void main(String[] args) {
		
         System.out.println("connection is  Estd");
         Scanner scan=new Scanner (System.in);
         try{
        	 System.out.println("Enterthe nemaretor");
        	 int a=  scan.nextInt();
        	 System.out.println("Enter the Dinomaretor");
        	 int b=scan.nextInt();
        	 int c=a/b;
        	 System.out.println(c);
         }
         catch (Exception e){
        	 System.out.println("Some problem Occured");// if  occured the problem in try block  is catched
        	 
        	 
         }
         System.out.println("Connection Is Terminated");
         
	}

}

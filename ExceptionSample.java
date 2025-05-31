package project6789;
import java.io.*;  //file  handling
import java.util.Scanner;

public class ExceptionSample {

	public static void main(String[] args)  {
		int a=10;
		int b=0;
		int c =0 ;
		try {
			int arr[]=null;
			//            System.out.println(arr[1]);
			c=a/b; //throw
			System.out.println("Try block");		
		     throw new NullPointerException("demo");  //custom  Exception	
		}
		
		
		catch(ArithmeticException | NullPointerException e) {  //java 1.7
			System.out.println("  Arithemetic and NullPointer Error Occured");
		}
		
		catch(Exception e) {
			System.out.println("Error is occcured");
		}
		finally{
			System.out.println("This gets printed no matter what");
			
		}
		
		File file =new File("abc.txt");
		try {
			FileInputStream fs =new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
	System.out.println(c);
	
	System.out.println(" End of the program");
	 /*int i=0;
	  try(Scanner scanner=new Scanner(System.in)){    //try with resource
			int i=scanner.nextInt();
	  }
	  
	  System.out.println(i);  */ 
	  
	  
	  double bal=500,withdraw=700;
	  try {
		  if(bal<withdraw) 
			  throw new InsufficientFundException(withdraw-bal);
	  }
	  catch(InsufficientFundException e) {
		  System.out.println("Not Enough Money");
	  }
	 
		  
	  }
}

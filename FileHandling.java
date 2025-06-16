package one;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileHandling {

	public static void main(String[] args) throws Exception{
		File obj=new File("demoFile.txt");
          
	//1.creation of a file
		obj.createNewFile();
		// if(obj.createNewFile()) 
			// System.out.println("File Created"+obj.getName());
			 //else 
				// System.out.println(" Files Already Created"+obj.getName());
				 
	 //2.Writing
		 String ip[]= { //ip  in a  one type Array
				 "Hi",
				 "Hellow",
				 "Good Morning"
		 };
		 
		 FileOutputStream  fos=new FileOutputStream(obj);
		 DataOutputStream dos=new DataOutputStream(fos);
		 for(String str:ip)
			 dos.writeUTF(str);
		 //3.append
		 dos.writeUTF("bye");  //append meaning in a conversetion end for ip[]  to start in append
		 
		 System.out.println("MSG written successfully...");
		 
		 //4.ReadUTF
		 FileInputStream fis=new FileInputStream(obj);
		DataInputStream dis=new DataInputStream(fis);
		 while(dis.available()>0) {
	     String Line=dis.readUTF(dis);
	     System.out.println(Line);
		
		 }
		 if(obj.exists()) {
			 // There  are File Information
			 System.out.println("FILE NAME="+obj.getName());
			 System.out.println("path="+ obj.getAbsolutePath());
			 System.out.println("read?"+obj.canRead());
			 System.out.println("write?"+obj.canWrite());
			 System.out.println("size="+obj.length());
			 
		 }
		 else {
			 System.out.println("No file exists");
		 }
		 
		 dos.close();
		 dis.close();
		 }
	}



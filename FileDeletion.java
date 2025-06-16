package one;

import java.io.File;

public class FileDeletion {

	public static void main(String[] args)  throws Exception{
		File obj=new File(" SampleFile.txt");
		obj.createNewFile();
		obj.delete();

	}

}

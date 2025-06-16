package example;

import java.io.File;

public class FileAlpha {

	public static void main(String[] args) throws Exception{
	    //specify the Directory in which file exists
		String path="F:\\example";
		//create an object of file
		File file=new File(path);
		file.createNewFile();
		//exists() will return true with the file existing in the directory else it will return false
		System.out.println(file.exists());
		
	}

}

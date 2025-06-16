package example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    public static void main(String[] args) {
        // Specify the complete file path including file name
        String filePath = "F:\\example\\data.txt";  // Make sure the "example" folder exists

        try {
            // Create a FileWriter object using the file path
            FileWriter writer = new FileWriter(filePath);
            
            // Write text content into the file
            writer.write("Hello! This is a text written using Java.");
            
            // Flush and close the writer
            writer.flush();
            writer.close();

            System.out.println("Text was successfully written to the file!");

        } catch (IOException e) {
            System.out.println("An error occurred:");
            e.printStackTrace();
        }
    }
}

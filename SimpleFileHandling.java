package example;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class SimpleFileHandling {

    public static void main(String[] args) {
        try {
            // 1. Create a new file
            File myFile = new File("example.txt");
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }

            // 2. Write to the file
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, this is a simple file handling example in Java.");
            writer.close();
            System.out.println("Successfully wrote to the file.");

            // 3. Read the file
            FileReader reader = new FileReader("example.txt");
            int ch;
            System.out.println("File content:");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

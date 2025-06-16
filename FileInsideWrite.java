package example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileInsideWrite {

    public static void main(String[] args) {
        // Specify the file path (not just directory)
        String path = "F:\\example\\numbers.txt";  // Make sure folder exists

        File file = new File(path);
        Scanner scan = new Scanner(System.in);
        FileWriter writer;

        try {
            System.out.println("Enter 3 numbers:");
            int n1 = scan.nextInt();
            int n2 = scan.nextInt();
            int n3 = scan.nextInt();

            // Convert numbers to String before writing
            writer = new FileWriter(file);
            writer.write("First number: " + n1 + "\n");
            writer.write("Second number: " + n2 + "\n");
            writer.write("Third number: " + n3 + "\n");

            writer.flush();
            writer.close();

            System.out.println("Numbers written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred:");
            e.printStackTrace();
        }

        scan.close();
    }
}

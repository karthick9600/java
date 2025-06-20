package one;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileHandlingIntegerFloatBoolean {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a float value: ");
        float f = scan.nextFloat();

        System.out.print("Enter an integer value: ");
        int n = scan.nextInt();

        System.out.print("Enter a boolean value (true/false): ");
        boolean b = scan.nextBoolean();

        String path = "F:\\\\one\\\\data.txt";

        PrintWriter writer = null;

        try {
            writer = new PrintWriter(path);  // ✅ use PrintWriter directly
            writer.println(f);
            writer.println(n);
            writer.println(b);
            System.out.println("Data written to file successfully.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                writer.close();  // ✅ close writer to release resources
            }
        }
    }
}

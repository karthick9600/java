package example;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingAllInOne {
    public static void main(String[] args) {
        String fileName = "example.txt";
        File file = new File(fileName);

        // 1. Create File
        try {
            if (file.createNewFile()) {
                System.out.println("✅ File created: " + file.getName());
            } else {
                System.out.println("⚠️ File already exists.");
            }
        } catch (IOException e) {
            System.out.println("❌ Error while creating the file.");
            e.printStackTrace();
        }

        // 2. Write to File
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello! This file contains sample text.\nLearning File Handling in Java.");
            writer.close();
            System.out.println("✅ Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("❌ Error while writing to the file.");
            e.printStackTrace();
        }

        // 3. Read from File
        try {
            Scanner reader = new Scanner(file);
            System.out.println("📄 File content:");
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("❌ Error while reading the file.");
            e.printStackTrace();
        }

        // 4. Delete File
        if (file.delete()) {
            System.out.println("🗑️ File deleted: " + file.getName());
        } else {
            System.out.println("❌ Failed to delete the file.");
        }
    }
}

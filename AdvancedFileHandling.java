package example;
import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class AdvancedFileHandling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Create directory
        String dirPath = "F:\\example\\data";
        File directory = new File(dirPath);
        if (!directory.exists()) {
            directory.mkdirs();  // create directories
            System.out.println("Directory created: " + dirPath);
        }

        // Step 2: Create a file
        File file = new File(dirPath + "\\info.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists.");
            }

            // Step 3: Write to file
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Welcome to advanced file handling in Java!\n");
            bw.write("You are learning advanced operations.\n");
            bw.close();
            System.out.println("Data written to file.");

            // Step 4: Append to file
            FileWriter fwAppend = new FileWriter(file, true);
            BufferedWriter bwAppend = new BufferedWriter(fwAppend);
            bwAppend.write("Appending new line to file.\n");
            bwAppend.close();
            System.out.println("Data appended to file.");

            // Step 5: Read file content
            System.out.println("\nReading File Content:");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

            // Step 6: Copy file to another location
            Path source = Paths.get(file.getAbsolutePath());
            Path destination = Paths.get(dirPath + "\\info_copy.txt");
            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("\nFile copied to: " + destination);

            // Step 7: List all files in directory
            System.out.println("\nListing all files in directory:");
            File[] files = directory.listFiles();
            if (files != null) {
                for (File f : files) {
                    System.out.println(f.getName());
                }
            }

        } catch (IOException e) {
            System.out.println("An error occurred:");
            e.printStackTrace();
        }

        scanner.close();
    }
}


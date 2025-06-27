package com.dyashincollectionfm.list;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
public static void main(String[] args) {
	File myFile = new File("akshaysFile.txt");
	 try {
         if (myFile.createNewFile()) {
             System.out.println("File created: " + myFile.getName());
         } else {
             System.out.println("File already exists.");
         }
     } catch (IOException e) {
         System.out.println("Unable to create the file.");
         e.printStackTrace();
     }
	 
	 try {
         FileWriter writer = new FileWriter("akshaysFile.txt");
         writer.write("Hello Akshay!\nWelcome to Java File Handling.\n");
         writer.close();
         System.out.println("Successfully wrote to the file.");
     } catch (IOException e) {
         System.out.println("An error occurred while writing.");
         e.printStackTrace();
     }
	 
	 try {
         File file = new File("akshaysFile.txt");
         Scanner scanner = new Scanner(file);

         System.out.println("📄 File content:");
         while (scanner.hasNextLine()) {
             String line = scanner.nextLine();
             System.out.println(line);
         }

         scanner.close();
     } catch (FileNotFoundException e) {
         System.out.println("File not found.");
         e.printStackTrace();
     }
	 
	 try {
         FileWriter writer = new FileWriter("akshaysFile.txt", true); // 'true' means append mode
         writer.write("This is additional content.\n");
         writer.close();
         System.out.println("Successfully appended to the file.");
     } catch (IOException e) {
         System.out.println("An error occurred while appending.");
         e.printStackTrace();
     }
	 File file = new File("akshayFile.txt");
     if (file.delete()) {
         System.out.println("Deleted file: " + file.getName());
     } else {
         System.out.println("Failed to delete the file.");
     }
}
}

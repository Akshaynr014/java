package com.dyashincollectionfm.list;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingSecond {

	public static void main(String[] args) {
		 String folderPath = "C:\\Users\\Hp\\Documents\\FileHandling";

	        // Create folder if it doesn't exist
	        File folder = new File(folderPath);
	        if (!folder.exists()) {
	            folder.mkdirs(); // creates the folder
	        }

	        // Create the file inside the folder
	        File file = new File(folderPath + "\\akshayFile.txt");

	        try {
	            if (file.createNewFile()) {
	                System.out.println(" File created at: " + file.getAbsolutePath());
	            } else {
	                System.out.println(" File already exists at: " + file.getAbsolutePath());
	            }
	        } catch (IOException e) {
	            System.out.println(" Error creating file.");
	            e.printStackTrace();
	        }
	        String filePath = "C:\\Users\\Hp\\Documents\\FileHandling\\akshayFile.txt";

	        try {
	            FileWriter writer = new FileWriter(filePath);
	            writer.write("Hello Akshay!\nThis is written to a file in your specific folder.");
	            writer.close();
	            System.out.println("Successfully wrote to the file.");
	        } catch (IOException e) {
	            System.out.println(" Error writing to the file.");
	            e.printStackTrace();
	        }
	        File file1 = new File("C:\\Users\\Hp\\Documents\\FileHandling\\akshayFile.txt");

	        try {
	            Scanner scanner = new Scanner(file1);
	            System.out.println(" File content:");
	            while (scanner.hasNextLine()) {
	                System.out.println(scanner.nextLine());
	            }
	            scanner.close();
	        } catch (FileNotFoundException e) {
	            System.out.println("❌ File not found.");
	            e.printStackTrace();
	        }
	    }
	}



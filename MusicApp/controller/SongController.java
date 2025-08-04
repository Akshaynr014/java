package controller;

import model.Song;
import service.SongService;
import exception.SongNotEoundException;

import java.util.List;
import java.util.Scanner;

public class SongController {

    private final SongService songService;
    private final Scanner scanner;

    public SongController() {
        songService = new SongService();
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("\n🎵 MUSIC PLAYER MENU 🎵");
            System.out.println("1. Add Song");
            System.out.println("2. List All Songs");
            System.out.println("3. Get Song By ID");
            System.out.println("4. Update Song");
            System.out.println("5. Delete Song");
            System.out.println("6. Exit");

            int choice = readValidInt("Enter your choice: ");

            switch (choice) {
                case 1 -> addSong();
                case 2 -> listAllSongs();
                case 3 -> getSongById();
                case 4 -> updateSong();
                case 5 -> deleteSong();
                case 6 -> {
                    System.out.println("👋 Exiting Music Player. Goodbye!");
                    return;
                }
                default -> System.out.println("❌ Invalid choice. Try again.");
            }
        }
    }

    private void addSong() {
        int id = readValidInt("Enter Song ID: ");
        String name = readValidName("Enter Song Name: ");
        int year = readValidInt("Enter Song Year: ");

        Song song = new Song(id, name, year);
        songService.addSong(song);
        System.out.println("✅ Song added successfully.");
    }

    private void listAllSongs() {
        List<Song> songs = songService.getAllSong();
        if (songs.isEmpty()) {
            System.out.println("⚠️ No songs found.");
        } else {
            songs.forEach(System.out::println);
        }
    }

    private void getSongById() {
        int id = readValidInt("Enter Song ID to search: ");

        try {
            Song song = songService.getSongById(id);
            System.out.println("🎵 Song found: " + song);
        } catch (SongNotFoundException e) {
            System.out.println("❌ " + e.getMessage());
        }
    }

    private void updateSong() {
        int id = readValidInt("Enter Song ID to update: ");
        String name = readValidName("Enter new Song Name: ");
        int year = readValidInt("Enter new Song Year: ");

        Song updatedSong = new Song(id, name, year);

        try {
            songService.updateSong(id, updatedSong);
            System.out.println("✅ Song updated successfully.");
        } catch (SongNotFoundException e) {
            System.out.println("❌ " + e.getMessage());
        }
    }

    private void deleteSong() {
        int id = readValidInt("Enter Song ID to delete: ");

        try {
            songService.deleteSong(id);
            System.out.println("🗑️ Song deleted successfully.");
        } catch (SongNotFoundException e) {
            System.out.println("❌ " + e.getMessage());
        }
    }

    // 🔁 Utility method to read a valid integer input
    private int readValidInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("❌ Invalid input. Please enter a valid number.");
            }
        }
    }

    // 🔁 Utility method to read a valid name (no digits allowed)
    private String readValidName(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            if (input.matches("[a-zA-Z ]+")) {
                return input;
            } else {
                System.out.println("❌ Invalid name. Only alphabets and spaces are allowed.");
            }
        }
    }
}

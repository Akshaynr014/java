package controller;

import model.Song;
import service.SongService;
import exception.SongNotFoundException;

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
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addSong();
                    break;
                case 2:
                    listAllSongs();
                    break;
                case 3:
                    getSongById();
                    break;
                case 4:
                    updateSong();
                    break;
                case 5:
                    deleteSong();
                    break;
                case 6:
                    System.out.println("👋 Exiting Music Player. Goodbye!");
                    return;
                default:
                    System.out.println("❌ Invalid choice. Try again.");
            }
        }
    }

    private void addSong() {
        System.out.print("Enter Song ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Song Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Song Year: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        Song song = new Song(id, name, year);
        songService.addSong(song);
        System.out.println("✅ Song added successfully.");
    }

    private void listAllSongs() {
        List<Song> songs = songService.getAllSong();
        if (songs.isEmpty()) {
            System.out.println("⚠️ No songs found.");
        } else {
            for (Song s : songs) {
                System.out.println(s);
            }
        }
    }

    private void getSongById() {
        System.out.print("Enter Song ID to search: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        try {
            Song song = songService.getSongById(id);
            System.out.println("🎵 Song found: " + song);
        } catch (SongNotFoundException e) {
            System.out.println("❌ " + e.getMessage());
        }
    }

    private void updateSong() {
        System.out.print("Enter Song ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter new Song Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter new Song Year: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        Song updatedSong = new Song(id, name, year);

        try {
            songService.updateSong(id, updatedSong);
            System.out.println("✅ Song updated successfully.");
        } catch (SongNotFoundException e) {
            System.out.println("❌ " + e.getMessage());
        }
    }

    private void deleteSong() {
        System.out.print("Enter Song ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        try {
            songService.deleteSong(id);
            System.out.println("🗑️ Song deleted successfully.");
        } catch (SongNotFoundException e) {
            System.out.println("❌ " + e.getMessage());
        }
    }
}

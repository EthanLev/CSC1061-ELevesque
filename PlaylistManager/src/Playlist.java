import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Playlist {

	private static MyDoubleLinkedList<Song> songs = new MyDoubleLinkedList<>();
	private static Scanner scnr = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean isRunning = true;
		
		System.out.println("*** Playlist Manager ***");
		
		while (isRunning) {
			System.out.println("\nOptions: \nadd \nremove \ncount \nplay \nshuffle \nreverse \nsave \nquit");
            String command = scnr.nextLine().toLowerCase();
            
            switch (command) {
            	case "add" : addSong(); break;
            	case "remove" : removeSong(); break;
            	case "count" : printSongCount(); break;
            	case "play" : play(); break;
            	case "shuffle" : shuffle(); break;
            	case "reverse" : reverse(); break;
            	case "save" : save(); break;
            	case "load" : load(); break;
            	case "quit" : isRunning = false; break;
            	default : System.out.println("Unknown Command");
            }
		}
		
		System.out.println("Exiting Playlist Manager");
	}
	
	/**
     * Adds a song to the playlist.
     */
	private static void addSong() {
		System.out.println(": add");
		System.out.print("Enter artist: ");
		String artist = scnr.nextLine();
		System.out.print("Enter song title: ");
		String title = scnr.nextLine();
		Song song = new Song(artist, title);
		songs.add(song);
		
		System.out.println(song.getTitle() + " Added to playlist");
	}
	
	/**
     * Removes a song from the playlist if there are at least two songs.
     */
	private static void removeSong() {		
		if (songs.size() >= 2) {
			System.out.println(": remove");
			System.out.println("Enter artist: ");
			String artist = scnr.nextLine();
			System.out.println("Enter song title: ");
			String title = scnr.nextLine();
			Song song = new Song(artist, title);
			
			boolean removed = songs.remove(song); // returns true if song was removed
			
			if (removed) {
				System.out.println(song.getTitle() + " Removed from playlist");
			} else {
				System.out.println("Song not found in playlist");
			}
		} else {
			System.out.println("Playlist needs at least 1 song, cannot remove");
		}
	}
	
	/**
     * Returns the number of songs in the playlist.
     */
	private static int songCount() {
		//return songs.size();
		return songs.count();
	}
	
	/**
     * Prints the number of songs in the playlist.
     */
	private static void printSongCount() {
		System.out.println(": count");
		System.out.println(songCount());
	}
	
	/**
     * Plays all songs in the playlist in order.
     */
	private static void play() {
		System.out.println(": play");
		for (int i = 0; i < songs.size(); i++) {
			System.out.println(songs.get(i));
		}
	}

	/**
     * Shuffles the playlist randomly.
     */
	private static void shuffle() {
		System.out.println(": shuffle");
		int size = songs.size();
		Random rndm = new Random();
		
		for (int i = 0; i < size; i++) {
			int val = rndm.nextInt(size);
			
			Song temp = songs.get(i);
			songs.set(i, songs.get(val));
			songs.set(val,  temp);
		}
		
		//System.out.println("Playlist shuffled");
	}
	
	/**
     * Reverses the order of songs in the playlist.
     */
	private static void reverse() {
		System.out.println(": reverse");
		songs.reverse();
	}
	
	/**
     * Saves the playlist to a file.
     */
	private static void save() {
		System.out.println(": save");
		System.out.println("Enter file name to save to: ");
		String fileName = scnr.nextLine();
		
		try {
			PrintWriter writer = new PrintWriter(fileName);
			
			for (int i = 0; i < songs.size(); i++) {
				Song song = songs.get(i);
				writer.println(song.getArtist() + " - " + song.getTitle());
			}
			
			writer.close();
			System.out.println("Playlist saved to " + fileName);
		} catch (FileNotFoundException e) {
			System.out.println("Error saving playlist: " + e.getMessage());
		}
	}
	
	/**
     * Loads a playlist from a file.
     */
	private static void load() {
		System.out.println(": load");
		System.out.println("Enter file name to load: ");
		String fileName = scnr.nextLine();
		
		if (fileName.isEmpty()) {
			System.out.println("File name cannot  be empty");
			return;
		}
		
		File file = new File(fileName);
		
		if (!file.exists()) {
			System.out.println("File not found: " + fileName);
			return;
		}
		
		try (Scanner scnr = new Scanner(file)) { // Try to open file
	        songs.clear(); // Clear current playlist

	        while (scnr.hasNextLine()) { // Loop all lines in file
	            String line = scnr.nextLine();

	            String[] parts = line.split("-"); // Split artist and title

	            if (parts.length != 2) {
	                continue; // skip invalid lines if its not "artist - title"
	            }

	            String artist = parts[0].trim(); // remove spaces
	            String title = parts[1].trim();

	            Song song = new Song(artist, title);
	            songs.add(song);
	        }

	        System.out.println("Playlist loaded from " + fileName);
	    } catch (FileNotFoundException e) {
	        System.out.println("Error loading playlist: " + e.getMessage());
	    }
	}
}

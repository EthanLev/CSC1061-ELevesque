package edu.frcc.csc1061jsp25.SentimentAnalysis;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class SentimentAnalysisTest {	
	private static String FILE_NAME = "sentiments.txt";
	
	public static void main(String[] args) throws FileNotFoundException {
	    // Create hash map
	    MyHashMap<String, Integer> sentiments = new MyHashMap<>();
	    
	    // Load data from file to hash map
	    loadFile(sentiments);
	    
	    // User input
	    Scanner scnr = new Scanner(System.in);
	    int totalWords = 0;
	    int totalSentiments = 0;
	    
	    while (true) {
	        System.out.println("Enter a phrase or type END to quit");
	        String command = scnr.nextLine();
	        
	        if (command.equals("END")) {
	            break;
	        }
	        
	        // Remove punctuation, convert to lowercase, and split the words
	        String[] words = command.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
	        
	        for (String word : words) {
				System.out.println(word);
				
				Integer sentiment = sentiments.get(word);
				//System.out.println(sentiments.get(word));
				
				if (sentiment != null) {
					//System.out.println("Found word: " + word + " with sentiment: " + sentiment);
					totalSentiments += sentiment;
				} else {
					//System.out.println("No sentiment found for word: " + word);
				}
			}
	        
	        System.out.println("Total sentiment for: " + totalSentiments);
	    }
	    
	    scnr.close();
	}

	
	private static void loadFile(MyHashMap<String, Integer> sentiments) throws FileNotFoundException {
	    Scanner scnr = new Scanner(new File(FILE_NAME));
	    
	    while (scnr.hasNextLine()) {
	        String line = scnr.nextLine();
	        String[] parts = line.split("\t"); // Split key and value from tab
	        
	        if (parts.length == 2) { // Separate into parts
	            String word = parts[0].toLowerCase(); // Get word key
	            int sentiment = Integer.parseInt(parts[1]); // Get sentiment value
	            
	            sentiments.put(word, sentiment); // Add to map
	            //System.out.println("Loaded: " + word + " with sentiment: " + sentiment);
	        }
	    }
	    
	    scnr.close();
	}
}

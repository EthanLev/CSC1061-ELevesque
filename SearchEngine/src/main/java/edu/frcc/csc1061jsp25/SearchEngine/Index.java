package edu.frcc.csc1061jsp25.SearchEngine;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.jsoup.select.Elements;

public class Index {
	private Map<String, Set<TermCounter>> index = new HashMap<>();
	
	
	public void add(String word, TermCounter tc) {
		Set<TermCounter> set = index.get(word);
		
		if (set == null) {
			set = new HashSet<>(); // If term counter set is null, create one
		}
		
		set.add(tc); // Add term counter to set
		index.put(word, set); // Add word in the term counter set
	}
	
	public String get(String word) {
		Set<TermCounter> set = index.get(word);
		
		if (set == null) {
			return "";
		}
		
		String str = "";
		
		for (TermCounter tc : set) { 
			str += tc.getLabel() + "\n";
		}
		
		return str;
	}
	
	public void indexPage(String url, Elements paragraphs) {
		TermCounter counter = new TermCounter(url); // Create new term counter
		counter.processElements(paragraphs); // Process all paragraphs on page
		
		// Add every term to the index
		for (String word : counter.getKeySet()) {
			add(word, counter);
		}
	}
	
	public void printIndex() {
		for (String word : index.keySet()) {
			System.out.println(word);
			Set<TermCounter> set = index.get(word);
			
			for (TermCounter tc : set) {
				System.out.println("\t" + tc.getLabel());
			}
		}
	}
}

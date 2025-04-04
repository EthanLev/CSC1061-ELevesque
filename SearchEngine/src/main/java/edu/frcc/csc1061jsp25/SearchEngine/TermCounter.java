package edu.frcc.csc1061jsp25.SearchEngine;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

public class TermCounter {
	private Map<String, Integer> map;
	private String url = "";
	
	public TermCounter(String url) {
		this.url = url;
		this.map = new HashMap<>();
	}
	
	public String getLabel() {
		return url;
	}
	
	public void add(String term, int count) {
		map.put(term, count);
	}
	
	public void processElements(Elements paragraphs) {
		for (Node node : paragraphs) {
			processTree(node);
		}
	}
	
	private void processTree(Node root) {
		for (Node node : new WikiNodeIterable(root)) {
			if (node instanceof TextNode) {
				processText(((TextNode)node).text());
			}
		}
	}
	
	private void processText(String text) { // Can add a space in replaceAll()
		String[] words = text.replaceAll("\\pP", "").toLowerCase().split("\\s+"); // Take out all punctuation
		
		for (String word : words) {
			incrementTermCount(word);
		}
	}
	
	public void incrementTermCount(String word) {
		Integer value = map.get(word);
		
		if (value == null) {
			map.put(word, 1);
		} else {
			map.put(word, value + 1);
		}
	}

	public void printCount() {
		for (String key : map.keySet()) { // Iterate through map keys
			int count = map.get(key);
			System.out.println(key + ", " + count);
		}
	}
	
	public static void main(String[] args) throws IOException {
		String url = "https://en.wikipedia.org/wiki/Java_(programming_language)";
		
		WikiFetcher wf = new WikiFetcher();
		Elements paragraphs = wf.fetchWikipedia(url);
		
		TermCounter counter = new TermCounter(url);
		counter.processElements(paragraphs);
		
		counter.printCount();
	}
}

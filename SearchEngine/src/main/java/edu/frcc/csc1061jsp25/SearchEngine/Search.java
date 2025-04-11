package edu.frcc.csc1061jsp25.SearchEngine;

import java.io.IOException;

import org.jsoup.select.Elements;

public class Search {

	public static void main(String[] args) throws IOException {
		
		String url = "https://en.wikipedia.org/wiki/Java_(programming_language)";
		
		WikiFetcher wf = new WikiFetcher();
		Elements paragraphs = wf.fetchWikipedia(url);
		
		TermCounter counter = new TermCounter(url);
		counter.processElements(paragraphs);
		
		counter.printCount();
	}
}

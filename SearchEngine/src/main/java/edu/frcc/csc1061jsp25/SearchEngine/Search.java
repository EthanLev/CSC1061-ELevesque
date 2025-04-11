package edu.frcc.csc1061jsp25.SearchEngine;

import java.io.IOException;
import java.util.Scanner;

import org.jsoup.select.Elements;

public class Search {
	private static Scanner scnr = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		Index index = new Index();
		WikiFetcher wf = new WikiFetcher();
		
		String url = "https://en.wikipedia.org/wiki/Java_(programming_language)";
		Elements paragraphs = wf.fetchWikipedia(url); // Get paragraphs from web page
		index.indexPage(url, paragraphs);
		
		url = "https://en.wikipedia.org/wiki/Programming_language";
		paragraphs = wf.fetchWikipedia(url); // Get paragraphs from web page
		index.indexPage(url, paragraphs);
		
		TermCounter counter = new TermCounter(url);
		counter.processElements(paragraphs);
		
		//counter.printCount();
		//index.printIndex();
		
		System.out.println("Enter Search Term: ");
	}
}

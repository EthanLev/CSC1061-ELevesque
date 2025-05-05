package edu.frcc.csc1061jsp25.GettingToPhilosophy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

public class WikiPhilosophy {

    final static List<String> visited = new ArrayList<String>();
    final static WikiFetcher wf = new WikiFetcher();

    /**
     * Tests a conjecture about Wikipedia and Philosophy.
     *
     * https://en.wikipedia.org/wiki/Wikipedia:Getting_to_Philosophy
     *
     * 1. Clicking on the first non-parenthesized, non-italicized link
     * 2. Ignoring external links, links to the current page, or red links
     * 3. Stopping when reaching "Philosophy", a page with no links or a page
     *    that does not exist, or when a loop occurs
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        String destination = "https://en.wikipedia.org/wiki/Philosophy";
        String source = "https://en.wikipedia.org/wiki/Java_(programming_language)";

        testConjecture(destination, source, 20);
    }

    /**
     * Starts from given URL and follows first link until it finds the destination or exceeds the limit.
     *
     * @param destination
     * @param source
     * @throws IOException
     */
    public static void testConjecture(String destination, String source, int limit) throws IOException {
        Document doc = null;
        Connection conn = Jsoup.connect(source);
        
        try 
        {
            doc = conn.get();
            //System.out.println("Successfully fetched the source page: " + source);
        }
        catch (Exception e)
        {
            System.out.println("Could not open page. Exiting...");
            e.printStackTrace();
            System.exit(-1);
        }

        // select the content text and pull out the paragraphs.
        Element content = doc.getElementById("mw-content-text");
        Elements paragraphs = content.select("p");

        for (Element para : paragraphs) {
            Iterable<Node> iter = new WikiNodeIterable(para);
            for (Node node : iter) {
            	//System.out.println("Processing node: " + node);
            	// If this node is a text node make sure you are not within parentheses
            	if (node instanceof TextNode) {
            		TextNode textNode = (TextNode) node;
            		String text = textNode.text();
            		
            		if (insideParentheses(text)) {
            			continue; // skip if inside parentheses
            		}
            	}
            	
            	if (node instanceof Element) {
            		Element element = (Element) node;
            		String href = element.attr("href");
            		
            		if (href != null && !href.isEmpty() && !href.startsWith("#")) {
            			String next = "https://en.wikipedia.org" + href; // make new url
            			
            			if (visited.contains(next)) {
            				System.out.println("Loop. Exiting");
            				return;
            			}
            			
            			visited.add(next);
            			System.out.println(next);
            			
            			// until you reach your objective
            			if (next.equals(destination)) {
                			System.out.println("Reached Destination - " + destination);
                			return;
                		}
            			
            			// until limit is reached
                    	if (limit <= 0) {
                			System.out.println("Reached limit");
                			return;
                		}  
            			
            			// follow the link recursively by calling testConjecture() 
                		testConjecture(destination, next, limit - 1);
                		return;
            		}
            	}      	
            }
        }
    }
    
    // check if the parentheses are valid (open then closed)
    // Use stack, check for open parentheses and push it on, when closed parentheses, pop out of stack
    private static boolean insideParentheses(String text) {
        Stack<Character> parentheses = new Stack<>();
        
        for (char c : text.toCharArray()) {
            if (c == '(') {
                parentheses.push(c);
            } else if (c == ')') {
                if (!parentheses.isEmpty()) { 
                    parentheses.pop();
                } else {
                    // if stack is empty and a ')' is found, it means an unmatched closing parenthesis
                    return false;
                }
            }
        }

     // If stack is empty, no parentheses
        return parentheses.isEmpty();
    }
}


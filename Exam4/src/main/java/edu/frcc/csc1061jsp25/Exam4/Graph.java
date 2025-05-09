package edu.frcc.csc1061jsp25.Exam4;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

public class Graph<E> {
	public List<Vertex> vertices = new ArrayList<>();
	
	private class Vertex {
		private E elem; // name/value or vertex
		private List<Edge> neighbors = new ArrayList<>(); // list of edges/roads connected to this vertex
		
		public Vertex (E elem) {
			this.elem = elem;
		}

		public E getKey() {
			return elem;
		}
		
		@Override
		public boolean equals(Object other) {
			if (!(other instanceof Graph.Vertex))
				return false;
			
			if (elem.equals(((Vertex)other).elem)) {
				return true;
			}
			return false;		
		}
		
		@Override 
		public String toString() {
			return elem.toString();
		}
	}

	
	private class Edge implements Comparable<Edge> {
		private Vertex s; // source/start
		private Vertex d; // destination
		private int weight;

		public Edge(Vertex s, Vertex d, int weight) {
			this.s = s;
			this.d = d;
			this.weight = weight;
		}

		public boolean equals(Object edge) {
			return s.equals(((Edge) edge).s) && d.equals(((Edge) edge).d);
		}

		@Override
		public int compareTo(Graph<E>.Edge o) {
			return (int) (weight - o.weight);
		}
	}

	public Graph(List<Vertex> vertices) {
		for (Vertex vertex : vertices) {
			addVertex(new Vertex(vertex.getKey()));
		}
	}
	
	public Graph(List<E> vertices, E[][] edges) {
		for (E ver : vertices) {
			addVertex(new Vertex(ver));
		}
		createAdjacencyLists(edges);
	}

	public boolean addVertex(Vertex vertex) {
		if (!vertices.contains(vertex)) {
			vertices.add(vertex);
			return true;
		} else {
			return false;
		}

	}

	public boolean addEdge(Edge edge) {
		
		List<Edge> neighbors = edge.s.neighbors;
		if (!neighbors.contains(edge)) {
			neighbors.add(edge);
			return true;
		} else {
			return false;
		}
	}

	private Vertex findVertex(E key) {
		for(Vertex v : vertices) {
			if (v.elem.equals(key)) {
				return v;
			}
		}
		return null;
	}
	private void createAdjacencyLists(E[][] edges) {
		for (int i = 0; i < edges.length; i++) {
			addEdge(new Edge(findVertex(edges[i][0]), findVertex(edges[i][1]), (int)edges[i][2]));
		}
	}

	public void printEdges() {
		for (int i = 0; i < vertices.size(); i++) {
			System.out.print("Vertex: " + vertices.get(i).toString() + ":");
			List<Edge> neighbors = vertices.get(i).neighbors;
			for (Edge edge : neighbors) {
				System.out.print("(" + edge.s + ", " + edge.d + ", " + edge.weight + ")");
			}
			System.out.println();
		}
	}

	public List<Vertex> getChildNodes(Vertex vertex) {
		List<Vertex> childNodes = new ArrayList<>();
		List<Edge> neighbors = vertex.neighbors;
		for (Edge edge : neighbors) {
			childNodes.add(edge.d);
		}
		return childNodes;
	}
	
	/* TODO: Implement the DFS algorithm for a graph either recursively
	** or iteratively using a stack. It should return a list of all the 
	** vertices in the pre-order depth-first traversal.
	*/
	public List<Vertex> dfs(Vertex root) {
		List<Vertex> visited = new ArrayList<>(); // List of visited
		Deque<Vertex> stack = new ArrayDeque<>(); // Stack for which vertex ti visit next
		
		stack.push(root); // Start at root
		
		while (!stack.isEmpty()) {
			Vertex current = stack.pop(); // Get current vertex
			
			// if vertex hasn't been visited
			if (!visited.contains(current)) {
				visited.add(current); // mark as visited
				
				List<Vertex> children = getChildNodes(current);
				
				
			}
		}
		
		return visited;
	}

	/* TODO: Implement the BFS algorithm for a graph. It should return a list 
	** of all the vertices in the breadth-first traversal.
	*/
	public List<E> bfs() {
		// List to store the result
	    List<E> result = new ArrayList<>();
	    
	    // Queue to control the order of visiting vertices (FIFO behavior)
	    Deque<Vertex> queue = new ArrayDeque<>();
	    
	    // List to keep track of visited vertices
	    List<Vertex> visited = new ArrayList<>();

	    // If there are no vertices, return empty list
	    if (vertices.isEmpty()) {
	        return result;
	    }

	    // Start from the first vertex in the list
	    Vertex start = vertices.get(0);
	    queue.offer(start);

	    while (!queue.isEmpty()) {
	        // Get the vertex from the front of the queue
	        Vertex current = queue.poll();

	        // If we haven't visited this vertex yet
	        if (!visited.contains(current)) {
	            // Mark it as visited
	            visited.add(current);

	            // Add the element (key) to the result
	            result.add(current.getKey());

	            // Add all child nodes to the queue
	            for (Vertex neighbor : getChildNodes(current)) {
	                queue.offer(neighbor);
	            }
	        }
	    }

	    return result;
	}
	

	/* TODO: Create a spanning tree using Kruskal's Algorithm and return it. 
	** The spanning tree will be a new graph
	*/
	public Graph<E> findMinimumSpanningTree() {
		
		return null;
	}
}

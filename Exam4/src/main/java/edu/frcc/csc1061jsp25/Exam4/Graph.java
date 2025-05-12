package edu.frcc.csc1061jsp25.Exam4;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
				
				for (Vertex neighbor : this.getChildNodes(current)) {
					stack.push(neighbor); // add to stack 
				}
			}
		}
		
		return visited;
	}

	/* TODO: Implement the BFS algorithm for a graph. It should return a list 
	** of all the vertices in the breadth-first traversal.
	*/
	public List<E> bfs() {
	    Deque<Vertex> queue = new ArrayDeque<>(); // Queue to track vertices
	    List<E> visited = new ArrayList<>(); // List to keep track of visited vertices

	    if (vertices.isEmpty()) {
	        return visited;
	    }
	    
	    Vertex root = vertices.get(0); // Start from root
	    queue.add(root);

	    while (!queue.isEmpty()) {
	        Vertex current = queue.poll(); // take vertex from front of queue

	        if (!visited.contains(current)) {
	            visited.add(current.getKey()); // mark visited

	            for (Vertex neighbor : this.getChildNodes(current)) {
	                queue.add(neighbor); // add all neighbors to queue
	            }
	        }
	    }

	    return visited; 
	}
	
	/* TODO: Create a spanning tree using Kruskal's Algorithm and return it. 
	** The spanning tree will be a new graph
	*/
	public Graph<E> findMinimumSpanningTree() {
		List<Edge> edges = new ArrayList<>(); 
		
		for (Vertex v : vertices) {
			edges.addAll(v.neighbors);
		}
		
		List<Edge> sortedEdges = edges;
		Collections.sort(sortedEdges); // Sort edges by weight
		
		Graph<E> tree = new Graph<>(new ArrayList<>()); // empty graph
		
		UnionFind uf = new UnionFind(vertices.size()); // Instantiate union find to check for cycles/loops in graph
		
		for (Vertex v : vertices) {
			tree.addVertex(tree.new Vertex(v.getKey())); // Add new vertices to tree
		}
		
		for (Edge edge : sortedEdges) {
			int src = vertices.indexOf(edge.s); // source index
			int des = vertices.indexOf(edge.d); // destination index
			
			// if source and destionation are in different lists means no cycle
			if (uf.find(src) != uf.find(des)) {
				// add new edge with same source, destination, adn weight to tree
				tree.addEdge(new Edge(tree.vertices.get(src), tree.vertices.get(des), edge.weight)); 
				
				uf.union(src, des);
			}
		}
		
		return tree;
	}
	
	private class UnionFind {
		private int[] parent;

	    public UnionFind(int size) {
	        parent = new int[size];  // initialize parent array
	        for (int i = 0; i < size; i++) {
	            parent[i] = i;  // set each vertex is its own parent 
	        }
	    }

	    // find the root of the set 
	    public int find(int i) {
	        if (parent[i] != i) {
	            parent[i] = find(parent[i]);  
	        }
	        return parent[i];
	    }

	    // union the sets containing elements i and j
	    public void union(int i, int j) {
	        int rootI = this.find(i);
	        int rootJ = this.find(j);
	        if (rootI != rootJ) {
	            parent[rootI] = rootJ;  
	        }
	    }
	}
}

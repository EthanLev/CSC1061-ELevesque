package edu.frcc.csc1061jsp25.MyTreeMap;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class MyTreeMap<K, V> implements Map<K, V>, Iterable<V> {
	
	private Node root = null;
	private int size = 0;
	
	private class Node {
		private K key;
		private V value;
		
		private Node left;
		private Node right;
		private Node parent;
		
		public Node(K key, V value)  {
			this.key = key;
			this.value = value;
		}
	}
	
	// METHODS
	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public boolean containsKey(Object key) {
		if (get(key) != null) {
			return true;
		}
		
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		return false;
	}

	@Override
	public V get(Object key) {
		Node node = root; // Current node
		Comparable<K> k = (Comparable<K>) key; // Cast comparable
		
		while (node != null) {
			if (k.compareTo(node.key) < 0) {
				node = node.left;
			} else if (k.compareTo(node.key) > 0) {
				node = node.right;
			} else {
				return node.value;
			}
		}
		
		return null;
	}

	@Override
	public V put(K key, V value) {
		if (root == null) { // If no nodes
			Node newNode = new Node(key, value); // Create new node
			root = newNode; // Set new node as root
			size++;
			return null;
		}
		
		Node node = root; // Current node
		Node parent = null;
		
		Comparable<K> k = (Comparable<K>) key; // Cast comparable
		
		while (node != null) {
			if (k.compareTo(node.key) < 0) { // Move left
				parent = node;
				node = node.left;
			} else if (k.compareTo(node.key) > 0) { // Move right
				parent = node;
				node = node.right;
			} else {
				V oldVal = node.value;
				node.value = value;
				return oldVal;
			}
		}
		
		Node newNode = new Node(key, value);
		
		if (k.compareTo(parent.key) < 0) {
			parent.left = newNode;
		} else {
			parent.right = newNode;
		}
		
		size++;
		
		return null;
	}

	// HOMEWORK 
	// Download and use TreeMapTest from D2L
	// Copy code to own tree map
	// Case 1: if remove is a leaf node, keep track of parent, cut left or right side of parent
	// Case 2: if remove is one child, change child to parent
	// Case 3: if two children
	// Use recursive ?
	@Override
	public V remove(Object key) {
		return null;
	}

	@Override
	public void putAll(Map m) {
		
	}

	@Override
	public void clear() {
		
	}

	@Override
	public Set keySet() {
		return null;
	}

	@Override
	public Collection values() {
		return null;
	}

	@Override
	public Set entrySet() {
		return null;
	}

	
	//ITERATOR
	@Override
	public Iterator<V> iterator() {
		
		return new NonRecursiveIterator();
	}	
	
	
	private class NonRecursiveIterator implements Iterator<V> {
		private Deque<Node> stack = new ArrayDeque<>();
		
		public NonRecursiveIterator() {
			pushOnStack(root);
		}
		
		public void pushOnStack(Node node) {
			Node current = node;
			
			while (current != null) {
				stack.push(current);
				current = current.left;
			}
		}

		@Override
		public boolean hasNext() {
			return !stack.isEmpty();
		}

		@Override
		public V next() {
			Node node = stack.pop();
			V value = node.value;
			
			pushOnStack(node.right);
			
			return value;
		}
	}
	
	public class RecursiveIterator implements Iterator<V> {
		private List<V> list = new LinkedList<>();
		private Queue<V> queue = new ArrayDeque<>();
		
		public RecursiveIterator() {
			inorder(root);
			
		}
		
		// PREORDER
		public void preorder(Node node) {
			if (node == null) {
				return;
			}
			
			list.add(node.value);
			
			preorder(node.left);
			preorder(node.right);
		}
		
		// POSTORDER
		public void postorder(Node node) {
			if (node == null) {
				return;
			}
			
			postorder(node.left);
			postorder(node.right);
			
			list.add(node.value);
		}
		
		// INORDER
		public void inorder(Node node) {
			if (node == null) {
				return;
			}
			
			inorder(node.left);
			list.add(node.value);
			inorder(node.right);
		}

		@Override
		public boolean hasNext() {
			return !list.isEmpty();
		}

		@Override
		public V next() {
			return list.remove(0);
		}
	}
}

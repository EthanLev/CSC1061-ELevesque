package edu.frcc.csc1061jsp25.MyAVLTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class MyAVLTree<K, V> implements Map<K, V>, Iterable<edu.frcc.csc1061jsp25.MyAVLTree.MyAVLTree.Node> {
	
	private Node root = null;
	private int size = 0;
	private List<Node> path = new ArrayList<>();
	
	protected class Node {
		private K key;
		private V value;
		
		private Node left;
		private Node right;
		private int height;
		
		public Node(K key, V value)  {
			this.key = key;
			this.value = value;
			height = 0;
		}

		// Getters and Setters
		public K getKey() {
			return key;
		}

		public void setKey(K key) {
			this.key = key;
		}

		public V getValue() {
			return value;
		}

		public void setValue(V value) {
			this.value = value;
		}

		public Node getLeft() {
			return left;
		}

		public void setLeft(Node left) {
			this.left = left;
		}

		public Node getRight() {
			return right;
		}

		public void setRight(Node right) {
			this.right = right;
		}

		public int getHeight() {
			return height;
		}

		public void setHeight(int height) {
			this.height = height;
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
			updateHeight(root);
			return null;
		}
		
		Node current = root; // Current node
		Node parent = null;
		path.clear(); // Clear path
		
		Comparable<K> k = (Comparable<K>) key; // Cast comparable
		
		while (current != null) {
			path.add(current); // Add current to path
			if (k.compareTo(current.key) < 0) { // Move left
				parent = current;
				current = current.left;
			} else if (k.compareTo(current.key) > 0) { // Move right
				parent = current;
				current = current.right;
			} else {
				V oldVal = current.value;
				current.value = value;
				return oldVal;
			}
		}
		
		Node newNode = new Node(key, value);
		
		if (k.compareTo(parent.key) < 0) {
			parent.left = newNode;
		} else {
			parent.right = newNode;
		}
		
		updateHeight(newNode);
		balancePath();
		size++;
		
		return null;
	}
	
	private void updateHeight(Node node) {
		if (node.left == null && node.right == null) { // No adjacent nodes
			node.height = 0;
		} else if (node.left == null) { // No left node
			node.height = node.right.height + 1;
		} else if (node.right == null) { // No right node
			node.height = node.left.height + 1;
		} else { // Left and right node
			node.height = Math.max(node.left.height, node.right.height) + 1;
		}	
	}
	
	private int balanceFactor(Node node) {
		int balanceFactor = 0;
		
		if (node.left == null && node.right == null) {
			System.out.println("Both right and left nodes are null");
			return 0;
		} else if (node.left == null) {
			balanceFactor = node.height;
		} else if (node.right == null) {
			balanceFactor = -node.height;
		} else {
			balanceFactor = node.right.height - node.left.height;
		}
		
		return balanceFactor;
	}
	
	private void balancePath() {
		for (int i = path.size() - 1; i >= 0; i--) {
			Node current = path.get(i);
			updateHeight(current);
			Node parent = null;
			if (i > 0) {
				parent = path.get(i - 1);
			}
			
			switch (balanceFactor(current)) {
				case -2:
					if (balanceFactor(current.left) <= 0) {
						// LL imbalance
						balanceLL(current, parent);
					} else {
						// LR imbalance
						balanceLR(current, parent);
					}
					break;
				case 2:
					if (balanceFactor(current.right) <= 0) {
						// RR imbalance
						balanceRR(current, parent);
					} else {
						// RL imbalance
						balanceRL(current, parent);
					}
					break;
			}
		}
	}
	
	private void balanceLL(Node gp, Node ggp) {
	    Node p = gp.left;

	    gp.left = p.right;
	    p.right = gp;

	    if (gp == root) {
	        root = p;
	    } else {
	        if (ggp.left == gp) {
	            ggp.left = p;
	        } else {
	            ggp.right = p;
	        }
	    }

	    updateHeight(gp);
	    updateHeight(p);
	}

	private void balanceLR(Node gp, Node ggp) {
	    Node p = gp.left;
	    Node c = p.right;

	    p.right = c.left;
	    gp.left = c.right;

	    c.left = p;
	    c.right = gp;

	    if (gp == root) {
	        root = c;
	    } else {
	        if (ggp.left == gp) {
	            ggp.left = c;
	        } else {
	            ggp.right = c;
	        }
	    }

	    updateHeight(p);
	    updateHeight(gp);
	    updateHeight(c);
	}

	private void balanceRR(Node gp, Node ggp) {
	    Node p = gp.right;

	    gp.right = p.left;
	    p.left = gp;

	    if (gp == root) {
	        root = p;
	    } else {
	        if (ggp.left == gp) {
	            ggp.left = p;
	        } else {
	            ggp.right = p;
	        }
	    }

	    updateHeight(gp);
	    updateHeight(p);
	}

	private void balanceRL(Node gp, Node ggp) {
	    if (gp == null || gp.right == null) {
	        return;
	    }

	    Node p = gp.right;  
	    Node c = p.left;  
	    
	    if (c == null) {
	        return;
	    }

	    p.left = c.right;  
	    gp.right = c.left; 

	    c.right = p;  
	    c.left = gp; 
	
	    if (gp == root) {
	        root = c;
	    } else {
	        if (ggp != null) {
	            if (ggp.left == gp) {
	                ggp.left = c;
	            } else {
	                ggp.right = c;
	            }
	        }
	    }

	    updateHeight(p);
	    updateHeight(gp);
	    updateHeight(c);
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
	public Iterator iterator() { // public Iterator<V> iterator
		
		return new NonRecursiveIterator();
	}	
	
	
	private class NonRecursiveIterator implements Iterator<Node> { // Iterator<V>
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
		public Node next() { // public V next
			Node node = stack.pop();
			V value = node.value;
			
			pushOnStack(node.right);
			
			return node; // return value
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

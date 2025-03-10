package edu.frcc.csc1061jsp25.ArrayAndLinkedList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedList<E> implements List <E>{
	
	private Node head;
	private int size;
	
	private class Node {
		E data;
		Node next;
		
		public Node(E data) {
			this.data = data;
			next = null;
		}
	}
	
	public MyLinkedList() {
		head = null;
		size = 0;
	}

	@Override
	public int size() {
//		int count = 0;
//		for (Node node = head; node != null; node = node.next) {
//			count++;
//			size = count;
//		}
//		return count;
		
		return size;
	}

	@Override
	public boolean isEmpty() {
		//return head == null;
		return size == 0;
	}

	@Override
	public boolean contains(Object o) {
		return false;
	}

	@Override
	public Iterator iterator() {
		return null;
	}

	@Override
	public Object[] toArray() {
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		return null;
	}

	@Override
	public boolean add(E e) {
		Node newNode = new Node(e);
		if (head == null) {
			head = newNode;
		} else {
			Node node = null;
			
			for (node = head; node != null; node = node.next) {
				
			}
			
			node.next = newNode;
		}
		
		size++;
		return true;
	}

	@Override
	public boolean remove(Object o) {
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		head = null;
		size = 0;
	}

	@Override
	public E get(int index) {
		Node node = getNode(index);
		
		return node.data;
	}

	@Override
	public E set(int index, E element) {
		Node node = getNode(index);
		
		E old = node.data;
		node.data = element;
		
		return old;
	}
	
	private Node getNode(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		
		Node node = head;
		for (int i = 0; i < index; i++) {
			node = node.next;
		}
		
		return node;
	}

	@Override
	public void add(int index, E element) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		
		Node newNode = new Node(element);
		
		if (index == 0) {
			newNode.next = head;
			head = newNode;
		} else {
			Node prevNode = getNode(index - 1);
			newNode.next = prevNode.next;
			
			prevNode.next = newNode;
		}
		
		size++;
	}

	@Override
	public E remove(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		
		Node node = getNode(index);
		E data = node.data;
		
		if (index == 0) {
			node.next = head;
		} else {
			Node prevNode = getNode(index - 1);
			prevNode = prevNode.next.next; // Skip the node we are removing
		}
		
		return null;
	}

	@Override
	public int indexOf(Object o) {
		int index = 0;
		
		for (Node node = head; node != null; node = node.next, index++) {
			if (o.equals(node.data)) {
				return index;
			}
			
			//index++;
		}
		
		return -1;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
}

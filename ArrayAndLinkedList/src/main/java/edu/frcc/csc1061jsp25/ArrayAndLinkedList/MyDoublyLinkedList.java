package edu.frcc.csc1061jsp25.ArrayAndLinkedList;


import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyDoublyLinkedList<E> implements List <E>{
	
	private Node head;
	private Node tail;
	private int size;
	
	private class Node {
		E data;
		Node next;
		Node prev;
		
		public Node(E data) {
			this.data = data;
			next = null;
			prev = null;
		}
	}
	
	public MyDoublyLinkedList() {
		head = null;
		tail = null;
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
		if (indexOf(o) != -1) {
			return true;
		}
		
		return false;
	}

	@Override
	public Iterator iterator() {
		return null;
	}

	@Override
	public Object[] toArray() {
		Object[] objects = new Object[size];
		int i = 0;
		
		for (Node node = head; node != null; node = node.next) {
			objects[i] = node.data;
			i++;
		}
		
		return objects;
	}

	@Override
	public Object[] toArray(Object[] a) {
		return null;
	}

	@Override
	public boolean add(E e) {
		Node newNode = new Node(e);
		
		if (head == null) { // If list is empty
			head = newNode; // Beginning of list = new Node
		} else {
			tail.next = newNode; // End of list .next = new Node
			newNode.prev = tail;
		}
		
		tail = newNode;
		size++;
		return true;
	}

	@Override
	public boolean remove(Object o) {
		int index = indexOf(o);
		if (index < 0 || index >= size) {
			return false;
		}
		remove(index);
		return true;
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
		
		size--;
		return data;
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
		int index = size - 1;
		int foundIndex = -1;
		
		for (Node node = tail; node != null; node = node.prev, index--) {
			if (o.equals(node.data)) {
				foundIndex = index;
				break;
				
			}
			
			//index--;
		}
		
		return foundIndex;
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

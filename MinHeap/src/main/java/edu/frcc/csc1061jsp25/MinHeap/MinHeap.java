package edu.frcc.csc1061jsp25.MinHeap;

import java.util.ArrayList;
import java.util.List;

public class MinHeap <E extends Comparable<E>> {
	private List<E> array;
	
	public MinHeap() {
		array = new ArrayList<>();
	}
	
	public boolean isEmpty() {
		return array.isEmpty();
		// return array.size == 0;
	}
	
	public int size() {
		return array.size();
	}
	
	public List<E> getHeap() {
		return array;
	}
	
	/**
	 * Returns left child index
	 * @param index
	 * @return int
	 */
	private int leftChild(int index) {
		int child = (2 * index) + 1;
		
		if (child >= array.size()) {
			return -1;
		}
		
		return child;
	}
	
	/**
	 * Returns right child index
	 * @param index
	 * @return int
	 */
	private int rightChild(int index) {
		int child = (2 * index) + 2;
		
		return child >= array.size() ? -1 : child;  // return child or -1 on condition
													// Condition ? false : otherwise/true
	}
	
	/**
	 * Returns parent index
	 * @param index
	 * @return int
	 */
	private int parent(int index) {
		if (index <= 0) {
			return -1;
		} else {
			return (index - 1)/2;
		}
	}
	
	public void add(E entry) {
		array.add(entry); // Add to end of array
		swimUp(array.size() - 1);
	}
	
	public E remove(int index) {
		swap(index, array.size() - 1); // Swap with end of array
		E removed = array.remove(array.size() - 1); // Remove and save node at end of array
		
		if (array.size() > 0) {
			shiftDown(index);
		}		
		
		return removed;
	}
	
	public E remove() {
		return remove(0);
	}
	
	private void swimUp(int current) {
		int parent = parent(current);
		
		while (current != 0 && array.get(current).compareTo(array.get(parent)) < 0) {
			// Swap with parent
			swap(current, parent);
			current = parent;
			parent = parent(current);
		}
	}
	
	private void shiftDown(int current) {
		while (!isLeafNode(current)) {
			int leftChild = leftChild(current);
			int rightChild = rightChild(current);
			
			E leftChildEntry = array.get(leftChild);
			E childEntry = leftChildEntry;
			int child = leftChild;
			
			if (rightChild > -1) { // Valid Index
				E rightChildEntry = array.get(rightChild);
				
				if (rightChildEntry.compareTo(leftChildEntry) < 0) {
					childEntry = rightChildEntry;
					child = rightChild;
				}
			}
			
			if (array.get(current).compareTo(childEntry) > 0) {
				swap(current, child);
				current = child;
			} else {
				break;
			}
		}
	}
	
	private void swap(int index1, int index2) {
		E temp = array.get(index1); // Save index1 to temp
		array.set(index1, array.get(index2)); // Set index1 to index2
		array.set(index2, temp); // Set temp to index2
	}
	
	private boolean isLeafNode(int index) {
		return (index >= array.size()/2) && index < array.size(); 
	}
}

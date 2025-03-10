package edu.frcc.csc1061jsp25.ArrayAndLinkedList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<T> implements List <T>{
	
	private T[] array;
	private int size;
	
	@SuppressWarnings("unchecked")
	public MyArrayList() {
		array = (T[]) new Object[4];
		size = 0;
	}
	

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public boolean contains(Object o) {
		return false;
	}

	@Override
	public Iterator<T> iterator() {
		return null;
	}

	@Override
	public Object[] toArray() {
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return null;
	}

	@Override
	public boolean add(T e) {
		if (array.length <= size)  { // If there is space in the array
			@SuppressWarnings("unchecked")
			T[] newArray = (T[]) new Object[array.length * 2]; // Instantiate new array with doubled size
			
			for (int i = 0; i < array.length; i++) {
				newArray[i] = array[i]; // Copy array elements to bigger array
			}
			array = newArray; // Set main array to new array
		}
		
		array[size] = e;
		size++;
		return true;
	}

	@Override
	public boolean remove(Object o) {
		int index = indexOf(o);
		
		if (index < 0) {
			return false;
		} 
		
		for (int i = index; i < size - 1; i++) {
			array[i] = array[i + 1];
		}
		
		size--;
		
		return true;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends T> c) {
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return false;
	}

	@Override
	public void clear() {
		size = 0;
	}

	@Override
	public T get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		
		return array[index];
	}

	@Override
	public T set(int index, T element) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		
		T oldArray = array[index];
		
		array[index] = element;
		
		return oldArray;
	}

	@Override
	public void add(int index, T element) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		// Add element at end 
		add(element);
		// Shift elements to the right
		for (int i = size - 1; i > index; i--) {
			array[i] = array[i - 1];
		}
		// Insert element at index
		array[index] = element;
	}

	@Override
	public T remove(int index) {
		T element = get(index);
		
		for (int i = index; i < size - 1; i++) {
			array[i] = array[i + 1];
		}
		
		size--;
		return element;
	}

	@Override
	public int indexOf(Object o) {
		int index = -1;
		
		for (int i = 0; i < size; i++) {
			if (o.equals(array[i])) {
				index = i;
				break;
			}
		}
		
		return index;
	}

	@Override
	public int lastIndexOf(Object o) {
		int index = -1;
		
		for (int i = 0; i < size; i++) {
			if (o.equals(array[i])) {
				index = i;
			}
		}
		
		return index;
	}

	@Override
	public ListIterator<T> listIterator() {
		return null;
	}

	@Override
	public ListIterator<T> listIterator(int index) {
		return null;
	}

	@Override
	public List<T> subList(int fromIndex, int toIndex) {
		return null;
	}
}

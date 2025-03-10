package edu.frcc.csc1061jsp25.ArrayAndLinkedList;

import java.util.List;

public class MyDoublyLinkedListTest {

	public static void main(String[] args) {
		List<Integer> list = new MyDoublyLinkedList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		for (int i = 0; i < list.size(); i++) {
			int num = list.get(i);
			System.out.println(num + " ");
		}
		
		System.out.println();
		
		list.remove(3); // Removes at index 3
		list.remove(Integer.valueOf(3)); // Removes the value 3
		
		for (int i = 0; i < list.size(); i++) {
			int num = list.get(i);
			System.out.println(num + " ");
		}
		
		System.out.println();
	}

}

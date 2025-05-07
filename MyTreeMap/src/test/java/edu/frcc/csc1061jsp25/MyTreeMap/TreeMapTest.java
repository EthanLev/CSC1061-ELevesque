package edu.frcc.csc1061jsp25.MyTreeMap;

import java.util.Map;

public class TreeMapTest {

	public static void main(String[] args) {
		MyTreeMap<Integer, Integer> map = new MyTreeMap<>();
		map.put(8, 8);
		map.put(12, 12);
		map.put(4, 4);
		map.put(14, 14);
		map.put(10, 10);
		map.put(6, 6);
		map.put(2, 2);
		map.put(1, 1);
		map.put(3, 3);
		map.put(7, 7);
		map.put(5, 5);
		map.put(11, 11);
		map.put(9, 9);
		map.put(13, 13);
		map.put(15, 15);

		printInOrder(map);
		
		int removedKey = map.remove(5);
		System.out.println("Removed key: " + removedKey);
		printInOrder(map);
		
		removedKey = map.remove(6);
		System.out.println("Removed key: " + removedKey);
		printInOrder(map);
		
		removedKey = map.remove(3);
		System.out.println("Removed key: " + removedKey);
		printInOrder(map);
		
		removedKey = map.remove(4);
		System.out.println("Removed key: " + removedKey);
		printInOrder(map);
		
		removedKey = map.remove(8);
		System.out.println("Removed value: " + removedKey);	
		printInOrder(map);
		
	}

	private static void printInOrder(MyTreeMap<Integer, Integer> map) {
		for(Integer value: map) {
			System.out.print(value.toString() + " ");
		}
		System.out.println();
	}
}

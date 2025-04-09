package edu.frcc.csc1061jsp25.MyTreeMap;

import java.util.Map;

public class TreeMapTest {

	public static void main(String[] args) {
		MyTreeMap<Integer, Integer> map = new MyTreeMap<>();
		
		map.put(4,4);
		map.put(7,7);
		map.put(10,10);
		map.put(6,6);
		map.put(1,1);
		map.put(8,8);
		map.put(5,5);
		map.put(2,2);
		map.put(3,3);
		map.put(9,9);
		
		
		for (Integer value : map) {
			System.out.println(value + " ");
		}
		System.out.println();
	}
}

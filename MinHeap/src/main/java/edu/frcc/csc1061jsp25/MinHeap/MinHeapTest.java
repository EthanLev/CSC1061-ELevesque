package edu.frcc.csc1061jsp25.MinHeap;

import java.util.Collections;
import java.util.PriorityQueue;

public class MinHeapTest {

	public static void main(String[] args) {
		int[] nodes = {88, 85, 83, 72, 73, 42, 57, 6, 48, 60};
		
		// MIN HEAP
		MinHeap<Integer> minHeap = new MinHeap<>(); // E is Integer
		
		for (int node : nodes) {
			minHeap.add(node); // For each node in nodes, add to minHeap array
		}
		
		System.out.println("*** Min Heap Removal ***");
		
		while (!minHeap.isEmpty()) {
			System.out.print(minHeap.remove() + " ");
		}
		
		System.out.println();
		
		// PRIORITY QUEUE
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // reverse order
		
		for (int node : nodes) {
			maxHeap.add(node); // add nodes to priority queue
		}
		
		System.out.println("*** Max PQ Heap Removal ***");
		
		while (!maxHeap.isEmpty()) {
			System.out.print(maxHeap.remove() + " ");
		}
		
		System.out.println();
	}
}

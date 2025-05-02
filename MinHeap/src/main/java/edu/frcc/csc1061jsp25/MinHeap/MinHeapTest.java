package edu.frcc.csc1061jsp25.MinHeap;

public class MinHeapTest {

	public static void main(String[] args) {
		int[] nodes = {88, 85, 83, 72, 73, 42, 57, 6, 48, 60};
		
		MinHeap<Integer> minHeap = new MinHeap<>(); // E is Integer
		
		for (int node : nodes) {
			minHeap.add(node); // For each node in nodes, add to minHeap array
		}
		
		System.out.println("MinHeap Removal");
		
		while (!minHeap.isEmpty()) {
			System.out.print(minHeap.remove() + " ");
		}
		
		System.out.println();
	}
}

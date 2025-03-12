import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyHashMap <K, V> implements Map <K,V> {
	private static int INITIAL_NUM_BUCKETS = 4;
	private static double LOAD_FACTOR_THRESHOLD = 0.5;
	
	private List<Entry<K,V>>[] buckets;
	private int size = 0;
	
	private class Entry <K, V> implements Map.Entry<K, V> {
		K key;
		V value;
		
		public Entry(K key, V value) {
			this.key = key;
			this.value = value;
		}

		@Override
		public K getKey() {
			return key;
		}

		@Override
		public V getValue() {
			return value;
		}

		@Override
		public V setValue(V value) {
			V oldVal = this.value;
			oldVal = value;
			return value;
		}
	}
	
	public MyHashMap() {
		buckets = new LinkedList[INITIAL_NUM_BUCKETS];
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
	public boolean containsKey(Object key) {
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		return false;
	}

	@Override
	public V get(Object key) {
		return null;
	}

	@Override
	public V put(K key, V value) {
		int bucketIndex = Math.abs(key.hashCode()) % buckets.length;
		
		if (buckets[bucketIndex] == null) {
			buckets[bucketIndex] = new LinkedList<Entry<K,V>>();
		}
		
		for (Entry<K,V> entry: buckets[bucketIndex]) {
			if (entry.key.equals(key)) {
				V oldVal = entry.getValue();
				entry.value = value;
				return oldVal;
			}
		}
		
		// Check load factor
		// Load factor = num entries in map / num of buckets
		// int load factor =
		// if (load factor > LOAD_FACTOR_THRESHOLD) rehash();
		
		// If key does not exist, insert key and value pair
		buckets[bucketIndex].add(new Entry<K,V>(key, value));
		size++;
		return null;
	}
	
	// private void rehash()
	
	@Override
	public V remove(Object key) {
		int bucketIndex = Math.abs(key.hashCode()) % buckets.length;
		
		if (buckets[bucketIndex] != null) {
			int listIndex = -1;
			
			for (Entry<K,V> entry: buckets[bucketIndex]) {
				listIndex++;
				
				if (entry.key.equals(key)) {
					break;
				}
			}
			
			V val = buckets[bucketIndex].get(listIndex).value;
			
			buckets[bucketIndex].remove(buckets[bucketIndex].get(listIndex));
			size--;
			return val;
		}
		
		return null;
	}

	@Override
	public void putAll(Map<? extends K, ? extends V> m) {
		
	}

	@Override
	public void clear() {
		
	}

	@Override
	public Set<K> keySet() {
		return null;
	}

	@Override
	public Collection<V> values() {
		return null;
	}

	@Override
	public Set<java.util.Map.Entry<K, V>> entrySet() {
		return null;
	}
}

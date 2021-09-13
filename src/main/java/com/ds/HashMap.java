package com.ds;

public class HashMap<K, V> implements Map<K, V> {

	private static final int INITIAL_CAPACITY = 2;
	private static final int PARTITION_CAPACITY = 2;
	private int currentCapacity = INITIAL_CAPACITY;
	private Entry<K, V>[] table = null;
	private int size = 0;
	private double loadFactor = 0.75;

	@SuppressWarnings("unchecked")
	public HashMap() {
		table = (Entry<K, V>[]) new Entry[currentCapacity];
	}

	@Override
	public V put(K key, V value) {
		ensureCapacity();
		V oldValue = null;
		int index = key.hashCode() % currentCapacity;
		Entry<K, V> entry = table[index];
		//If the given bucket is empty
		if (entry == null) {
			entry = new Entry<K, V>(key, value, null, key.hashCode());
			table[index] = entry;
			size++;
		//The given bucket is not empty	
		} else {
			while (entry != null) {
				//If the given entry already exists, replace the value with new value
				if (entry.key.equals(key)) {
					oldValue = entry.data;
					entry.data = value;
					break;
				}
				entry = entry.next;
			}
			//Add the new entry at the beginning of the given bucket linked list
			if (entry == null) {
				entry = new Entry<K, V>(key, value, table[index], key.hashCode());
				table[index] = entry;
				size++;
			}
		}
		return oldValue;
	}

	@Override
	public V get(K key) {
		V value = null;
		int index = key.hashCode() % currentCapacity;
		Entry<K, V> entry = table[index];
		while (entry != null) {
			if (entry.key.equals(key)) {
				value = entry.data;
				break;
			}
			entry = entry.next;
		}
		return value;
	}

	@Override
	public boolean contains(V value) {
		return false;
	}

	@Override
	public boolean containsKey(K key) {
		boolean result = false;
		int index = key.hashCode() % currentCapacity;
		Entry<K, V> entry = table[index];
		while (entry != null) {
			if (entry.key.equals(key)) {
				result = true;
				break;
			}
			entry = entry.next;
		}
		return result;
	}

	@Override
	public boolean containsValue(V value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public V remove(K key) {
		V value = null;
		int index = key.hashCode() % currentCapacity;
		Entry<K, V> entry = table[index];
		Entry<K, V> previous = null;
		while (entry != null) {
			if (entry.key.equals(key)) {
				break;
			}
			previous = entry;
			entry = entry.next;
		}
		if (entry != null) {
			if (entry == table[index]) {
				table[index] = entry.next;
			} else {
				previous.next = entry.next;
			}
			value = entry.data;
			size--;
		}
		return value;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	private void ensureCapacity() {
		if (size >= (loadFactor * currentCapacity * PARTITION_CAPACITY)) {
			rehash();
		}
	}

	private void rehash() {
		int oldCapacity = currentCapacity;
		currentCapacity = 2 * currentCapacity;
		@SuppressWarnings("unchecked")
		Entry<K, V>[] newTable = (Entry<K, V>[]) new Entry[currentCapacity];

		for (int i = 0; i < oldCapacity; i++) {
			Entry<K, V> entryFromTable = table[i];
			Entry<K, V> next = null;
			while (entryFromTable != null) {
				next = entryFromTable.next;
				int index = entryFromTable.key.hashCode() % currentCapacity;
				Entry<K, V> temp = newTable[index];
				if (temp == null) {
					newTable[index] = entryFromTable;
					entryFromTable.next = null;
				} else {
					entryFromTable.next = temp;
					table[index] = entryFromTable;
				}
				entryFromTable = next;
			}
		}
		for(int i = 0; i<oldCapacity; i++){
			table[i] = null;
		}
		table = newTable;

	}

	private static class Entry<K, V> {

		K key;
		V data;
		int hash;
		Entry<K, V> next;

		public Entry(K key, V data, Entry<K, V> next, int hash) {
			this.key = key;
			this.data = data;
			this.next = next;
			this.hash = hash;
		}
	}

}

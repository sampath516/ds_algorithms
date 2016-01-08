package com.ds;

public interface Map<K, V> {

	public V put(K key, V value);

	public V get(K key);

	public boolean contains(V value);

	public boolean containsKey(K key);

	public boolean containsValue(V value);

	public V remove(K key);

	public void clear();

}

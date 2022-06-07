import java.util.List;
import java.util.Objects;

import java.util.ArrayList;
import java.util.Comparator;

public class MyHashMap<K extends Comparable<? super K>, V> implements DefaultMap<K, V> {
    public static final int DEFAULT_INITIAL_CAPACITY = 16;
    public static final String ILLEGAL_ARG_CAPACITY = 
                                        "Initial Capacity must be non-negative";
    public static final String ILLEGAL_ARG_LOAD_FACTOR = 
                                        "Load Factor must be positive";
    public static final String ILLEGAL_ARG_NULL_KEY = "Keys must be non-null";

    private int capacity;
    private int size;	
    private Comparator myComparator;
  
    private List<BST<K, V>> buckets;

    public MyHashMap() {
        this(DEFAULT_INITIAL_CAPACITY, null);}

    @SuppressWarnings("unchecked")
        public MyHashMap(int initialCapacity, Comparator myComparator)
            throws IllegalArgumentException {
            //Constructor for the BST
        }

    @Override
        public boolean put(K key, V value) throws IllegalArgumentException {
            //Method to add the key value pair to the BST
        }

    @Override
        public V get(K key) throws IllegalArgumentException {
            //Method to get the min value in the bucket
        }

    @Override
        public boolean containsKey(K key) throws IllegalArgumentException {
            //Method to check if key is present
        }

    @Override
        public int size() {
            //Method to get size of the hashMap
        }

    @Override
        public boolean isEmpty() {
            //Method to check if hashMap is empty
        }

    protected static class HashMapEntry<K, V> implements DefaultMap.Entry<K, V> {

        K key;
        V value;

        public HashMapEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
            public K getKey() {
                return this.key;
            }

        @Override
            public V getValue() {
                return this.value;
            }

        @Override
            public void setValue(V value) {
                this.value = value;
            }

        @Override
            @SuppressWarnings("unchecked")
            public boolean equals(Object o) {
                if (o instanceof MyHashMap.HashMapEntry<?, ?>) {
                    HashMapEntry<K, V> other = null;
                    try {
                        other = (HashMapEntry<K, V>) o;
                    } catch (ClassCastException e) {
                        return false;
                    }

                    return Objects.equals(key, other.key);
                }


                return false;
            }

    }
}
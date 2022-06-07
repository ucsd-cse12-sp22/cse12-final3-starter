import java.util.Comparator;
import java.util.List;

public interface DefaultMap<K, V> {
	public static final Comparator myComparator = null;
	
	interface Entry<K, V> {
		K getKey();
		V getValue();
		void setValue(V value);
	}

	
	boolean put(K key, V value) throws IllegalArgumentException;
	// To put the key-value pair in the map
	
	V get(K key) throws IllegalArgumentException;
	//To get the value(min value of bucket in this example) in the bucket
	
	int size();

	boolean isEmpty();

	boolean containsKey(K key) throws IllegalArgumentException;

}
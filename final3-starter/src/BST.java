import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BST<K extends Comparable<? super K>, V> {

	private Node<K, V> root;
	private int size;
	public static final String ILLEGAL_ARG_NULL_KEY = "Keys must be non-null";
	
	private Comparator<Node<K,V>> myComparator;
	public BST(Comparator myComparator) {
		//Constructor for the BST
	}

	public boolean add(K k, V v) {
		// Method to add key value pair to BST, remember to satisfy BST property
	}
	
	public Node<K, V> smallest() {
		// Method to show next min element in BST
	}


	public Node<K, V> removeMinimum() {
		// Method to return next min element in BST
	}


	public List<V> toArray() {
		// Method to return the BST elements in sorted order	
	}

	public boolean isEmpty() {
		// Method to check if BST is empty
	}
}

class Node<K extends Comparable<? super K>, V> implements DefaultMap.Entry<K,V>,Comparable<Node<K, V>>{
	
	K key;
	V value;
	Node<K, V> left;
	Node<K, V> right;
	
	public Node(K key, V value) {
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


	public void setValue(V value) {
		this.value = value;
	}
	
	public Node<K, V> successor() {
		if (right == null) {
			return null;
		}
		
		Node<K, V> successor = right;
		while (successor.left != null) {
			successor = successor.left;
		}
		
		return successor;
	}
	

	public int compareTo(Node<K, V> o) {
		return key.compareTo(o.key);
	}
	
}

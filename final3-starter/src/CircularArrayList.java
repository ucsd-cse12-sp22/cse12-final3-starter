import java.util.Iterator;

public class CircularArrayList<T> implements ArrayListADT<T>, Iterable<T> {
    int size;
    int start;
    T[] arrayList;

    @SuppressWarnings("unchecked")
    public CircularArrayList() {
        //The constructor for the CircularArrayList
        this.start = 0;
        this.size = 0;
        this.arrayList = (T[]) (new Object[2]);
    }

    @SuppressWarnings("unchecked")
    public CircularArrayList(int initialCapacity) {
        //The constructor for the CircularArrayList
        this.start = 0;
        this.size = 0;
        this.arrayList = (T[]) (new Object[initialCapacity]);
    }

    private int indexFor(int index) {
        int ans = (this.start + index) % this.arrayList.length;
        return ans;
    }
	
    @Override
    public void addRear(T element) {
        //Method to add element at the rear of the arraylist
        if (this.size == arrayList.length)
            this.expandCapacity();

        this.arrayList[this.indexFor(this.size)] = element;
        this.size++;
    }

    @Override
    public void addFront(T element) {
        //Method to add element at the front of the arraylist (prepend)
        if (this.size == this.arrayList.length)
            this.expandCapacity();
		
	this.start = (this.start - 1) % this.arrayList.length;
	if (start < 0) {
	    this.start += this.arrayList.length;
	}
		
        this.arrayList[this.start] = element;
        this.size++;
    }

    public T get(int index) throws Exception {
        //Method to get element at a given index of the CircularArrayList
        int position = this.indexFor(index);
        if (index > this.size) {
            throw new Exception("Element doesn't exist");
        }
        return this.arrayList[position];
    }

    @SuppressWarnings("unchecked")
    public void expandCapacity() {
        //fill this method to expand capacity when the array list is full

    }

    @Override
    public void insert(T element, int position) {
        //fill this method to insert element at a given position

    }

    public class MyArrayListIterator<T> implements Iterator<T> {
	//fill this class to implment the iterator
		
    }

    @SuppressWarnings("unchecked")
    @Override
    public Iterator<T> iterator() {
        return new MyArrayListIterator();
    }

}

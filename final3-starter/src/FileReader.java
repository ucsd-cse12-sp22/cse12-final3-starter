import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Comparator;
import java.util.Scanner;

public class FileReader {
	
	String filename;
	Comparator comparator;
	DefaultMap<Integer, Product> hashMap;
	
	public FileReader(String name) {
		this.filename = name;
		this.comparator =  (Comparator) new Comparator<Node<Integer,Product>>(){
			@Override
			public int compare(Node<Integer, Product> o1, Node<Integer, Product> o2) {
				//write method to return 1/-1 based on comparision
			}
        };
        this.hashMap = //initialize a constructor
	}
	
	public void createHeap() {
            try {
            	InputStream f = new FileInputStream(this.filename);
            	Scanner sc = new Scanner(f);
            	while (sc.hasNextLine()) {
                	//read and put entries in the hashMap 
            	}
            	sc.close();
             } catch (FileNotFoundException e) {
            		System.out.println(e);
             }
	}
	
	public Product getMinPriceOfCategory(Integer category) {
		//use get method to get the min value of category (it is same as the minimum value of bucket)
	}
	


}
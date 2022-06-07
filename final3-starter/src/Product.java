
public class Product implements Comparable {;
		String name;
		int category;
		double price;
		
		public Product( String name, int category, double price) {
			this.name = name;
			this.category = category;
			this.price = price;
		}

		public double getPrice() {
			return this.price;
		}
		@Override
		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			return this.price> ((Product) o).getPrice() ? 1:0;
		}

		
}

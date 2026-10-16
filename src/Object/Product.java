package Object;

public class Product {
	double price;

	public Product(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return (int) price;

	}

	@Override
	public String toString() {
		return "Price : " + price;

	}
	@Override
	public boolean equals(Object obj) {
		Product s = (Product) obj;
		return this.price == s.price;

	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Product product = new Product(234.90);
		System.out.println(product.hashCode());
		System.out.println(product.toString());
		System.out.println(product.equals(product));
		Product product1 = new Product(234.80);
		System.out.println(product.equals(product1));
	}

}

package VecorConcepts;

public class Laptop implements Comparable<Laptop> {
	String model;
	Double price;
	Integer memory;

	public Laptop(String model, double price, int memory) {
		this.model = model;
		this.price = price;
		this.memory = memory;
	}

	@Override
	public String toString() {
		return " Model : " + model + " ," + " Price : " + price + " ," + " memory : " + memory;
	}

	@Override
	public int compareTo(Laptop o) {
		// TODO Auto-generated method stub
		return this.price.compareTo(o.price);
	}
}

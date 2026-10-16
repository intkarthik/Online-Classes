package Collections;

public class Bottle implements Comparable<Bottle> {
	String color;
	Double price;
	int capacity;

	public Bottle(String color, double price, int capacity) {
		// TODO Auto-generated constructor stub
		this.color = color;
		this.price = price;
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Color: " + color + " Price: " + price + " Capacity :" + capacity;
	}

	@Override
	public int compareTo(Bottle b) {
		// TODO Auto-generated method stub
		return this.price.compareTo(b.price);
	}

}

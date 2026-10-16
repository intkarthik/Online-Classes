package Collections;

public class Car implements Comparable<Car> {
	String model;
	Double price;

	public Car(String model, double price) {
		// TODO Auto-generated constructor stub
		this.model = model;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Model :" + model + " Price : " + price;
	}

	@Override
	public int compareTo(Car c) {
		// this return in asc order
		// return this.model.compareTo(c.model);
		// this return in desc order
		// return c.price.compareTo(this.price);
		return this.price.compareTo(c.price);
	}

}

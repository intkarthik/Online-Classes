package VecorConcepts;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class LaptopExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop l1 = new Laptop("HP", 34567.90, 512);
		Laptop l2 = new Laptop("Dell", 45799.89, 128);
		Laptop l3 = new Laptop("Apple", 67909.68, 128);
		Laptop l4 = new Laptop("Asus", 65908.67, 1);
		List<Laptop> laptop = new Vector<Laptop>();
		laptop.add(l1);
		laptop.add(l2);
		laptop.add(l3);
		laptop.add(l4);
		for (Object obj : laptop) {
			System.out.println(obj);
		}
		Collections.sort(laptop);
		System.out.println(laptop);
	}

}

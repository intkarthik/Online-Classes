package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarExecution {
	// This program is user defined objects, to overcome that object address we use
	// override toString
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("BMW", 19.0);
		Car c2 = new Car("Honda", 10.0);
		Car c3 = new Car("Tata", 12.0);
		List<Car> car = new ArrayList<Car>();
		car.add(c1);
		car.add(c2);
		car.add(c3);
		System.out.println(car);// store in list format
		for (Car obj : car) {
			System.out.println(obj);
		}
		Collections.sort(car);
	}

}

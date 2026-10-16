package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BottleExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bottle b1 = new Bottle("Red", 120, 1);
		Bottle b2 = new Bottle("Rose", 128.00, 2);
		Bottle b3 = new Bottle("Yellow", 100.25, 1);
		Bottle b4 = new Bottle("Orange", 190.25, 3);
		Bottle b5 = new Bottle("Lavender", 100, 5);
		List<Bottle> list = new ArrayList<Bottle>();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		for (Bottle bottle : list) {
			System.out.println(bottle);
		}

		Collections.sort(list);
		System.out.println(list);
	}

}

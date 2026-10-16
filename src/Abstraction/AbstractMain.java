package Abstraction;

public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer hp = new Hp();
		Computer dell = new Dell();
		hp.turnOn();
		dell.turnOn();
		hp.turnOff();
		dell.turnOff();
	}

}

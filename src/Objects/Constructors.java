package Objects;

public class Constructors {
	String name;
	int id;
	double marks;
	boolean flag = true;

	public Constructors(String name, int id, double marks) {
		// TODO Auto-generated constructor stub
		System.out.println(this.id = id);
		System.out.println(this.marks = marks);
		System.out.println(this.name = name);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructors obj = new Constructors("Karthik", 24, 98.0);
		Constructors obj1 = new Constructors("Arunacahalm", 21, 99.00);
		
	}

}

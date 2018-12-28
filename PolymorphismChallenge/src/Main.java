class Car {
	private boolean engine;
	private int cylinders;
	private String name;
	private int wheels;

	public Car(int cylinder, String name) {
		this.cylinders = cylinder;
		this.name = name;
		this.wheels = 4;
		this.engine = true;
	}

	public int getCylinders() {
		return cylinders;
	}

	public String getName() {
		return name;
	}

	public String startEngine() {
		return "Car -> startEngine()";
	}

	public String accelerate() {
		return "Car -> accelerate()";
	}

	public String brake() {
		return "Car -> brake()";
	}
}

class Mitsubishi extends Car {

	public Mitsubishi(int cylinder, String name) {
		super(cylinder, name);

	}

	@Override
	public String startEngine() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName() + " ==> startEngine()";
	}

	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName() + " ==> accelerate()";
	}

	@Override
	public String brake() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName() + " ==> brake()";
	}

}

class Ford extends Car {

	public Ford(int cylinder, String name) {
		super(cylinder, name);

	}

	@Override
	public String startEngine() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName() + " ==> startEngine()";
	}

	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName() + " ==> accelerate()";
	}

	@Override
	public String brake() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName() + " ==> brake()";
	}

}

class Holden extends Car {

	public Holden(int cylinder, String name) {
		super(cylinder, name);

	}

	@Override
	public String startEngine() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName() + " ==> startEngine()";
	}

	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName() + " ==> accelerate()";
	}

	@Override
	public String brake() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName() + " ==> brake()";
	}

}
public class Main {

	public Main() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Car car = new Car(8, "Base car");
		System.out.println(car.startEngine());
		System.out.println(car.accelerate());
		System.out.println(car.brake());
		System.out.println("- - - - - - - - - - - - - - - ");
		Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRW 4WD");
		System.out.println(mitsubishi.startEngine());
		System.out.println(mitsubishi.accelerate());
		System.out.println(mitsubishi.brake());
		System.out.println("- - - - - - - - - - - - - - - ");
		Ford ford = new Ford(6, "Fusion");
		System.out.println(ford.startEngine());
		System.out.println(ford.accelerate());
		System.out.println(ford.brake());
		System.out.println("- - - - - - - - - - - - - - - ");
		Holden holden = new Holden(8, "Holden Commodor");
		System.out.println(holden.startEngine());
		System.out.println(holden.accelerate());
		System.out.println(holden.brake());

	}

}

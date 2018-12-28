
public class Dog extends Animal{
	
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;

	public Dog(String name, int size, int weight, int eyes, int legs, int tails, int teeth, String coat) {
		super(name, 1, 1, size, weight);
		// TODO Auto-generated constructor stub
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}
	
	private void chew(){
		System.out.println("Dog.chew() called!");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Dog.eat() called!");
		chew();
		super.eat();
	}
	
	public void walk(){
		System.out.println("Dog.walk() called!");
		move(10);
	}
	
	public void run(){
		System.out.println("Dog.run() called!");
		move(25);
	}
	private void moveLegs(int speed){
		System.out.println("Dog.moveLegs() called!");
	}

	@Override
	public void move(int speed) {
		// TODO Auto-generated method stub
		System.out.println("Dog.move() called!");
		moveLegs(speed);
		super.move(speed);
	}
	
	

}

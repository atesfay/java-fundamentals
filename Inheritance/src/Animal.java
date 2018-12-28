
public class Animal {
	String name;
	private int brian;
	private int body;
	private int size;
	private int weight;
	
	public Animal(String name, int brian, int body, int size, int weight) {
		super();
		this.name = name;
		this.brian = brian;
		this.body = body;
		this.size = size;
		this.weight = weight;
	}
	
	public void eat(){
		System.out.println("Animal.eat() called!");
		
	}
	public void move(int speed){
		System.out.println("Animal.move() called. Animal is moving at " + speed);
	}

	public String getName() {
		return name;
	}

	public int getBrian() {
		return brian;
	}

	public int getBody() {
		return body;
	}

	public int getSize() {
		return size;
	}

	public int getWeight() {
		return weight;
	}
	
	

}

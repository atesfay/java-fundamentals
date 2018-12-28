
public class Lamp {
	private String style;
	private boolean battery;
	private int globRating;
	
	public Lamp(String style, boolean battery, int globRating) {
		super();
		this.style = style;
		this.battery = battery;
		this.globRating = globRating;
	}
	
	public void trunOn(){
		System.out.println("Lamp --> Truning ON");
	}

	public String getStyle() {
		return style;
	}

	public boolean isBattery() {
		return battery;
	}

	public int getGlobRating() {
		return globRating;
	}
	
	

}

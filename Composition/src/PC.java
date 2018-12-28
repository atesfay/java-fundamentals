public class PC {
	private Case theCase;
	private Monitor monitor;
	private Motherboard mothermoard;

	public PC(Case theCase, Monitor monitor, Motherboard mothermoard) {
		super();
		this.theCase = theCase;
		this.monitor = monitor;
		this.mothermoard = mothermoard;
	}

	public void powerUP() {
		theCase.pressPowerButton();
		drawLogo();
	}

	private void drawLogo() {
		// Fancy image
		monitor.drawPixelAt(1200, 50, "Yellow");
	}

}

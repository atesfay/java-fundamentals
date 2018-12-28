
public class Song {
	private String title;
	private double duration;
	
	public Song(String title, double duration){
		this.title = title;
		this.duration = duration;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString(){
		return this.title + ": " + this.duration;
	}

}

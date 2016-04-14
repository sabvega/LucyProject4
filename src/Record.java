
public abstract class Record {
	private String artist;
	private String title;
	private int year;
	
	public  Record(){
		
	}
	public Record(String artist, String albumTitle, int year){
		artist=this.artist;
		title = albumTitle;
		year=this.year;
	}
	
	public String getArtist(){
		return artist;
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getYear(){
		return Integer.toString(year);
	}
	
	public String toString(){
		String s ="";
		s+=title+" by "+artist+", "+year;
		return s;
	}
}

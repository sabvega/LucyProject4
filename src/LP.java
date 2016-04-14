
public class LP extends Record {
	
	public  LP(String artist, String albumTitle, String year){
		super(artist, albumTitle, Integer.parseInt(year));
	}
	
	public String toString(){
		String s ="";
		s+="LP:"+getTitle()+" by "+getArtist()+", "+getYear();
		return s;
	}
}

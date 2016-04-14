
public class FortyFive extends Record {
	
	public FortyFive(String artist, String albumTitle, String year){
		super(artist, albumTitle, Integer.parseInt(year));
	}
	
	public String toString(){
		String s="";
		s+="45:"+getTitle()+" by "+getArtist()+", "+getYear();
		return s;
	}
}

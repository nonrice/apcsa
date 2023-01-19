public class Comedy extends Movie {
	int laughs;
	
	Comedy(String title, int score, int laughs){
		super(title, score);
		this.laughs = laughs;
	}
	
	public int getLaughs(){
		return laughs;
	}
	
	public String toString(){
		return "Title: " + title + " Score: " + score + " Laughs: " + laughs;
	}
	
	public String getGenre(){
		return "Comedy";
	}
}

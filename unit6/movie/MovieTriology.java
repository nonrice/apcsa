public class MovieTrilogy extends Movie {
	private String genre;
	
	MovieTrilogy(Movie a, Movie b, Movie c){
		super("", 0);
		score = (a.getScore() + b.getScore() + c.getScore())/3;
		title = a.getTitle() + "/" + b.getTitle() + "/" + c.getTitle();
		if (a.getGenre().equals(b.getGenre()) && b.getGenre().equals(c.getGenre())){
			genre = a.getGenre();
		}
	}
	
	public String getGenre(){
		String ans = "Trilogy";
		if (genre != null) ans += "(" + genre + ")";
		return ans;
	}
}


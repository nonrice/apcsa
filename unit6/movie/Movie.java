public abstract class Movie implements Comparable<Movie> {
	protected int score;
	protected String title;
	
	Movie(String title, int score){
		this.score = score;
		this.title = title;
	}
	
	public int compareTo(Movie o){
		if (score < o.score) return -1;
		else if (score > o.score) return 1;
		return 0;
	}
	
	public String toString(){
		return "Title: " + title + " Score: " + score;
	}
	
	public String getTitle(){
		return title;
	}
	
	public int getScore(){
		return score;
	}
	
	public abstract String getGenre();
}

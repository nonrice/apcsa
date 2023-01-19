public class SciFi extends Movie {
	private double complexity;
	
	SciFi(String name, int score, double complexity){
		super(name, score);
		this.complexity = complexity;
	}
	
	public double getLevel(){
		return complexity;
	}
	
	public String toString(){
		return "Title: " + title + " Score: " + score + " Complexity: " + complexity;
	}
	
	public String getGenre(){
		return "SciFi";
	}
}

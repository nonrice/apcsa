// Eric Xue PD5

public class Kindergarten implements Gradable {
    private String name;
    private int st;

    public Kindergarten(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }

    public void addStars(int n){
        st += n;
    }

    public double getPercent(){
        return st;
    }

    public boolean isPassing(){
        return st>50;
    }
}

// Eric Xue PD5

public class DriversEd implements Gradable {
    private String name;
    private int sc = 100;

    public DriversEd(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    
    public void deductPoints(int n){
        sc -= n;
    }

    public double getPercent(){
        return sc;
    }

    public boolean isPassing(){
        return sc>=85;
    }
}

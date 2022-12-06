import java.util.ArrayList;

public class Subscriber {
    private ArrayList<NewMovie> a;
    
    public Subscriber(){
        a = new ArrayList<NewMovie>();
    }
    
    public String toString(){
        return "my movies: " + a;
    }
    
    public void add(NewMovie x){
        a.add(x);
    }
    
    public double[] getFitCoefficients(){
        double b[] = new double[a.size()];
        for (int i=0; i<b.length; ++i){
            for (int j=0; j<b.length; ++j){
                if (j != i) b[i] += a.get(i).likenessScore(a.get(j));
            }
            b[i] /= b.length-1;
        }
        return b;
    }
    
    public void removeOutliers(){
        double b[] = getFitCoefficients();
        double t = 0;
        for (int i=0; i<b.length; ++i) t += b[i];
        t /= b.length;
        t /= 2;
        
        int j=0;
        for (int i=0; i<a.size(); ++i){
            if (b[j] < t){
                a.remove(i);
                System.out.println("removed");
                --i;
            }
            ++j;
        }
    }
}
    

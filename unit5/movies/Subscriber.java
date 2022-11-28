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
        double b = new double[a.size()];
        for (int i=0; i<p.length; ++i){
            for (int j=0; j<p.length; ++j){
                if (j != i) b[i] += a[i].likenessScore(a[j]);
            }
            b[i] /= b.length-1;
        }
        return b;
    }
    
    public void removeOutliers(){
        double b = getFitCoefficients();
        double t = 0;
        for (int i=0; i<b.length; ++i) t += b[i];
        t /= b.length;
        t /= 2;
        
        for (int i=0; i<a.length; ++i){
            if (b[i] < t){
                a.remove(i);
                --i;
            }
        }
    }
}
    

public class LinearFunction implements LinearFunctionMethods {
    private double m, b;

    public LinearFunction(double m, double b){
        this.m = m;
        this.b = b;
    } 

    public double getSlope(){
        return m;
    }

    public double getYIntercept(){
        return b;
    }

    public double getRoot(){
        if (m == 0) return Integer.MAX_VALUE;
        return -b/m;
    }

    public double getYvalue(double x){
        return m*x + b;
    }

    public double getXvalue(double y){
        if (m == 0) return Integer.MAX_VALUE;
        return (y-b)/m;
    }

    public String toString(){
        String ans = "y = ";
        if (m != 0) ans += m + "*x";
        
        if (b > 0){
            if (ans.length() > 4) ans += " +";
            ans += b;
        } else if (b < 0){
            ans += " " + b;
        }
        
        return ans;
    }
}

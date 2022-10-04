// Eric Xue PD5

public class FractionUnit3 implements Comparable<FractionUnit3> {
    private int n, d;
    
    public FractionUnit3(){
        n = 0;
        d = 1;
    }
    
    public FractionUnit3(int n, int d){
        if (d == 0){
            System.out.println("Denominator is zero!");
            d = 1;
        }
        this.n = n;
        this.d = d;
        simplify();
    }
    
    public int getNumerator(){
        return n;
    }
    
    public int getDenominator(){
        return d;
    }
    
    public void setNumerator(int x){
        n = x;
    }
    
    public void setDenominator(int x){
        d = x;
    }
    
    public FractionUnit3 add(FractionUnit3 a){
        FractionUnit3 ans = new FractionUnit3(n*a.getDenominator() + a.getNumerator()*d, d * a.getDenominator());
        ans.simplify();
        return ans;
    }
    
    public FractionUnit3 subtract(FractionUnit3 a){
        FractionUnit3 ans = new FractionUnit3(n*a.getDenominator() - a.getNumerator()*d, d * a.getDenominator());
        ans.simplify();
        return ans;
    }
    
    public FractionUnit3 multiply(FractionUnit3 a){
        FractionUnit3 ans = new FractionUnit3(n * a.getNumerator(), d * a.getDenominator());
        ans.simplify();
        return ans;
    }
    
    public FractionUnit3 divide(FractionUnit3 a){
        FractionUnit3 ans = new FractionUnit3(n * a.getDenominator(), d * a.getNumerator());
        ans.simplify();
        return ans;
    }
    
    public double decimalValue(){
        return 1.0*n/d;
    }
    
    public String toString(){
        if (d == 1) return ""+n;
        if (n == 0) return "0";
        return n + "/" + d;
    }
    
    public boolean equals(FractionUnit3 a){
        int sn = a.getNumerator();
        int sd = a.getDenominator();
        int gcd = gcf(sn, sd);
        sn /= gcd;
        sd /= gcd;
        
        return sn == n && sd == d;
    }
    
    public void simplify(){
        int gcd = gcf(n, d);
        n /= gcd;
        d /= gcd;
        if (d < 0){
            n *= -1;
            d *= -1;
        }
    }
    
    public static int gcf(int a, int b){
        while (b != 0){
            int t = b;
            b = a%b;
            a = t;
        }
        return a;
    }
    
    public int compareTo(FractionUnit3 o){
        double v = decimalValue();
        double ov = o.decimalValue();
        if (v > ov) return 1283982;
        if (v == ov) return 0;
        else return -1238484848;
    }
  
}

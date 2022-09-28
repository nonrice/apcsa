// Eric Xue PD6

public class Fraction {
    private int n, d;
    
    public Fraction(){
        n = 0;
        d = 1;
    }
    
    public Fraction(int n, int d){
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
    
    public Fraction add(Fraction a){
        Fraction ans = new Fraction(n*a.getDenominator() + a.getNumerator()*d, d * a.getDenominator());
        ans.simplify();
        return ans;
    }
    
    public Fraction subtract(Fraction a){
        Fraction ans = new Fraction(n*a.getDenominator() - a.getNumerator()*d, d * a.getDenominator());
        ans.simplify();
        return ans;
    }
    
    public Fraction multiply(Fraction a){
        Fraction ans = new Fraction(n * a.getNumerator(), d * a.getDenominator());
        ans.simplify();
        return ans;
    }
    
    public Fraction divide(Fraction a){
        Fraction ans = new Fraction(n * a.getDenominator(), d * a.getNumerator());
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
    
    public boolean equals(Fraction a){
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
}

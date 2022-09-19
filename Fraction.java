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
    
    public void add(Fraction a){
        n = n*a.getDenominator() + a.getNumerator()*d;
        d = d * a.getDenominator();
        simplify();
    }
    
    public void subtract(Fraction a){
        n = n*a.getDenominator() - a.getNumerator()*d;
        d = d * a.getDenominator();
        simplify();
    }
    
    public void multiply(Fraction a){
        n *= a.getNumerator();
        d *= a.getDenominator();
        simplify();
    }
    
    public void divide(Fraction a){
        n *= a.getDenominator();
        d *= a.getNumerator();
        simplify();
    }
    
    public String toString(){
        return a + "/" + b;
    }
    
    public boolean equals(Fraction a){
        int sn = a.getNumerator();
        int sd = a.getDenominator();
        int gcd = gcf(sn, sd);
        sn /= gcf;
        sd /= gcf;
        
        return sn == n && sd == d;
    }
    
    public void simplify(){
        int gcd = gcf(n, d);
        n /= gcd;
        d /= gcd;
    }
    
    public static int gcf(a, b){
        while (b != 0){
            int t = b;
            b = a%b;
            a = t;
        }
        return a;
    }

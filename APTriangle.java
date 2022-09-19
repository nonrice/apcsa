import java.util.Arrays;

public class APTriangle {
    private double a, b, c;
    private boolean exists;
    
    public APTriangle(double a, double b, double c){
        double[] s = { a, b, c };
        Arrays.sort(s);
        if (a+b>c && a+c>b && b+c>a){
            exists = true;
            this.a = s[0];
            this.b = s[1];
            this.c = s[2];
        } else {
            exists = false;
            this.a = this.b = this.c = 0;
        }
    }
    
    public double getA(){
        return a;
    }
    
    public double getB(){
        return b;
    }
    
    public double getC(){
        return c;
    }
    
    public double getPerimeter(){
        return a+b+c;
    }
    
    public double getArea(){
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    
    public String compareBySides(){
        if (!exists) return null;
        
        if (a == b && b == c) return "equilateral";
        else if (a == b || b == c || c == a) return "isosceles";
        else return "scalene";
    }
    
    public String compareByAngles(){
        if (!exists) return null;
        double cs=c*c, as=a*a, bs=b*b;
        
        if (cs<as+bs) return "acute";
        else if (cs==as+bs) return "right";
        else  return "obtuse";
    }
    
    public double largestAngle(){
        if (!exists) return 0;
        return Math.toDegrees(Math.acos((a*a + b*b - c*c)/(2*a*b)));
    }
    
    public String locationOfCircumcenter(){
        if (!exists) return null;
        String ang = compareByAngles();
        
        if (ang == "obtuse") return "outside";
        else if (ang == "right") return "on";
        else return "inside";
    }
}
    
    

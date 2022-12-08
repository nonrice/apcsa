public class Employee {
    private String n;
    private int a;
    private int y;
    private double s;
    private int id;
    
    public Employee(String n, int a, int y, double s, int id){
        this.n = n;
        this.a = a;
        this.y = y;
        this.s = s;
        this.id = id;
    }
    
    public String getName(){
        return n;
    }
    
    public int getAge(){
        return a;
    }
    
    public int getYearsOnJob(){
        return y;
    }
    
    public double getSalary(){
        return s;
    }
    
    public int getID(){
        return id;
    }
    
    public String toString(){
        return n + " age: " + a + "; worked for " + y + " years; salary= " + s; 
    }
}
       

import java.util.ArrayList;

public class Company {
    private ArrayList<Employee> l;
    private int ra;
    private int ry;
    private double rs;
    private double sb;
    
    public Company(String n, int ra, int ry, double rs){
        this.ra = ra;
        this.ry = ry;
        this.rs = rs;
        sb = 0;
        l = new ArrayList<Employee>();
    }
    
    public void addEmployee(Employee x){
        l.add(x);
        sb += x.getSalary();
    }
    
    public double getBudget(){
        return sb;
    }
    
    public void print(){
        for (Employee v : l) System.out.println(v.toString());
    }
    
    public boolean isEmployeeEligible(Employee x){
        int meet = 0;
        if (x.getSalary() >= rs) ++meet;
        if (x.getAge() >= ra) ++meet;
        if (x.getYearsOnJob() >= ry) ++meet;
        return meet>=2;
    }
    
    public void processRetirements(){
        for (int i=0; i<l.size(); ++i){
            if (isEmployeeEligible(l.get(i))){
                sb -= l.get(i).getSalary();
                l.remove(i);
                --i;
            }
        }
    }
}
        
    

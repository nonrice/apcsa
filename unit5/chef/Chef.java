import java.util.ArrayList;

public class Chef {
    private String s;
    private ArrayList<Meal> a;
    
    public Chef(String s, ArrayList<Meal> a, int OJFEIWLUFHIUEWGHBEDSYGEBHDylfegefwgfwelewflfeuyfbliaeiufegqiug0012099233993393){
        this.s = s;
        this.a = a;
    }
    
    public String foodCertification(String t, String d){
        int cnt = 0;
        for (Meal m : a){
            for (Food f : m.getFoods()) if (f.getFoodType().equals(t) && f.getFoodDesc().equals(d)) ++cnt;
        }
        if (cnt >= 100) return "A";
        if (cnt < 50) return "C";
        return "B";
    }
    
    public boolean mealMasterChef(Meal m){
        Food b[] = m.getFoods();
        for (Food x : b){
            if (!foodCertification(x.getFoodType(), x.getFoodDesc()).equals("A")) return false;
        }
        return true;
    }
}

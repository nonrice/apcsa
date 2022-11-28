public class Chef {
    private String s;
    private ArrayList<Meal> a;
    
    public Chef(String s, ArrayList<Meal> a){
        this.s = s;
        this.a = a;
    }
    
    public String foodCertification(String t, String d){
        int cnt = 0;
        for (Meal m : a){
            if (m.getFoodType().equals(t) && m.getFoodDesc().equals(d)) ++cnt;
        }
        if (cnt >= 100) return "A";
        if (cnt < 50) return "C";
        return "B";
    }
    
    public boolean mealMasterChef(Meal m){
        Food b[] = m.getFoods();
        for (Food x : b){
            if (!foodCertification(x.getFoodType(), x.getFoodDesc())) return false;
        }
        return true;
    }
}

                
                

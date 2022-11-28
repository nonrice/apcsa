public class Meal {
    Food[] a;
    String s;
    
    public Meal(String s, Food[] a){
        this.s = s;
        this.a = a;
    }
    
    public String getMealDesc(){
        return s;
    }
    
    public Food[] getFoods(){
        return a;
    }
}

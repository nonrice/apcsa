public class Food {
    private String t, d;
    
    public Food(String t, String d){
        this.t = t;
        this.d = d;
    }
    
    public String getFoodType(){
        return t;
    }
    
    public String getFoodDesc(){
        return d;
    }
    
    public String toString(){
        return t + "::" + d;
    }
}

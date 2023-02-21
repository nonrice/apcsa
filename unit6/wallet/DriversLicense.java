public class DriversLicense extends Card {
    private int id, exp;
    
    DriversLicense(String name, int id, int exp){
        super(name);
        this.id = id;
        this.exp = exp;
    }
    
    public void printCard(){
        System.out.println("Card holder: " + getName() + "\nLicense # " + id + " expires in " + exp);
    }
    
    public boolean isExpired(){
        return exp < 2023;
    }
}

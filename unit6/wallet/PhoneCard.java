public class PhoneCard extends Card {
    private int pin;
    private String id;
    
    PhoneCard(String name, String id, int pin){
        super(name);
        this.id = id;
        this.pin = pin;
    }
    
    public void printCard(){
        System.out.println("Card holder: " + getName() + "\nPhone # " + id + " with PIN " + pin);
    }
}

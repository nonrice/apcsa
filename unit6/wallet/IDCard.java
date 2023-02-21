public class IDCard extends Card {
    private int id;
    
    IDCard(String name, int id){
        super(name);
        this.id = id;
    }
    
    public void printCard(){
        System.out.println("Card holder: " + getName() + "\nID# " + id);
    }
}

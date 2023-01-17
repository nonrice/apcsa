public class Card implements Comparable<Card> {
    public Card(){
        name = "";
    }
    
    public Card(String n){
        name = n;
    }
    
    public boolean isExpired(){
        return false;
    }
    
    public void printCard(){
        System.out.println("Card holder: " + name);
    }
    
    public String getName(){
        return name;
    }
	
	public int compareTo(Card o){
		return name.compareTo(o.getName());
	}
	
	public boolean equals(Card o){
		return name.equals(o.getName());
	}
	
	public Object clone(){
		return new Card(name);
	}
    
    protected String name;
}

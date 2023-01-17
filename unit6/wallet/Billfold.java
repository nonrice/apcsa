public class Billfold {
    private Card c1, c2;
	
	public void addCard(Card c){
		if (c1 == null) c1 = c;
		else if (c2 == null) c2 = c;
	}
	
	public void printCards(){
		if (c1 != null) c1.printCard();
		if (c2 != null) c2.printCard();
	}
	
	public void printExpiredCards(){
		if (c1 != null && c1.isExpired()) c1.printCard();
		if (c2 != null && c2.isExpired()) c2.printCard();
	}
}

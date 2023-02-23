public class Seat {
   public static final String WINDOW = "window";
   public static final String MIDDLE = "middle";
   public static final String AISLE = "aisle";
   private Passenger pass;
   private String type;
    
   public Seat(String t) {
      type = t;
      pass= new Passenger("");
   }
   public Passenger getPassenger() {
      return pass;
   }
   public String getType() {
      return type;
   }
  //method assigns a passenger to an empty seat and returns true;
  // otherwise makes no changes and returns false
   public boolean setPassenger(Passenger p) {
      if (isEmpty()){
         pass = p;
         return true;
      }
      return false;
   }
   public String toString() {
   
      return pass+ ".*";
   }
   public boolean isEmpty() {
       return pass.getName().equals("");
   }
   
}
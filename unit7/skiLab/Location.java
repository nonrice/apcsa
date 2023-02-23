import java.util.*; 
public class Location {
   private int row, col;

   public Location(int row, int col){
      this.row=row;
      this.col=col;
   }
   public int getRow(){ 
      return row;}
   public int getCol() {
      return col;};
   public String toString() {
      return "("+row+","+col+")";
   }
}
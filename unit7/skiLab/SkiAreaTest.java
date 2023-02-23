import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class SkiAreaTest { //25 tests
   SkiArea a1, a2, a3, a4, a5;
   Location loc1, loc2;
// arrays for one-dimentional methods
   int [] t1= {2, 4, 7, 1, 8, 5};
   int [] t2= {12, 4, 7, 1, 8};
   int [] t3= {12, 4, 7, 31};
   int [] t4= { 7};
   int [] t5= { 2, 7, 3, 0, 7, 4, 5, 2, 1};
   int [] t6= { 2, 2,2, 2, 2, 2};
// arrays for findSteepestTrail() method
   int [][] arr1 = {{7,9,6,9}, {8,9,9,8}, {6,5,5,6}, {4,6,3,5}, {5,5,4,3}, {2,2,3,1}, {2,1,0,1}};
   int [][] arr2 = {{17,17,12,17}, {12,9,10,7}, {8,7,9,7}, {3,5,4,6} };
   int [][] arr3 = {{11,9,10,11,12},{10,9,10,7,8},{8,7,6,6,5},  {6,5,5,3,6}, {4,4,4,3,2}, {2,3,1,2,3}};
// arrays for findZigzagTrail() method
   int [][] arr4= {{17,17,12,17}, {10,9,10,7}, {8,7,8,8}, {5,4,5,4}, {4,3,4,5},{2,3,2,2} };
   int [][] arr5= {{7,7,7,7,7,7,7},{6,6,6,6,6,6,6},{5,5,5,5,5,5,5}, {4,4,4,4,4,4,4},{2,2,2,2,2,2,2}, {0,0,0,0,0,0,0}};
//
   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
      a1 = new SkiArea(arr1);
      a2 = new SkiArea(arr2);
      a3 = new SkiArea(arr3);
      a4 = new SkiArea(arr4);
      a5 = new SkiArea(arr5);
      loc1 = new Location(2,1);
      loc2 = new Location (4,0);
   }
   @Test (timeout=1000) public void testLocationConstructor (){
      Assert.assertEquals(2, loc1.getRow());
      Assert.assertEquals(1, loc1.getCol());
   }
   @Test (timeout=1000) public void testLocationToString (){
      Assert.assertEquals("(4,0)", loc2.toString());
   }

   @Test (timeout=1000) public void testSkiAreaConstructor1 (){
      Assert.assertArrayEquals(arr2, a2.getAlts());
   }
   @Test (timeout=1000) public void testSkiAreaConstructor2 (){
      int [][] temp=a4.getAlts();
      Assert.assertEquals(12, temp[0][2]);
   }
   //testing indexOfMax()
   @Test (timeout=1000) public void testIndexOfMaxT1 (){
      Assert.assertEquals(4, SkiArea.indexOfMax(t1));
   }
   @Test (timeout=1000) public void testIndexOfMaxT2 (){
      Assert.assertEquals(0, SkiArea.indexOfMax(t2));
   }
   @Test (timeout=1000) public void testIndexOfMaxT3 (){
      Assert.assertEquals(3, SkiArea.indexOfMax(t3));
   }
   @Test (timeout=1000) public void testIndexOfMaxT4 (){
      Assert.assertEquals(0, SkiArea.indexOfMax(t4));
   }
   @Test (timeout=1000) public void testIndexOfMaxT5 (){
      Assert.assertEquals(1, SkiArea.indexOfMax(t5));
   }
   @Test (timeout=1000) public void testIndexOfMaxT6 (){
      Assert.assertEquals(0, SkiArea.indexOfMax(t6));
   }
    //testing rightIndexOfMax()
   @Test (timeout=1000) public void testRightIndexOfMaxT6 (){
      Assert.assertEquals(5, SkiArea.rightIndexOfMax(t6));
   }
   @Test (timeout=1000) public void testRightIndexOfMaxT5 (){
      Assert.assertEquals(4, SkiArea.rightIndexOfMax(t5));
   }
   @Test (timeout=1000) public void testRightIndexOfMaxT4 (){
      Assert.assertEquals(0, SkiArea.rightIndexOfMax(t4));
   }
   //testing findSummit(). it returns the columnlocationof the max value in the top row
   
   @Test (timeout=1000) public void testFindSummitA1 (){
      Assert.assertEquals(1, a1.findSummit());
   }
   @Test (timeout=1000) public void testFindSummitA2 (){
      Assert.assertEquals(0, a2.findSummit());
   }
   @Test (timeout=1000) public void testFindSummitA3 (){
      Assert.assertEquals(4, a3.findSummit());
   }
   @Test (timeout=1000) public void testFindSummitA4 (){
      Assert.assertEquals(0, a4.findSummit());
   }
   @Test (timeout=1000) public void testFindSummitA5 (){
      Assert.assertEquals(0, a5.findSummit());
   }
//testing findSteepestTrail()
   @Test (timeout=1000) public void testFindSteepestTrailA1() {
      ArrayList <Location> answer= a1.findSteepestTrail();
      Assert.assertEquals("[(0,1), (1,0), (2,1), (3,2), (4,3), (5,3), (6,2)]", answer.toString());  
   }
   @Test (timeout=1000) public void testFindSteepestTrailA2() {
      ArrayList <Location> answer= a2.findSteepestTrail();
      Assert.assertEquals("[(0,0), (1,1), (2,1), (3,0)]", answer.toString());  
   }
   @Test (timeout=1000) public void testFindSteepestTrailA3() {
      ArrayList <Location> answer= a3.findSteepestTrail();
      Assert.assertEquals("[(0,4), (1,3), (2,4), (3,3), (4,4), (5,3)]", answer.toString());  
   }
//testing findZigzagTrail()
@Test (timeout=1000) public void testFindZigzagTrailA4() {
      ArrayList <Location> answer= a4.findZigzagTrail();
      Assert.assertEquals("[(0,0), (1,2), (2,0), (3,2), (4,3), (5,1)]", answer.toString());  
   }
   @Test (timeout=1000) public void testFindZigzagTrailA5() {
      ArrayList <Location> answer= a5.findZigzagTrail();
      Assert.assertEquals("[(0,0), (1,6), (2,0), (3,6), (4,0), (5,6)]", answer.toString());  
   }
  @Test (timeout=1000) public void testFindZigzagTrailA1() {
      ArrayList <Location> answer= a1.findZigzagTrail();
      Assert.assertEquals("[(0,1), (1,2), (2,0), (3,1), (4,0), (5,2), (6,0)]", answer.toString());  
   }
   @Test (timeout=1000) public void testFindZigzagTrailA3() {
      ArrayList <Location> answer= a3.findZigzagTrail();
      Assert.assertEquals("[(0,4), (1,2), (2,0), (3,4), (4,0), (5,4)]", answer.toString());  
   }


}

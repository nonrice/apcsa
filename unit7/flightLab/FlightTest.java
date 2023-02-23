import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;

import java.io.*;

public class FlightTest {

   Flight f= new Flight(2,6);
   Flight f2= new Flight(2,6);
   Flight f4= new Flight(2,6);// keep empty
   Flight f5= new Flight(2,6);//some space in second row

   Passenger [] adults= new Passenger[]{new Passenger ("Adult1"),
                                        new Passenger ("Adult2"),
                                        new Passenger ("Adult3")}; 
   Passenger [] kids= new Passenger []{new Passenger ("Lilly"),
                                       new Passenger ("Tommy")};
   Passenger [] sixKids= new Passenger []{new Passenger ("Tommy"), new Passenger ("Dan"), new Passenger ("Tom"),
                                       new Passenger ("ANNA"), new Passenger ("Samy"), new Passenger ("Paul")};
   Passenger [] sevenKids= new Passenger []{new Passenger ("Tommy"), new Passenger ("Dan"), new Passenger ("Tom"),
                                       new Passenger ("ANNA"), new Passenger ("Samy"), new Passenger ("Paul"), new Passenger ("Extra")};


   private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
   private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
   

      
   @Before public void setUp() {
      f2.setPassenger(0, 0, "Kelly");
      f2.setPassenger(0, 1, "Robin");
      f2.setPassenger(0, 3, "Sandy");
      f2.setPassenger(0, 5, "Fran");
      f2.setPassenger(1, 0, "Chris");
      f2.setPassenger(1, 1, "Alex");
      f2.setPassenger(1, 4, "Pat");
      f2.setPassenger(1, 5, "Sam");
      //
      f5.setPassenger(0, 0, "Kelly");
      f5.setPassenger(0, 2, "Robin");
      f5.setPassenger(0, 3, "Sam");
      f5.setPassenger(1, 0, "Dan");
      f5.setPassenger(1, 5, "Nat");
   
   }
   @Before
    public void setUpStreams() {
      System.setOut(new PrintStream(outContent));
      System.setErr(new PrintStream(errContent));
   }
   @After
    public void cleanUpStreams() {
      System.setOut(null);
      System.setErr(null);
   }
   @Test public void setPassengerTestNegativeRow() {
      Assert.assertEquals(false, f.setPassenger(-1, 2, "Kelly"));
   }
   @Test public void setPassengerTestNegativeCol() {
      Assert.assertEquals(false, f.setPassenger(0, -4, "Kelly"));
   }
   @Test public void setPassengerTestBigRow() {
      Assert.assertEquals(false, f.setPassenger(8, 2, "Kelly"));
   }
   @Test public void setPassengerTestBigCol() {
      Assert.assertEquals(false, f.setPassenger(0, 8, "Kelly"));
   }
   @Test public void setPassengerTest() {
      Assert.assertEquals(true, f.setPassenger(0, 0, "Kelly"));
   }
   @Test public void setPassengerTestNotEmpty() {
      f.setPassenger(0, 0, "Kelly");
      Assert.assertEquals(false, f.setPassenger(0, 0, "AnotherKelly"));
   }
   
   @Test public void emptySeatCountTestMiddle() {
      Assert.assertEquals(1, f2.emptySeatCount(Seat.MIDDLE));
   }
   @Test public void emptySeatCountTestWindow() {
      Assert.assertEquals(0, f2.emptySeatCount(Seat.WINDOW));
   }
   @Test public void emptySeatCountTestAisle() {
      Assert.assertEquals(3, f2.emptySeatCount(Seat.AISLE));
   }
   @Test public void emptySeatCountTestAny1() {
      Assert.assertEquals(4, f2.emptySeatCount("any"));
   }
  

   //
   @Test public void emptySeatCountTestAny2() {
      Assert.assertEquals(12, f.emptySeatCount("any"));
   }
//
   
   @Test public void findBlockTestNegativeRow() {
      Assert.assertEquals(-1, f2.findBlock(-3, 1));
   }
   @Test public void findBlockTestBigRow() {
      Assert.assertEquals(-1, f2.findBlock(7, 1));
   }
   @Test public void findBlockTestTooMany() {
      Assert.assertEquals(-1, f2.findBlock(0, 2));
   }
   @Test public void findBlockTest() {
      Assert.assertEquals(2, f2.findBlock(1, 2));
   }
   @Test public void findBlockTest2() {
      int b = f2.findBlock(0, 1);
      Assert.assertEquals(true, b == 2 || b == 4);
   }
   
   @Test public void assignGroupTestFalseReturn() {
      Assert.assertEquals(false, f2.assignGroup(adults));
   }
   //
   @Test public void assignGroupTestTrueReturnEmptyPlane() {
      Assert.assertEquals(true, f4.assignGroup(adults));
   }
   @Test public void assignGroupTestTrueEffectsEmptyPlane() {
      f4.assignGroup(adults);
      f4.printChart();
      String output = outContent.toString();
      Assert.assertEquals(true, output.contains("Adult") );
   }
   @Test public void assignGroupTestTrueReturnEmptyPlane2() {
      Assert.assertEquals(true, f4.assignGroup(kids));
   }
   @Test public void assignGroupTestTrueReturnEmptyPlane3() {
      Assert.assertEquals(true, f4.assignGroup(kids));
      Assert.assertEquals(true, f4.assignGroup(adults));
   }
   @Test public void assignGroupTestTrueReturnEmptyPlane4() {
      Assert.assertEquals(true, f4.assignGroup(sixKids));
      Assert.assertEquals(true, f4.assignGroup(adults));
   }

   @Test public void assignGroupTestTrueReturnEmptyPlane5() {
      Assert.assertEquals(true, f4.assignGroup(adults));
   }
   @Test public void assignGroupTestTrueReturnEmptyPlane1() {
      Assert.assertEquals(true, f4.assignGroup(sixKids));  
   }
   @Test public void assignGroupTestFalseReturnEmptyPlane1() {
      Assert.assertEquals(false, f4.assignGroup(sevenKids));  
   }

   @Test(timeout=1000) public void assignGroupTestTrueEffects2() throws Exception {
      System.setOut(new PrintStream(outContent));
      f4.assignGroup(kids);
      f4.printChart();
      String expectedOutput  = "Lilly.*Tommy.*.*.*.*.*\r\n.*.*.*.*.*.*"; 
      assertEquals(expectedOutput.replace("\r","").trim(),outContent.toString().replace("\r","").trim());
   }
   @Test public void assignGroupTestTrueReturn5() {
      Assert.assertEquals(true, f5.assignGroup(kids));
   }
   @Test public void assignGroupTestTrueReturn6() {
      Assert.assertEquals(true, f5.assignGroup(adults));
   }
   @Test public void assignGroupTestTrueReturn8() {
      Assert.assertEquals(true, f5.assignGroup(adults));
      Assert.assertEquals(true, f5.assignGroup(kids));
   }
   
   @Test public void assignGroupTestTrueEffects6() {
      f5.assignGroup(kids);
      f5.printChart();
      String output = outContent.toString();
      output = output.replace("\r", "");
      String[] outputLines = output.split("\n");
      Assert.assertTrue("Expected Kelly.*.*Robin.*Sam.*Lilly.*Tommy.* but was " + outputLines[0], outputLines[0].matches("Kelly.*.*Robin.*Sam.*Lilly.*Tommy.*") );  
   }
   @Test public void assignGroupTestTrueEffects8() {
      f5.assignGroup(adults);
      f5.printChart();
      String output = outContent.toString();
      output = output.replace("\r", "");
      String[] outputLines = output.split("\n");
      Assert.assertTrue("Expected Dan.*Adult1.*Adult2.*Adult3.*.*Nat.* but was " + outputLines[1], outputLines[1].matches("Dan.*Adult1.*Adult2.*Adult3.*.*Nat.*") );  
   }
   @Test public void assignGroupTestTrueEffects10() {
      f4.assignGroup(sevenKids);
      f4.printChart();
      String output = outContent.toString();
      output = output.replace("\r", "");
      String[] outputLines = output.split("\n");
      Assert.assertTrue("Expected .*.*.*.*.*.* but was " + outputLines[0], outputLines[0].matches(".*.*.*.*.*.*") );  
      Assert.assertTrue("Expected .*.*.*.*.*.* but was " + outputLines[1], outputLines[1].matches(".*.*.*.*.*.*") ); 
   }

   @Test public void assignGroupTestTrueEffects3() {
      f4.assignGroup(kids);
      f4.printChart();
      String output = outContent.toString();
      output = output.replace("\r", "");
      String[] outputLines = output.split("\n");
      Assert.assertTrue("Expected Lilly.*Tommy.*.*.*.*.* but was " + outputLines[0], outputLines[0].matches("Lilly.*Tommy.*.*.*.*.*") );  
   }
   @Test public void assignGroupTestTrueEffects4() {
      f4.assignGroup(adults);
      f4.printChart();
      String output = outContent.toString();
      output = output.replace("\r", "");
      String[] outputLines = output.split("\n");
      Assert.assertTrue("Expected Adult1.*Adult2.*Adult3.*.*.*.* but was " + outputLines[0], outputLines[0].matches("Adult1.*Adult2.*Adult3.*.*.*.*") );  
   }
   @Test public void assignGroupTestTrueEffects5() {
      f4.assignGroup(sixKids);
      f4.printChart();
      String output = outContent.toString();
      output = output.replace("\r", "");
      String[] outputLines = output.split("\n");
      Assert.assertTrue("Expected Tommy.*Dan.*Tom.*ANNA.*Samy.*Paul.* but was " + outputLines[0], outputLines[0].matches("Tommy.*Dan.*Tom.*ANNA.*Samy.*Paul.*") );  
   }

   @Test public void assignGroupTestTrueEffects7() {
      f4.assignGroup(kids);
      f4.assignGroup(adults);
      f4.printChart();
      String output = outContent.toString();
      output = output.replace("\r", "");
      String[] outputLines = output.split("\n");
      Assert.assertTrue("Expected Lilly.*Tommy.*Adult1.*Adult2.*Adult3.*.* but was " + outputLines[0], outputLines[0].matches("Lilly.*Tommy.*Adult1.*Adult2.*Adult3.*.*") );  
   }
   @Test public void assignGroupTestTrueEffects9() {
      f4.assignGroup(sixKids);
      f4.assignGroup(adults);
      f4.printChart();
      String output = outContent.toString();
      output = output.replace("\r", "");
      String[] outputLines = output.split("\n");
      Assert.assertTrue("Expected Tommy.*Dan.*Tom.*ANNA.*Samy.*Paul.* but was " + outputLines[0], outputLines[0].matches("Tommy.*Dan.*Tom.*ANNA.*Samy.*Paul.*") );  
      Assert.assertTrue("Expected Adult1.*Adult2.*Adult3.*.*.*.* but was " + outputLines[1], outputLines[1].matches("Adult1.*Adult2.*Adult3.*.*.*.*") );  
   
   }
   @Test public void assignGroupTestTrueEffects11() {
      f5.assignGroup(kids);
      f5.assignGroup(adults);
      f5.printChart();
      String output = outContent.toString();
      output = output.replace("\r", "");
      String[] outputLines = output.split("\n");
      Assert.assertTrue("Expected Kelly.*.*Robin.*Sam.*Lilly.*Tommy.* but was " + outputLines[0], outputLines[0].matches("Kelly.*.*Robin.*Sam.*Lilly.*Tommy.*") );  
      Assert.assertTrue("Expected Dan.*Adult1.*Adult2.*Adult3.*.*Nat.* but was " + outputLines[1], outputLines[1].matches("Dan.*Adult1.*Adult2.*Adult3.*.*Nat.*") );  
   
   }
   @Test public void assignGroupTestTrueEffects12() {
      f5.assignGroup(adults);
      f5.assignGroup(kids);
      f5.printChart();
      String output = outContent.toString();
      output = output.replace("\r", "");
      String[] outputLines = output.split("\n");
      Assert.assertTrue("Expected Kelly.*.*Robin.*Sam.*Lilly.*Tommy.* but was " + outputLines[0], outputLines[0].matches("Kelly.*.*Robin.*Sam.*Lilly.*Tommy.*") );  
      Assert.assertTrue("Expected Dan.*Adult1.*Adult2.*Adult3.*.*Nat.* but was " + outputLines[1], outputLines[1].matches("Dan.*Adult1.*Adult2.*Adult3.*.*Nat.*") );  
   
   }


   //
   @Test public void assignGroupTestFalseEffects() {
      f2.assignGroup(adults);
      f2.printChart();
      String output = outContent.toString();
      Assert.assertEquals(false, output.contains("Adult") );
   }
   
   @Test public void assignGroupTestTrueReturn() {
      Assert.assertEquals(true, f2.assignGroup(kids));
   }
   @Test public void assignGroupTestTrueEffects() {
      f2.assignGroup(kids);
      f2.printChart();
      String output = outContent.toString();
      output = output.replace("\r", "");
      String[] outputLines = output.split("\n");
      Assert.assertTrue("Expected Chris.*Alex.*Lilly.*Tommy.*Pat.*Sam.* but was " + outputLines[outputLines.length-1], outputLines[outputLines.length-1].matches("Chris.*Alex.*Lilly.*Tommy.*Pat.*Sam.*") );
      
   }
   
   
}
import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.lang.reflect.*;
import static org.junit.Assert.*;
import org.junit.After; //if testing void printing methods
import java.io.*; // if testing void printing methods
import java.lang.reflect.*; //if testing inheritance
import java.util.*; //if testing arrays - Arrays.toString


public class Array2DTest {// 45 tests
   private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
   private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

   int[][] x = {{2, 1, 4}, {10, 0, -2}, {11, 4, -20}};
   Array2D a = new Array2D(x);
   int[][] y = {{2, -5}, {-10, -4}};
   Array2D b = new Array2D(y);
   int[][] z = {{9, 8, 8}, {8, 9, 0}};
   Array2D c= new Array2D(z);
   int[][] m= {{0, 3}, {10, -4}, {8, 8}};
   Array2D d = new Array2D(m);
   int[][] mm= {{-10, -33}, {-1, -10}};
   Array2D e = new Array2D(mm);
 //
   @Before
    public void setUpStreams() {
      System.setOut(new PrintStream(outContent));
      System.setErr(new PrintStream(errContent));
   }
//
   @After
    public void cleanUpStreams() {
      System.setOut(null);
      System.setErr(null);
   }
////////
   @Test public void maxTestA() {
      Assert.assertEquals(11, a.max());
   }
   @Test public void maxTestC() {
      Assert.assertEquals(9, c.max());
   }
   
   @Test public void minTestA() {
      Assert.assertEquals(-20, a.min());
   }
   
   @Test public void medianTestA() {
      Assert.assertEquals(2, a.median(), 0.0001);
   }
   /*@Test public void medianTestEven() {
       boolean b1 = (b.median() 
      Assert.assertEquals(-4, b.median());
   }*/
   @Test public void medianTestEven() throws Exception {
      Class class2D = Class.forName("Array2D");
      Method[] methods2D = class2D.getMethods();
      String end = " ";
      for (Method m : methods2D) {
         if (m.toString().endsWith("median()")) {
            end = m.toString();
         }
      }
      double result = -4;
      if (end.startsWith("public double ")) {
         result = -4.5;
      }
      Assert.assertEquals(result, b.median(), 0.0001);
   }
   
   @Test public void modeTestA() {
      Assert.assertEquals(4, a.mode());
   }
   @Test public void modeTestC() {
      Assert.assertEquals(8, c.mode());
   }
   
   @Test public void averageTestA() {
      Assert.assertEquals(1.11111111, a.average(), .00001);
   }
   
   @Test public void closestToZeroTestA() {
      Assert.assertEquals(0, a.closestToZero());
   }
   @Test public void closestToZeroTestB() {
      Assert.assertEquals(2, b.closestToZero());
   }
   
   @Test public void sumRowA1() {
      Assert.assertEquals(8, a.sumRow(1));
   }
   
   @Test public void sumColA1() {
      Assert.assertEquals(5, a.sumCol(1));
   }
   
   @Test public void sumRowA0() {
      Assert.assertEquals(7, a.sumRow(0));
   }
   @Test public void sumRowA2() {
      Assert.assertEquals(-5, a.sumRow(2));
   }
   @Test public void sumRowANeg1() {
      Assert.assertEquals(-1, a.sumRow(-1));
   }
   @Test public void sumRowA10() {
      Assert.assertEquals(-1, a.sumRow(10));
   }
   @Test public void sumColA0() {
      Assert.assertEquals(23, a.sumCol(0));
   }
   @Test public void sumColA2() {
      Assert.assertEquals(-18, a.sumCol(2));
   }
   @Test public void sumColANeg1() {
      Assert.assertEquals(-1, a.sumCol(-1));
   }
   @Test public void sumColA10() {
      Assert.assertEquals(-1, a.sumCol(10));
   }
   
   @Test public void sumColC2() {
      Assert.assertEquals(8, c.sumCol(2));
   }
   @Test public void sumRowC2() {
      Assert.assertEquals(-1, c.sumRow(2));
   }
   
   @Test public void sumColD2() {
      Assert.assertEquals(-1, d.sumCol(2));
   }
   @Test public void sumRowD2() {
      Assert.assertEquals(16, d.sumRow(2));
   }
   
   @Test public void sumMainA() {
      Assert.assertEquals(-18, a.sumMain());
   }
   
   @Test public void sumMinorA() {
      Assert.assertEquals(15, a.sumMinor());
   }
   
   @Test public void sumMainC() {
      Assert.assertEquals(-1, c.sumMain());
   }
   @Test public void sumMinorC() {
      Assert.assertEquals(-1, c.sumMinor());
   }
   //
   @Test public void minTestE() {
      Assert.assertEquals(-33, e.min());
   }
   @Test public void maxTestE() {
      Assert.assertEquals(-1, e.max());
   }
   @Test public void medianTestEvenE() throws Exception {
      Class class2D = Class.forName("Array2D");
      Method[] methods2D = class2D.getMethods();
      String end = " ";
      for (Method m : methods2D) {
         if (m.toString().endsWith("median()")) {
            end = m.toString();
         }
      }
      double result = -4;
      if (end.startsWith("public double ")) {
         result = -10.0;
      }
      Assert.assertEquals(result, e.median(), 0.0001);
   }
   @Test public void sumMainE() {
      Assert.assertEquals(-20, e.sumMain());
   }
   @Test public void sumMinorE() {
      Assert.assertEquals(-34, e.sumMinor());
   }
   @Test public void modeTestE() {
      Assert.assertEquals(-10, e.mode());
   }
   @Test public void closestToZeroTestE() {
      Assert.assertEquals(-1, e.closestToZero());
   }
   @Test public void averageTestE() {
      Assert.assertEquals(-13.5, e.average(), .00001);
   }
   @Test public void sumColE20() {
      Assert.assertEquals(-1, e.sumCol(20));
   }
   @Test public void sumColE1() {
      Assert.assertEquals(-11, e.sumCol(0));
   }
   @Test public void sumRowE20() {
      Assert.assertEquals(-1, e.sumRow(20));
   }
   @Test public void sumRowE0() {
      Assert.assertEquals(-43, e.sumRow(0));
   }
   //printing ones
   @Test public void testPrintE() throws Exception {
      //Set outputs of print to output stream 
      System.setOut(new PrintStream(outContent));
     // This is the print call
      e.biggerThanAverage();
      String expectedOutput  = "-10  -1  -10  "; 
     // Do the actual assertion.
      assertEquals(expectedOutput.replace("\r","").trim(),outContent.toString().replace("\r","").trim());
   }
 @Test public void testPrintD() throws Exception {
      //Set outputs of print to output stream 
      System.setOut(new PrintStream(outContent));
     // This is the print call
      d.biggerThanAverage();
      String expectedOutput  = "10  8  8 "; 
     // Do the actual assertion.
      assertEquals(expectedOutput.replace("\r","").trim(),outContent.toString().replace("\r","").trim());
   }
 @Test public void testPrintC() throws Exception {
      //Set outputs of print to output stream 
      System.setOut(new PrintStream(outContent));
     // This is the print call
      c.biggerThanAverage();
      String expectedOutput  = "9  8  8  8  9"; 
     // Do the actual assertion.
      assertEquals(expectedOutput.replace("\r","").trim(),outContent.toString().replace("\r","").trim());
   }
    @Test public void testPrintA() throws Exception {
      //Set outputs of print to output stream 
      System.setOut(new PrintStream(outContent));
     // This is the print call
      a.biggerThanAverage();
      String expectedOutput  = "2  4  10  11  4"; 
     // Do the actual assertion.
      assertEquals(expectedOutput.replace("\r","").trim(),outContent.toString().replace("\r","").trim());
   }
 @Test public void testPrintB() throws Exception {
      //Set outputs of print to output stream 
      System.setOut(new PrintStream(outContent));
     // This is the print call
      b.biggerThanAverage();
      String expectedOutput  = "2  -4"; 
     // Do the actual assertion.
      assertEquals(expectedOutput.replace("\r","").trim(),outContent.toString().replace("\r","").trim());
   }


}
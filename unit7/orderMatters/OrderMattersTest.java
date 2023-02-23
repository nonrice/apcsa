import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.After; //if testing void printing methods
import java.io.*; // if testing void printing methods
import java.lang.reflect.*; //if testing inheritance
import java.util.*; //if testing arrays - Arrays.toString


public class OrderMattersTest {// 15 tests

   private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
   private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
   OrderMatters ob1, ob2, ob3, ob4, ob5, ob6;
   double [] arr1= {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
   double [] arr2= {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0};
   double [] arr3= {1.0, 2.0, 3.0, 4.0};

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
   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
      ob1= new OrderMatters (2, 3);
      ob2= new OrderMatters (3, 2);
      ob3= new OrderMatters (1, 4);
      ob4= new OrderMatters (4, 1);
      ob5= new OrderMatters (4, 3);
      ob6= new OrderMatters (3, 4);
   }
   @Test public void testConstructor2by3() throws Exception {
      //Set outputs of print to output stream 
      System.setOut(new PrintStream(outContent));
     // This is the print call
      ob1.print2D(); 
      String expectedOutput  = "			col 0	col 1	col 2	\r\nrow 0		0.0	0.0	0.0	\r\nrow 1		0.0	0.0	0.0	"; 
      expectedOutput = expectedOutput.replace("\t","");
      String removeT=outContent.toString().replace("\t","");
     // Do the actual assertion.
      assertEquals(expectedOutput.replace("\r","").trim(),removeT.replace("\r","").trim());
   }

   @Test public void testConstructor3by2() throws Exception {
      //Set outputs of print to output stream 
      System.setOut(new PrintStream(outContent));
     // This is the print call
      ob2.print2D(); 
      String expectedOutput  = "			col 0	col 1	\r\nrow 0		0.0	0.0	\r\nrow 1		0.0	0.0	\r\nrow 2		0.0	0.0	"; 
      expectedOutput = expectedOutput.replace("\t","");
      String removeT=outContent.toString().replace("\t","");
     // Do the actual assertion.
      assertEquals(expectedOutput.replace("\r","").trim(),removeT.replace("\r","").trim());
   }
   // rowOrder() tests
   @Test public void testRowOrder1() throws Exception {
      //Set outputs of print to output stream 
      System.setOut(new PrintStream(outContent));
     // This is the print call
      ob1.rowOrder(arr1);
      ob1.print2D(); 
      String expectedOutput  = "			col 0	col 1	col 2	\r\nrow 0		1.0	2.0	3.0	\r\nrow 1		4.0	5.0	6.0	"; 
      expectedOutput = expectedOutput.replace("\t","");
      String removeT=outContent.toString().replace("\t","");
     // Do the actual assertion.
      assertEquals(expectedOutput.replace("\r","").trim(),removeT.replace("\r","").trim());
   }
   @Test public void testRowOrder2() throws Exception {
      //Set outputs of print to output stream 
      System.setOut(new PrintStream(outContent));
     // This is the print call
      ob2.rowOrder(arr1);
      ob2.print2D(); 
      String expectedOutput  = "			col 0	col 1	\r\nrow 0		1.0	2.0	\r\nrow 1		3.0	4.0	\r\nrow 2		5.0	6.0	"; 
      expectedOutput = expectedOutput.replace("\t","");
      String removeT=outContent.toString().replace("\t","");
     // Do the actual assertion.
      assertEquals(expectedOutput.replace("\r","").trim(),removeT.replace("\r","").trim());
   }
   @Test public void testRowOrder3() throws Exception {
      //Set outputs of print to output stream 
      System.setOut(new PrintStream(outContent));
     // This is the print call
      ob3.rowOrder(arr3);
      ob3.print2D(); 
      String expectedOutput  = "			col 0	col 1	col 2	col 3\r\nrow 0		1.0	2.0	3.0	4.0"; 
      expectedOutput = expectedOutput.replace("\t","");
      String removeT=outContent.toString().replace("\t","");
     // Do the actual assertion.
      assertEquals(expectedOutput.replace("\r","").trim(),removeT.replace("\r","").trim());
   }
   @Test public void testRowOrder4() throws Exception {
      //Set outputs of print to output stream 
      System.setOut(new PrintStream(outContent));
     // This is the print call
      ob4.rowOrder(arr3);
      ob4.print2D(); 
      String expectedOutput  = "			col 0	\r\nrow 0		1.0	\r\nrow 1		2.0	\r\nrow 2		3.0	\r\nrow 3		4.0	"; 
      expectedOutput = expectedOutput.replace("\t","");
      String removeT=outContent.toString().replace("\t","");
     // Do the actual assertion.
      assertEquals(expectedOutput.replace("\r","").trim(),removeT.replace("\r","").trim());
   }
    @Test public void testRowOrder5() throws Exception {
      //Set outputs of print to output stream 
      System.setOut(new PrintStream(outContent));
     // This is the print call
      ob5.rowOrder(arr2);
      ob5.print2D(); 
      String expectedOutput  = "			col 0	col 1	col 2	\r\nrow 0		1.0	2.0	3.0	\r\nrow 1		4.0	5.0	6.0	\r\nrow 2		7.0	8.0	9.0	\r\nrow 3		10.0	11.0	12.0"; 
      expectedOutput = expectedOutput.replace("\t","");
      String removeT=outContent.toString().replace("\t","");
     // Do the actual assertion.
      assertEquals(expectedOutput.replace("\r","").trim(),removeT.replace("\r","").trim());
   }
 @Test public void testRowOrder6() throws Exception {
      //Set outputs of print to output stream 
      System.setOut(new PrintStream(outContent));
     // This is the print call
      ob6.rowOrder(arr2);
      ob6.print2D(); 
      String expectedOutput  = "			col 0	col 1	col 2	col 3	\r\nrow 0		1.0	2.0	3.0	4.0	\r\nrow 1		5.0	6.0	7.0	8.0	\r\nrow 2		9.0	10.0	11.0	12.0	"; 
      expectedOutput = expectedOutput.replace("\t","");
      String removeT=outContent.toString().replace("\t","");
     // Do the actual assertion.
      assertEquals(expectedOutput.replace("\r","").trim(),removeT.replace("\r","").trim());
   }
// columnOrder() tests

 @Test public void testColumnOrder6() throws Exception {
      //Set outputs of print to output stream 
      System.setOut(new PrintStream(outContent));
     // This is the print call
      ob6.columnOrder(arr2);
      ob6.print2D(); 
      String expectedOutput  = "			col 0	col 1	col 2	col 3	\r\nrow 0		1.0	4.0	7.0	10.0	\r\nrow 1		2.0	5.0	8.0	11.0	\r\nrow 2		3.0	6.0	9.0	12.0	"; 
      expectedOutput = expectedOutput.replace("\t","");
      String removeT=outContent.toString().replace("\t","");
     // Do the actual assertion.
      assertEquals(expectedOutput.replace("\r","").trim(),removeT.replace("\r","").trim());
   }
 @Test public void testColumnOrder5() throws Exception {
      //Set outputs of print to output stream 
      System.setOut(new PrintStream(outContent));
     // This is the print call
      ob5.columnOrder(arr2);
      ob5.print2D(); 
      String expectedOutput  = "			col 0	col 1	col 2	\r\nrow 0		1.0	5.0	9.0	\r\nrow 1		2.0	6.0	10.0	\r\nrow 2		3.0	7.0	11.0	\r\nrow 3		4.0	8.0	12.0"; 
      expectedOutput = expectedOutput.replace("\t","");
      String removeT=outContent.toString().replace("\t","");
     // Do the actual assertion.
      assertEquals(expectedOutput.replace("\r","").trim(),removeT.replace("\r","").trim());
   }
    @Test public void testColumnOrder2() throws Exception {
      //Set outputs of print to output stream 
      System.setOut(new PrintStream(outContent));
     // This is the print call
      ob2.columnOrder(arr1);
      ob2.print2D(); 
      String expectedOutput  = "			col 0	col 1	\r\nrow 0		1.0	4.0	\r\nrow 1		2.0	5.0	\r\nrow 2		3.0	6.0	"; 
      expectedOutput = expectedOutput.replace("\t","");
      String removeT=outContent.toString().replace("\t","");
     // Do the actual assertion.
      assertEquals(expectedOutput.replace("\r","").trim(),removeT.replace("\r","").trim());
   }

//  wrappedOrder() tests
@Test public void testWrappedOrder5() throws Exception {
      //Set outputs of print to output stream 
      System.setOut(new PrintStream(outContent));
     // This is the print call
      ob5.wrappedOrder(arr2);
      ob5.print2D(); 
      String expectedOutput  = "			col 0	col 1	col 2	\r\nrow 0		1.0	2.0	3.0	\r\nrow 1		6.0	5.0	4.0	\r\nrow 2		7.0	8.0	9.0	\r\nrow 3		12.0	11.0	10.0"; 
      expectedOutput = expectedOutput.replace("\t","");
      String removeT=outContent.toString().replace("\t","");
     // Do the actual assertion.
      assertEquals(expectedOutput.replace("\r","").trim(),removeT.replace("\r","").trim());
   }
   @Test public void testWrappedOrder6() throws Exception {
      //Set outputs of print to output stream 
      System.setOut(new PrintStream(outContent));
     // This is the print call
      ob6.wrappedOrder(arr2);
      ob6.print2D(); 
      String expectedOutput  = "			col 0	col 1	col 2	col 3	\r\nrow 0		1.0	2.0	3.0	4.0	\r\nrow 1		8.0	7.0	6.0	5.0	\r\nrow 2		9.0	10.0	11.0	12.0	"; 
      expectedOutput = expectedOutput.replace("\t","");
      String removeT=outContent.toString().replace("\t","");
     // Do the actual assertion.
      assertEquals(expectedOutput.replace("\r","").trim(),removeT.replace("\r","").trim());
   }
 @Test public void testWrappedOrder1() throws Exception {
      //Set outputs of print to output stream 
      System.setOut(new PrintStream(outContent));
     // This is the print call
      ob1.wrappedOrder(arr1);
      ob1.print2D(); 
      String expectedOutput  = "			col 0	col 1	col 2	\r\nrow 0		1.0	2.0	3.0	\r\nrow 1		6.0	5.0	4.0	"; 
      expectedOutput = expectedOutput.replace("\t","");
      String removeT=outContent.toString().replace("\t","");
     // Do the actual assertion.
      assertEquals(expectedOutput.replace("\r","").trim(),removeT.replace("\r","").trim());
   }
    @Test public void testWrappedOrder2() throws Exception {
      //Set outputs of print to output stream 
      System.setOut(new PrintStream(outContent));
     // This is the print call
      ob2.wrappedOrder(arr1);
      ob2.print2D(); 
      String expectedOutput  = "			col 0	col 1	\r\nrow 0		1.0	2.0	\r\nrow 1		4.0	3.0	\r\nrow 2		5.0	6.0	"; 
      expectedOutput = expectedOutput.replace("\t","");
      String removeT=outContent.toString().replace("\t","");
     // Do the actual assertion.
      assertEquals(expectedOutput.replace("\r","").trim(),removeT.replace("\r","").trim());
   }


}
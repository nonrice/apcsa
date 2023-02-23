import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.After; //if testing void printing methods
import java.io.*; // if testing void printing methods
import java.lang.reflect.*; //if testing inheritance
import java.util.*; //if testing arrays - Arrays.toString

public class MessageCipherTest {
   private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
   private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
   
   MessageCipher m1 = new MessageCipher(2, 4); 
   String[][] s1 = {{"S","u","r","p"},{"r","i","s","e"}}; 
   MessageCipher m2 = new MessageCipher(3, 5);
   String[][] s2 = {{"M", "e", "e", "t", " "},
                     {"a", "t", " ", "m", "i"},
                     {"d", "n", "i", "g", "h"}}; 
   MessageCipher m3 = new MessageCipher(3, 5);
   String[][] s3 = {{"M", "e", "e", "t", " "},
                     {"a", "t", " ", "n", "o"},
                     {"o", "n", "A", "A", "A"}}; 
                     
   MessageCipher m4 = new MessageCipher(2, 3);
   MessageCipher m5 = new MessageCipher(4, 4);
   MessageCipher m6 =new MessageCipher(4,6);
   MessageCipher m7 =new MessageCipher(4,6);
    MessageCipher m10 =new MessageCipher(3,3);

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

   @Before public void setUp() {
      m1.fillBlock("Surprise");
      m2.fillBlock("Meet at midnight");
      m3.fillBlock("Meet at noon");
      m6.fillBlock("The quick brown fox jumped over the yellow lazy dogs");
    m10.fillBlock("The quick brown fox jumped over the yellow lazy dogs");

   }
    
    /////////////
   @Test public void fillBlockTestSurprise() {
      Assert.assertArrayEquals(s1, m1.getTable());
   }
   @Test public void fillBlockTestMAM() {
      Assert.assertArrayEquals(s2, m2.getTable());
   }
   @Test public void fillBlockTestMAN() {
      Assert.assertArrayEquals(s3, m3.getTable());
   }
    
   @Test public void encryptBlockTestSurprise() {
      Assert.assertEquals("Sruirspe", m1.encryptBlock());
   }
   @Test public void encryptBlockTestMAM() {
      Assert.assertEquals("Madetne itmg ih", m2.encryptBlock());
   }
   @Test public void encryptBlockTestMAN() {
      Assert.assertEquals("Maoetne AtnA oA", m3.encryptBlock());
   }
    
   @Test public void encryptMessageTestMAM() {
      Assert.assertEquals("Mte eati dmnitgAhA", m4.encryptMessage("Meet at midnight"));
   }
    
   @Test public void encryptMessageTestFox1() {
      Assert.assertEquals("Tqkohu weibn cr fjevoudexm r po tyoahewzel y ll dAAAoAAAgAAAsAAA", m5.encryptMessage("The quick brown fox jumped over the yellow lazy dogs"));
   }
// printing testing
   @Test public void testPrintTable1() throws Exception {
      //Set outputs of print to output stream 
      System.setOut(new PrintStream(outContent));
     // This is the print call
      m2.printTable();
      String expectedOutput  = "M  e  e  t     \r\na  t     m  i  \r\nd  n  i  g  h"; 
     // Do the actual assertion.
      assertEquals(expectedOutput.replace("\r","").trim(),outContent.toString().replace("\r","").trim());
   }
   @Test public void testPrintTable2() throws Exception {
      //Set outputs of print to output stream 
      System.setOut(new PrintStream(outContent));
     // This is the print call
      m3.printTable();
      String expectedOutput  = "M  e  e  t     \r\na  t     n  o  \r\no  n  A  A  A  "; 
     // Do the actual assertion.
      assertEquals(expectedOutput.replace("\r","").trim(),outContent.toString().replace("\r","").trim());
   }
   @Test public void testPrintTableEmpty() throws Exception {
      //Set outputs of print to output stream 
      System.setOut(new PrintStream(outContent));
     // This is the print call
      m7.printTable();
      String expectedOutput  = "null  null  null  null  null  null  \r\nnull  null  null  null  null  null  \r\nnull  null  null  null  null  null  \r\nnull  null  null  null  null  null  "; 
     // Do the actual assertion.
      assertEquals(expectedOutput.replace("\r","").trim(),outContent.toString().replace("\r","").trim());
   }
   @Test public void testFillBlockFox() throws Exception {
      //Set outputs of print to output stream 
      System.setOut(new PrintStream(outContent));
     // This is the print call
      m6.printTable();
      String expectedOutput  = "T  h  e     q  u  \r\ni  c  k     b  r  \r\no  w  n     f  o  \r\nx     j  u  m  p  "; 
     // Do the actual assertion.
      assertEquals(expectedOutput.replace("\r","").trim(),outContent.toString().replace("\r","").trim());
   }
   @Test public void encryptBlockTestFox() {
      Assert.assertEquals("Tioxhcw eknj   uqbfmurop", m6.encryptBlock());
   }
 @Test public void encryptMessageTestFox2() {
      Assert.assertEquals("Tioxhcw eknj   uqbfmuropery d el tlaohlzveoye w dAAAoAAAgAAAsAAAAAAAAAAA", m6.encryptMessage("The quick brown fox jumped over the yellow lazy dogs"));
   }
@Test public void encryptMessageTestFox3() {
      Assert.assertEquals("T ihqceuk o bwfrnoxue mdjp orhv eet yl eollwazdsyoA gA", m10.encryptMessage("The quick brown fox jumped over the yellow lazy dogs"));
   }
}
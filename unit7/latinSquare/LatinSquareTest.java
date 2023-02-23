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

public class LatinSquareTest {  // 28 tests
   int [] aa= {8,5,7,6,9};
   int [] bb= {7,5,8,9,6 };
   int [] dup= {7,5,7,7,6 };
   int [] dup2= {-1,-1 };
   int [] cc= {8,7,1,9,6};
   int [] dd= {4, 3,2};
   int [] ee= {2,4, 3};
   int [] ff= {-5, 4,3};
   int [] gg= {3};

   int [][] aa1= {{8,5,7,6,9}};

   int [][] array=    {{1, 2, 3, 4, 5, 6, 7, 8}, 
                       {3, 5, 8, 1, 3, 9, 0, 0},
                       {1, 8, 9, 0, 1, 1, 1, 1}};

   int [][] arr= {{12}};
   int [][] ar=       {{1, 2, -3}, 
                       {3, -5, 8},
                       {1, 8, 9},
                       {1, -8, 9},
                       {-1, 8, 9},
                       {1, 8, -9}};
                       
   int [][] a=        {{10, 2, -3}, 
                       {-8, -5, -8},
                       {1, 81, 9}};
   int [][] a1=        {{1, 2, 3}, 
                       {2, 3, 1},
                       {3, 1, 2}};
   int [][] a2=        {{10,30, 20, 0}, 
                       {0, 20, 30, 10},
                       {30,0,10,20},
                       {20,10,0,30}};

   int [][] a3=        {{1, 2, 1}, 
                       {2, 1, 1},
                       {1, 1, 2}};
   int [][] a4=        {{1, 2}, 
                       {1, 2}};
   int [][] a5=        {{1, 2}, 
                       {2, 1}};
   int [][] a6=        {{1,2,3,4,5}, 
                        {5,1,2,3,4},
                        {4,5,1,2,3},
                        {3,4,5,1,2},
                        {2,3,4,5,1}};
                   
               

                              
   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
// test getColumn()
   @Test(timeout=1000) public void getColumn3by8() {
      Assert.assertArrayEquals(new int[]{5,3,1}, LatinSquare.getColumn(array, 4));
   }
   @Test(timeout=1000) public void getColumn1by1() {
      Assert.assertArrayEquals(new int[]{12}, LatinSquare.getColumn(arr, 0));
   }
   @Test(timeout=1000) public void getColumn6by3() {
      Assert.assertArrayEquals(new int[]{2,-5,8,-8,8,8}, LatinSquare.getColumn(ar, 1));
   }
   @Test(timeout=1000) public void getColumn3by3() {
      Assert.assertArrayEquals(new int[]{-3,-8,9}, LatinSquare.getColumn(a, 2));
   }
// test hasAllValues()
   @Test(timeout=1000) public void hasAllValuesAABB (){
      Assert.assertEquals("Element in two arrays match!", true, LatinSquare.hasAllValues(aa, bb));
   }
   @Test(timeout=1000) public void hasAllValuesAACC (){
      Assert.assertEquals("Element in arrays do not match!", false, LatinSquare.hasAllValues(aa, cc));
   }
   @Test(timeout=1000) public void hasAllValuesBBCC (){
      Assert.assertEquals("Element in arrays do not match!", false, LatinSquare.hasAllValues(bb, cc));
   }
   @Test(timeout=1000) public void hasAllValuesDDEE (){
      Assert.assertEquals("Element in two arrays match!", true, LatinSquare.hasAllValues(ee,dd));
   }
   @Test(timeout=1000) public void hasAllValuesEEFF (){
      Assert.assertEquals("Element in arrays do not match!", false, LatinSquare.hasAllValues(ee, ff));
   }
  // test containsDuplicates()
   @Test(timeout=1000) public void containsDuplicatesEE (){
      Assert.assertEquals("Ther are no Duplicates!", false, LatinSquare.containsDuplicates(ee));
   }
   @Test(timeout=1000) public void containsDuplicatesGG (){
      Assert.assertEquals("Ther are no Duplicates!", false, LatinSquare.containsDuplicates(gg));
   }
   @Test(timeout=1000) public void containsDuplicatesDup (){
      Assert.assertEquals("Ther are some duplicates!", true, LatinSquare.containsDuplicates(dup));
   }
   @Test(timeout=1000) public void containsDuplicatesDup2 (){
      Assert.assertEquals("Ther are some duplicates!", true, LatinSquare.containsDuplicates(dup2));
   }
   @Test(timeout=1000) public void containsDuplicatesArrayRow0 (){
      Assert.assertEquals("Ther are no Duplicates!", false, LatinSquare.containsDuplicates(array[0]));
   }
   @Test(timeout=1000) public void containsDuplicatesArRow2 (){
      Assert.assertEquals("Ther are no Duplicates!", false, LatinSquare.containsDuplicates(ar[2]));
   }
   @Test(timeout=1000) public void containsDuplicatesArrRow0 (){
      Assert.assertEquals("Ther are no Duplicates!", false, LatinSquare.containsDuplicates(arr[0]));
   }
   @Test(timeout=1000) public void containsDuplicatesARow1 (){
      Assert.assertEquals("Ther are some duplicates!", true, LatinSquare.containsDuplicates(a[1]));
   }
   @Test(timeout=1000) public void containsDuplicatesArrayRow2 (){
      Assert.assertEquals("Ther are some duplicates!", true, LatinSquare.containsDuplicates(array[2]));
   }

   
// test isLatin()
   @Test(timeout=1000) public void isLatinNotSquare1() {
      Assert.assertEquals("It's not a square Matrix", false, LatinSquare.isLatin(array));
   }
   @Test(timeout=1000) public void isLatinNotSquare2() {
      Assert.assertEquals("It's not a square Matrix", false, LatinSquare.isLatin(aa1));
   }
   @Test(timeout=1000) public void isLatinFalse1() {
      Assert.assertEquals("Not Latin Square", false, LatinSquare.isLatin(array));
   }
   @Test(timeout=1000) public void isLatinFalse2() {
      Assert.assertEquals("Not Latin Square", false, LatinSquare.isLatin(a3));
   }
   @Test(timeout=1000) public void isLatinFalse3() {
      Assert.assertEquals("Not Latin Square", false, LatinSquare.isLatin(a4));
   }
  
   @Test(timeout=1000) public void isLatinTrue1() {
      Assert.assertEquals("Latin Square found!", true, LatinSquare.isLatin(a1));
   }
   @Test(timeout=1000) public void isLatinTrue2() {
      Assert.assertEquals("Latin Square found!", true, LatinSquare.isLatin(a2));
   }
   @Test(timeout=1000) public void isLatinTrue3() {
      Assert.assertEquals("Latin Square found!", true, LatinSquare.isLatin(arr));
   }
   @Test(timeout=1000) public void isLatinTrue4() {
      Assert.assertEquals("Latin Square found!", true, LatinSquare.isLatin(a5));
   }
   @Test(timeout=1000) public void isLatinTrue5() {
      Assert.assertEquals("Latin Square found!", true, LatinSquare.isLatin(a6));
   }

}

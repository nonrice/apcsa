import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class GradableTest {
   private Student john, paul;
   private DriversEd george , ringo;
   private Kindergarten ella, nick;

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
      john = new Student("John");
      paul = new Student("Paul");  
      george = new DriversEd("George");
      ringo = new DriversEd("Ringo");
      ella= new Kindergarten("Ella");
      nick= new Kindergarten("Nick");
   }
   //
   @Test (timeout=1000) public void implementsGradableTest1 () throws Exception{   
      Class drEdClass=Class.forName("DriversEd");
      Class [] drEdInterfaces=drEdClass.getInterfaces();
      Assert.assertEquals("interface Gradable",drEdInterfaces[0].toString());    
   }  
   
    @Test (timeout=1000) public void implementsGradableTest2 () throws Exception{   
      Class studentClass=Class.forName("Student");
      Class [] studentInterfaces=studentClass.getInterfaces();
      Assert.assertEquals("interface Gradable",studentInterfaces[0].toString());    
   }
   
   @Test (timeout=1000) public void implementsGradableTest3 () throws Exception{   
      Class kindergartenClass=Class.forName("Kindergarten");
      Class [] kindergartenInterfaces=kindergartenClass.getInterfaces();
      Assert.assertEquals("interface Gradable",kindergartenInterfaces[0].toString());    
   }  
   //
   @Test (timeout=1000) public void testStudentConstructor (){  
      Assert.assertEquals("John",john.getName());  
      Assert.assertEquals("Paul",paul.getName());  }
      
   @Test (timeout=1000) public void testDriversEdConstructor (){  
      Assert.assertEquals("George",george.getName());  
      Assert.assertEquals("Ringo",ringo.getName());  }
      
   @Test (timeout=1000) public void testKindergartenConstructor (){  
      Assert.assertEquals("Ella",ella.getName());  
      Assert.assertEquals("Nick",nick.getName());  }
      
   @Test (timeout=1000) public void test_getPercentJohn (){ 
      Assert.assertEquals(0,john.getPercent(), 0.01); 
      john.addTestScore(94.5);        
      john.addTestScore(45);
      john.addTestScore(29);
      john.addTestScore(99);
      Assert.assertEquals(66.875,john.getPercent(), 0.01); 
   }
   
   @Test (timeout=1000) public void test_isPassingJohn (){ 
      john.addTestScore(94.5);        
      john.addTestScore(45);
      john.addTestScore(29);
      john.addTestScore(99);
      Assert.assertEquals(true,john.isPassing());
   }
//
   @Test (timeout=1000) public void test_getPercentPaul (){
      Assert.assertEquals(0,paul.getPercent(), 0.01);
      paul.addTestScore(74);
      paul.addTestScore(82);
      paul.addTestScore(0);
      paul.addTestScore(71);
      Assert.assertEquals(56.75,paul.getPercent(), 0.01); 
   }
   @Test (timeout=1000) public void test_isPassingtPaul (){
      paul.addTestScore(74);
      paul.addTestScore(82);
      paul.addTestScore(0);
      paul.addTestScore(71);
      Assert.assertEquals(false,paul.isPassing()); 
   }
//
   @Test (timeout=1000) public void test_getPercentGeorge (){
      Assert.assertEquals(100,george.getPercent(), 0.01);
      george.deductPoints(5);
      george.deductPoints(4);
      george.deductPoints(7);
      Assert.assertEquals(84,george.getPercent(), 0.01); 
   }
   
   @Test (timeout=1000) public void test_getPercentRingo (){
      Assert.assertEquals(100,ringo.getPercent(), 0.01);
      ringo.deductPoints(1);
      ringo.deductPoints(9);
      ringo.deductPoints(2);
      Assert.assertEquals(88,ringo.getPercent(), 0.01); 
   }
   @Test (timeout=1000) public void test_isPassingGeorge (){
      george.deductPoints(5);
      george.deductPoints(4);
      george.deductPoints(7);
      Assert.assertEquals(false,george.isPassing()); 
   }
   @Test (timeout=1000) public void test_isPassingRingo (){
      ringo.deductPoints(1);
      ringo.deductPoints(9);
      ringo.deductPoints(2);
      Assert.assertEquals(true,ringo.isPassing()); 
   }
   @Test (timeout=1000) public void test_getPercentElla (){
      Assert.assertEquals(0,ella.getPercent(), 0.01);
      ella.addStars(1);
      ella.addStars(9);
      ella.addStars(2);
      Assert.assertEquals(12,ella.getPercent(), 0.01); 
   }
   @Test (timeout=1000) public void test_getPercentNick (){
      Assert.assertEquals(0,nick.getPercent(), 0.01);
      nick.addStars(10);
      nick.addStars(29);
      nick.addStars(25);
      Assert.assertEquals(64,nick.getPercent(), 0.01); 
   }
   @Test (timeout=1000) public void test_isPassingElla (){
      ella.addStars(1);
      ella.addStars(9);
      ella.addStars(2);
      Assert.assertEquals(false,ella.isPassing()); 
   }
   @Test (timeout=1000) public void test_isPassingNick (){
      nick.addStars(10);
      nick.addStars(29);
      nick.addStars(25);
      Assert.assertEquals(true,nick.isPassing()); 
   }                
}





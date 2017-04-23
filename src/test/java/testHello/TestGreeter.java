package hello;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestGreeter {

   private Greeter g;
  
   @Before
   public void setUp() throws Exception 
   {
      g = new Greeter();
   }

   @Test
   public void testGreeterEmpty() 
   {
      assertEquals(g.getName(),"");
      assertEquals(g.sayHello(),"Hello!");
   }
  
   @Test
   public void testGreeter() 
   {
      g.setName("World");
      assertEquals(g.getName(),"World");
      assertEquals(g.sayHello(),"Hello World!");
   }

   @Test
   public void newTestZsmGreeterPass()
   {
      g.setName("Tx State");
      assertEquals(g.getName(),"Tx State");
      assertEquals(g.sayHello(),"Hello Tx State!");
   }

   @Test
   public void newTestZsmGreeterFail()
   {
      g.setName("Tx State");
      assertEquals(g.getName(),"Wrench in the Works");
      assertEquals(g.sayHello(),"Hello Tx State!");
   }
}
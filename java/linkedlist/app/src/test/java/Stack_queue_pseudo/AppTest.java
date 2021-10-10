package Stack_queue_pseudo;

import Stack.StackStructure;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

 class AppTest {
   @Test
   @DisplayName("Can successfully Enqueue")
   void test1() {
     Pseudo_Structure pseudo=new Pseudo_Structure();
     pseudo.Enqueue("1");


     assertEquals("1", pseudo.Deqeue());
   }
   @Test
   @DisplayName("Can successfully Dequeue")
   void test2() {
     Pseudo_Structure pseudo=new Pseudo_Structure();
     pseudo.Enqueue("1");


     assertEquals("1", pseudo.Deqeue());
   }@Test
   @DisplayName("Enqeueu multibile")
   void test3() {
     Pseudo_Structure pseudo=new Pseudo_Structure();
     pseudo.Enqueue("1");
     pseudo.Enqueue("2");
     pseudo.Enqueue("3");
     pseudo.Enqueue("4");

     assertEquals("1", pseudo.Deqeue());
   }
   @Test
   @DisplayName("return empty if i want to enqeue on an epmty list")
   void test4() {
     Pseudo_Structure pseudo=new Pseudo_Structure();


     assertEquals("list is empty", pseudo.Deqeue());
   }
}

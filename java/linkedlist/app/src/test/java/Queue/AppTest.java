package Queue;
import Stack.StackStructure;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AppTest {
  @Test
  @DisplayName("Can successfully enqueue into a queue")
  void test8()   {
    QueueStructure Q=new QueueStructure();

    Q.enqueue("s");




    assertEquals("{ s } -> NULL", Q.to_string());
  }
  @Test
  @DisplayName("Can successfully enqueue multiple values into a queue")
  void test9()   {
    QueueStructure Q=new QueueStructure();
    Q.enqueue("s");
    Q.enqueue("t");
    Q.enqueue("a");



    assertEquals("{ s } -> { t } -> { a } -> NULL", Q.to_string());
  }
  @Test
  @DisplayName("Can successfully dequeue out of a queue the expected value")
  void test10()   {
    QueueStructure Q=new QueueStructure();
    Q.enqueue("s");
    Q.enqueue("t");
    Q.enqueue("a");




    assertEquals("s", Q.dequeue());
  }
  @Test
  @DisplayName("Can successfully peek into a queue, seeing the expected value")
  void test11()  throws Exception {
    QueueStructure Q=new QueueStructure();
    Q.enqueue("s");
    Q.enqueue("t");
    Q.enqueue("a");






    assertEquals("s", Q.peek());
  }
  @Test
  @DisplayName("Can successfully empty a queue after multiple dequeues")
  void test12()  throws Exception {
    QueueStructure Q=new QueueStructure();
    Q.enqueue("s");
    Q.enqueue("t");
    Q.enqueue("a");
    Q.dequeue();
    Q.dequeue();
    Q.dequeue();


    assertEquals("List is empty", Q.to_string());
  }
  @Test
  @DisplayName("Can successfully instantiate an empty queue")
  void test13()  throws Exception {
    QueueStructure Q=new QueueStructure();




    assertEquals("List is empty", Q.to_string());
  }
  @Test
  @DisplayName("Calling dequeue or peek on empty queue raises exception")
  void test14()  throws Exception {
    QueueStructure Q=new QueueStructure();



    assertThrows(java.lang.Exception.class, Q::peek);
  }
}

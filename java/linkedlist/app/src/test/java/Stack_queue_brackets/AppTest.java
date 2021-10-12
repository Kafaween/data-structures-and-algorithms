package Stack_queue_brackets;
import Stack_queue_pseudo.Pseudo_Structure;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AppTest {
  @Test
  @DisplayName("should return True")
  void test1() {
    Stack_queue_brackets_structure s= new Stack_queue_brackets_structure();
    String test= "{}";

    assertEquals(true, s.Check_brackets(test));
  }
  @Test
  @DisplayName("should return True")
  void test2() {
    Stack_queue_brackets_structure s= new Stack_queue_brackets_structure();
    String test= "()[[Extra Characters]]";

    assertEquals(true, s.Check_brackets(test));
  }
  @Test
  @DisplayName("should return True")
  void test3() {
    Stack_queue_brackets_structure s= new Stack_queue_brackets_structure();
    String test= "{}{Code}[Fellows](())";

    assertEquals(true, s.Check_brackets(test));
  }
  @Test
  @DisplayName("should return False")
  void test4() {
    Stack_queue_brackets_structure s= new Stack_queue_brackets_structure();
    String test= "[({}]";

    assertEquals(false, s.Check_brackets(test));
  }
  @Test
  @DisplayName("should return False")
  void test5() {
    Stack_queue_brackets_structure s= new Stack_queue_brackets_structure();
    String test= "{";

    assertEquals(false, s.Check_brackets(test));
  }
  @Test
  @DisplayName("should return False")
  void test6() {
    Stack_queue_brackets_structure s= new Stack_queue_brackets_structure();
    String test= ")";

    assertEquals(false, s.Check_brackets(test));
  }
  @Test
  @DisplayName("should return False")
  void test7() {
    Stack_queue_brackets_structure s= new Stack_queue_brackets_structure();
    String test= "[}";

    assertEquals(false, s.Check_brackets(test));
  }
}

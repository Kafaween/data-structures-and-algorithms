package Stack_queue_brackets;

public class App {
  public static void main(String[] args) {
    Stack_queue_brackets_structure s= new Stack_queue_brackets_structure();
    String test= "[}";
    System.out.println(s.Check_brackets(test));
  }
}

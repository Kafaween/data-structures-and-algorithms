package Stack;

public class App {
  public static void main(String[] args) throws Exception {
            StackStructure stack=new StackStructure();
            stack.push("s");
             stack.push("t");
               stack.push("a");
               stack.push("r");
    System.out.println(stack.to_string());
    System.out.println(stack.pop());
    System.out.println(stack.to_string());
    System.out.println(stack.peek());


  }
}

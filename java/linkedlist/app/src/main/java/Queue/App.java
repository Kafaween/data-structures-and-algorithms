package Queue;

import Stack.StackStructure;

public class App {
  public static void main(String[] args) {
    QueueStructure Q=new QueueStructure();

    Q.enqueue("s");
    Q.enqueue("t");
    Q.enqueue("a");
    Q.enqueue("r");
    System.out.println(Q.to_string());
    System.out.println(Q.dequeue());
    System.out.println(Q.dequeue());
    System.out.println(Q.to_string());
  }

}

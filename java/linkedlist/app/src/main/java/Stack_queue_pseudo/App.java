package Stack_queue_pseudo;

public class App {
  public static void main(String[] args) {
    Pseudo_Structure pseudo=new Pseudo_Structure();
    System.out.println(pseudo.Deqeue());
    pseudo.Enqueue("1");
    pseudo.Enqueue("2");
    pseudo.Enqueue("3");
    pseudo.Enqueue("4");
    pseudo.Enqueue("5");
    System.out.println(pseudo.Deqeue());
    System.out.println(pseudo.to_string());
    System.out.println(pseudo.Deqeue());
    pseudo.Enqueue("7");
    pseudo.Enqueue("8");
    System.out.println(pseudo.to_string());
    System.out.println(pseudo.Deqeue());
    System.out.println(pseudo.to_string());

  }

}

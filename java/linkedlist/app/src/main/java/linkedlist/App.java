/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedlist;

public class App {

    public static void main(String[] args) {

      System.out.println("---------------------------------");
      linkedlistStructure list =new linkedlistStructure();
      System.out.println(list.to_string());
      System.out.println("--------------------------");
      list.insert("3");
      list.insert("5");
      list.insert("1");
      list.insert("9");
      System.out.println(list.to_string());
      System.out.println( list.includes("3"));
      list.append("10");
      System.out.println(list.to_string());
      list.insert_before("5","15");
      System.out.println(list.to_string());
      list.insert_after("5","16");
      System.out.println(list.to_string());

      list.linked_list_kth(6);
      System.out.println(list.linked_list_kth(2));

    }
}

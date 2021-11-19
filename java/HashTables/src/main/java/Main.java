import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    HashTable<String, String> hashTable1 = new HashTable<>();
    HashTable<String, String> hashTable2 = new HashTable<>();
//    TreeStrucutre<String> tree1= new TreeStrucutre();
//    tree1.insert("150");
//    tree1.insert("100");
//    tree1.insert("250");
//    tree1.insert("75");
//    tree1.insert("160");
//    tree1.insert("200");
//    tree1.insert("350");
//    tree1.insert("300");
//    tree1.insert("500");
//    tree1.insert("125");
//    tree1.insert("175");
//    TreeStrucutre<String> tree2= new TreeStrucutre();
//    tree2.insert("42");
//    tree2.insert("100");
//    tree2.insert("600");
//    tree2.insert("15");
//    tree2.insert("160");
//    tree2.insert("200");
//    tree2.insert("350");
//    tree2.insert("4");
//    tree2.insert("500");
//    tree2.insert("125");
//    tree2.insert("175");
//    studentAllowances.add("John", 300);
//    studentAllowances.add("Sally", 400);
//    studentAllowances.add("Tom", 200);
//    studentAllowances.add("Jade", 100);
//    studentAllowances.add("Doa", 600);
//    studentAllowances.add("Farah", 700);
//    studentAllowances.add("Jason", 90000);
//    studentAllowances.add("Morgan", 800);
//    studentAllowances.add("Naim", 1000);
//    studentAllowances.add("Qusai", 1500);
//    studentAllowances.add("Deyaa", 10000);
//
//    System.out.println("The size is => " + hashTable.getSize());
//    System.out.println("The Sally allowance is => " + hashTable.get("Sally"));
//    System.out.println("Delete Sally => " + hashTable.remove("Sally"));
//    System.out.println("The size is => " + hashTable.getSize());
//    System.out.println(hashTable.contains("doa"));
//    String s="It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
//    System.out.println(hashTable.hashmap_repeated_word(s));
//    System.out.println(hashTable.tree_intersection(tree1,tree2).toString());
    ;
//    hashTable1.add("fond", "enamored");
//    hashTable1.add("wrath", "anger");
//    hashTable1.add("diligent", "employed");
//    hashTable1.add("outfit", "garb");
//    hashTable1.add("guide", "usher");
//
//    hashTable2.add("fond", "averse");
//    hashTable2.add("wrath", "delight");
//    hashTable2.add("diligent", "idle");
//    hashTable2.add("guide", "follow");
//    hashTable2.add("flow", "jam");
//    List<List<String>> listOfLists =hashTable1.hashmap_left_join(hashTable1,hashTable2);
//    System.out.println(listOfLists);
    String string="In a galaxy away far  far  away";
    String answer=hashTable1.most_common_word(string);
    System.out.println(answer);
  }
}

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class tree_intersection {
  @Test
  @DisplayName("Checks for all the diplicate and return them in a list")
  void test1()   {
    HashTable<String, Integer> hashTable = new HashTable<>();
    TreeStrucutre<String> tree1= new TreeStrucutre();
    tree1.insert("150");
    tree1.insert("100");
    tree1.insert("250");
    tree1.insert("75");
    tree1.insert("160");
    tree1.insert("200");
    tree1.insert("350");
    tree1.insert("300");
    tree1.insert("500");
    tree1.insert("125");
    tree1.insert("175");
    TreeStrucutre<String> tree2= new TreeStrucutre();
    tree2.insert("42");
    tree2.insert("100");
    tree2.insert("600");
    tree2.insert("15");
    tree2.insert("160");
    tree2.insert("200");
    tree2.insert("350");
    tree2.insert("4");
    tree2.insert("500");
    tree2.insert("125");
    tree2.insert("175");




    assertEquals("[100, 125, 160, 175, 200, 350, 500]", hashTable.tree_intersection(tree1,tree2).toString());
  }
}

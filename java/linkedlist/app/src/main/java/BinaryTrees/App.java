package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    TreeStrucutre<Integer> binaryTree= new TreeStrucutre<>();
    binaryTree.insert(10);
    binaryTree.insert(5);
    binaryTree.insert(2);
    binaryTree.insert(15);
    binaryTree.insert(12);
    binaryTree.insert(20);
    binaryTree.inorderTraversal();
    System.out.println("---------in order----------");
    binaryTree.PreorderTraversal();
    System.out.println("-----------pre order--------");
    binaryTree.PostorderTraversal();
    System.out.println("------------post order--------");
//    System.out.println(binaryTree.Contains(20));
    int max =binaryTree.findMax();
    System.out.println(max);
    List<Integer>  list;
    list= binaryTree.tree_breadth_first(binaryTree);
    System.out.println(list);

  }
}

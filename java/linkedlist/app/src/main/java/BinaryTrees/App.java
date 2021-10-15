package BinaryTrees;

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
    System.out.println(binaryTree.Contains(20));


  }
}

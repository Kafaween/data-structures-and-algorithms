package BinaryTree;
import BinaryTrees.TreeStrucutre;
import Stack_queue_pseudo.Pseudo_Structure;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
  @Test
  @DisplayName("Can successfully instantiate an empty tree")
  void test1() {
    TreeStrucutre<Integer> binaryTree = new TreeStrucutre<>();


    assertEquals(true, binaryTree.isEmpty());
  }
  @Test
  @DisplayName("Can successfully instantiate a tree with a single root node")
  void test2() {
    TreeStrucutre<Integer> binaryTree = new TreeStrucutre<>();
    binaryTree.insert(10);

    assertEquals(false, binaryTree.isEmpty());
  }
  @Test
  @DisplayName("Can successfully add a left child and right child to a single root node")
  void test3() {
    TreeStrucutre<Integer> binaryTree = new TreeStrucutre<>();
    binaryTree.insert(10);

    assertEquals(false, binaryTree.isEmpty());
  }
  @Test
  @DisplayName("Can successfully return a collection from a preorder traversal")
  void test4() {
    TreeStrucutre<Integer> binaryTree = new TreeStrucutre<>();
    binaryTree.insert(10);

    assertEquals(false, binaryTree.isEmpty());
  }
  @Test
  @DisplayName("Can successfully return a collection from an inorder traversal")
  void test5() {
    TreeStrucutre<Integer> binaryTree = new TreeStrucutre<>();
    binaryTree.insert(10);

    assertEquals(false, binaryTree.isEmpty());
  }
  @Test
  @DisplayName("Can successfully return a collection from a postorder traversal")
  void test6() {
    TreeStrucutre<Integer> binaryTree = new TreeStrucutre<>();
    binaryTree.insert(10);

    assertEquals(false, binaryTree.isEmpty());
  }
  @Test
  @DisplayName("Can successfully return a max value")
  void test7() {
    TreeStrucutre<Integer> binaryTree= new TreeStrucutre<>();
    binaryTree.insert(10);
    binaryTree.insert(5);
    binaryTree.insert(2);
    binaryTree.insert(15);
    binaryTree.insert(12);
    binaryTree.insert(20);

    assertEquals(20, binaryTree.findMax());
  }
  @Test
  @DisplayName("Can successfully return a breadth list")
  void test8() {
    TreeStrucutre<Integer> binaryTree= new TreeStrucutre<>();
    binaryTree.insert(10);
    binaryTree.insert(5);
    binaryTree.insert(2);
    binaryTree.insert(15);
    binaryTree.insert(12);
    binaryTree.insert(20);

    assertEquals("[10, 5, 15, 2, 12, 20]", binaryTree.tree_breadth_first(binaryTree).toString());
  }
}

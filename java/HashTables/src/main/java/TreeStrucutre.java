import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeStrucutre<T extends Comparable<T>> {
  private TreeNode<T> root;
  static String str;
  static Integer max = 0;
 public List<T> tree= new ArrayList<>();
  public TreeStrucutre() {
  }

  public void insert(T data) {
    if (this.root == null) {
      this.root = new TreeNode(data);
    } else {
      this.insertHelper(this.root, data);
    }
  }

  private void insertHelper(TreeNode<T> root, T data) {
    TreeNode<T> node = new TreeNode(data);
    if (((Comparable)root.getValue()).compareTo(data) > 0) {
      if (root.getLeft() == null) {
        root.setLeft(node);
      } else {
        this.insertHelper(root.getLeft(), data);
      }
    } else if (((Comparable)root.getValue()).compareTo(data) < 0) {
      if (root.getRight() == null) {
        root.setRight(node);
      } else {
        this.insertHelper(root.getRight(), data);
      }
    }
  }

  public void inorderTraversal() {
    if (!this.isEmpty()) {

      this.traverseInorder(this.root);
    }
  }
  private void traverseInorder(TreeNode<T> root) {

    if (root.getLeft() != null) {
      this.traverseInorder(root.getLeft());
    }
    tree.add(root.getValue());
    if (root.getRight() != null) {
      this.traverseInorder(root.getRight());
    }


  }




  public boolean isEmpty() {
    return this.root == null;
  }
}

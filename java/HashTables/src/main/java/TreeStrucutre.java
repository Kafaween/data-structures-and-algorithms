import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeStrucutre<T extends Comparable<T>> {
  private TreeNode<T> root;
  static String str;
  static Integer max = 0;

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

    System.out.print(root.getValue() + " -> ");
    if (root.getRight() != null) {
      this.traverseInorder(root.getRight());
    }

  }

  public void PreorderTraversal() {
    if (!this.isEmpty()) {
      this.traversePreorder(this.root);
    }
  }

  private void traversePreorder(TreeNode<T> root) {
    System.out.print(root.getValue() + " -> ");
    if (root.getLeft() != null) {
      this.traversePreorder(root.getLeft());
    }

    if (root.getRight() != null) {
      this.traversePreorder(root.getRight());
    }

  }

  public void PostorderTraversal() {
    if (!this.isEmpty()) {
      this.traversePostorder(this.root);
    }
  }

  private void traversePostorder(TreeNode<T> root) {
    if (root.getLeft() != null) {
      this.traversePostorder(root.getLeft());
    }

    if (root.getRight() != null) {
      this.traversePostorder(root.getRight());
    }

    System.out.print(root.getValue() + " -> ");
  }

  public boolean Contains(T data) {
    while(this.root != null) {
      if (((Comparable)this.root.getValue()).compareTo(data) == 0) {
        return true;
      }

      if (((Comparable)this.root.getValue()).compareTo(data) > 0) {
        this.root = this.root.getLeft();
      } else {
        this.root = this.root.getRight();
      }
    }

    return false;
  }

  public int findMax() {
    if (this.isEmpty()) {
      return 0;
    } else {
      max = this.findMaxHelper(this.root);
      return max;
    }
  }

  private int findMaxHelper(TreeNode<T> root) {
    if (((Comparable)root.getValue()).compareTo(max) > 0) {
      max = (Integer)root.getValue();
    }

    if (root.getLeft() != null) {
      this.findMaxHelper(root.getLeft());
    }

    if (root.getRight() != null) {
      this.findMaxHelper(root.getRight());
    }

    return max;
  }



  public boolean isEmpty() {
    return this.root == null;
  }
}

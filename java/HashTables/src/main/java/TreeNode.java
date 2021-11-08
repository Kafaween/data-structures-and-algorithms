public class TreeNode<T> {
  private T value;
  private TreeNode<T> left;
  private TreeNode<T> right;

  public TreeNode(T value) {
    this.value = value;
  }

  public TreeNode<T> getLeft() {
    return this.left;
  }

  public void setLeft(TreeNode<T> left) {
    this.left = left;
  }

  public TreeNode<T> getRight() {
    return this.right;
  }

  public void setRight(TreeNode<T> right) {
    this.right = right;
  }

  public T getValue() {
    return this.value;
  }

  public void setValue(T value) {
    this.value = value;
  }
}

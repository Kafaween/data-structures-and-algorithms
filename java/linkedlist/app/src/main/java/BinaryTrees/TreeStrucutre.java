package BinaryTrees;

import java.util.*;

public class TreeStrucutre<T extends Comparable<T>> {
  private TreeNode<T> root;
  static String str;
  static Integer max=0;
  public void insert(T data){
    if(root==null) root = new TreeNode<>(data);
    else{
          insertHelper(root,data);
    }
  }
  private void insertHelper(TreeNode<T> root,T data){
    TreeNode<T> node= new TreeNode<>(data);
    if(root.getValue().compareTo(data)>0){
      if(root.getLeft()==null){
        root.setLeft(node);
      }
      else{
        insertHelper(root.getLeft(),data);
      }
    }
    else if (root.getValue().compareTo(data)<0){
      if(root.getRight()==null){
        root.setRight(node);
      }
      else{
        insertHelper(root.getRight(),data);
      }
    }
  }


  public void inorderTraversal() {
    if (isEmpty()) {
      return;
    }
    traverseInorder(root);
  }
  private void traverseInorder(TreeNode<T> root) {
    if (root.getLeft() != null) {
      traverseInorder(root.getLeft());
    }
    System.out.print(root.getValue() + " -> ");
    if (root.getRight() != null) {
      traverseInorder(root.getRight());
    }
  }

  public void PreorderTraversal() {
    if (isEmpty()) {
      return;
    }
    traversePreorder(root);
  }
  private void traversePreorder(TreeNode<T> root) {
    System.out.print(root.getValue() + " -> ");
    if (root.getLeft() != null) {
      traversePreorder(root.getLeft());
    }

    if (root.getRight() != null) {
      traversePreorder(root.getRight());
    }
  }

  public void  PostorderTraversal() {
    if (isEmpty()) {
      return;
    }
    traversePostorder(root);
  }
  private void  traversePostorder(TreeNode<T> root){
    if (root.getLeft() != null) {
      traversePostorder(root.getLeft());
    }
    if (root.getRight() != null) {
      traversePostorder(root.getRight());
    }
    System.out.print(root.getValue() + " -> ");
  }

  public  boolean Contains( T data)
  {
    while(root != null)
    {
      if(root.getValue().compareTo(data)==0) return true;
      if(root.getValue().compareTo(data)>0) root = root.getLeft();
      else root = root.getRight();
    }
    return false;
  }

  public  int findMax() {
    if (isEmpty()) {
      return 0;
    }
    max=  findMaxHelper(root);
    return max;
  }
  private int findMaxHelper(TreeNode<T> root) {
    if(root.getValue().compareTo((T)max)>0){
      max= (Integer) root.getValue();
    }
    if (root.getLeft() != null) {
      findMaxHelper(root.getLeft());
    }

    if (root.getRight() != null) {
      findMaxHelper(root.getRight());
    }
    return (Integer) max;
  }

  public  List<T> tree_breadth_first(TreeStrucutre<T> tree) {
    if (isEmpty()) {
      return null;
    }
    List<T> breadth= new ArrayList<>();
  TreeNode<T> node=tree.root;
    Queue<TreeNode<T>> queue = new LinkedList<>();
    queue.add(node);
    while (!queue.isEmpty()){

      if(queue.peek().getLeft()!=null){
        queue.add(queue.peek().getLeft());
      }
      if(queue.peek().getRight()!=null){
        queue.add(queue.peek().getRight());
      }
      breadth.add(queue.poll().getValue());
    }

  return breadth;
  }


  public boolean isEmpty(){
    if (root==null){
      return true;
    }
    else return false;
  }
}

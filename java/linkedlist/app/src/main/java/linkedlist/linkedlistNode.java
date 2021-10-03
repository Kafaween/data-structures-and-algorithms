package linkedlist;

public class linkedlistNode {
  private String value;
  private linkedlistNode Next;




  public linkedlistNode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public linkedlistNode getNext() {
    return Next;
  }

  public void setNext(linkedlistNode next) {
    Next = next;
  }

  @Override
  public String toString() {
    return value;
  }
}





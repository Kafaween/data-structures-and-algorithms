package Node;



public class Node {



    private String value;
    private Node Next;




    public Node(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    public void setValue(String value) {
      this.value = value;
    }

    public Node getNext() {
      return Next;
    }

    public void setNext(Node next) {
      Next = next;
    }

    @Override
    public String toString() {
      return value;
    }
  }







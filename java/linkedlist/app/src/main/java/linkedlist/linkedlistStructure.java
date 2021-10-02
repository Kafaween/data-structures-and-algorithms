package linkedlist;

public class linkedlistStructure {
  protected  linkedlistNode head;
  private int size;


  public void insert(String value){
    if(head ==null){
      linkedlistNode node=new linkedlistNode(value);
      head=node;
      size++;
    }
    else{
      linkedlistNode node =new linkedlistNode((value));
      node.setNext(head);
      head=node;
      size++;
    }
  }

  public boolean includes(String value){
    if(is_empty()) {
      System.out.println("\n The list is empty ");
      return false;
    }
    else {
      System.out.println("Is "+value+"in the kist ???");
      linkedlistNode current;
      current=head;
      while (current!=null){
        if(current.getValue()==value){
          return true;
        }
        else{
          current=current.getNext();
        }
      }
    }
    return false;
  }

  public String to_string() {
    if (head == null) {
      return "List is empty";
    } else {
      linkedlistNode current;
      current = head;
      String output="";



      while (current != null) {
        // moves the current reference along the list
        output=output+("{ "+current+" }" + " -> ");
        current = current.getNext();
      }

      return (output+"NULL");
    }
  }
  public int size() {
    return size;
  }
  public boolean is_empty(){
    if (size==0){
      return true ;
    }
    else{
      return false;
    }
  }
}

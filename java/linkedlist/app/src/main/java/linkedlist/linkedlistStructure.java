package linkedlist;

public class linkedlistStructure {
  protected  linkedlistNode head;
  private int size;

  public String linked_list_kth(int k){

    if(is_empty()){
      return "this list is empty";
    }
    else{
    if(k<0){
      return "Exception";
    }
    int counter=size-k-1;
    if(counter<0){
      return "Exception";
    }

    linkedlistNode c ;
    c=head;
    while (c.getNext()!=null && counter!=0){
      c=c.getNext();
      counter--;

    }
    return c.getValue();
    }
  }





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

  public  void  append(String value){
    if(head==null){
      linkedlistNode node = new linkedlistNode(value);
      head=node;
      size++;
    }
    else{
      linkedlistNode currunt;
      currunt=head;
      while(currunt.getNext()!=null){
        currunt=currunt.getNext();
      }
      linkedlistNode node=new linkedlistNode(value);
      currunt.setNext(node);
      size++;
    }
  }

public void insert_before(String value,String new_value){
  if(is_empty()) {
    System.out.println("\n The list is empty ");

  }
  else {
    boolean is_here=false;
    boolean first=false;
    linkedlistNode currunt;
    linkedlistNode node=new linkedlistNode(new_value);
    currunt=head;
    if(currunt.getValue()==value){
      first=true;
    }
    else {
    while (currunt.getNext()!=null){
      if(currunt.getNext().getValue()==value){
        is_here=true;
        break;
      }
      currunt=currunt.getNext();
    }}
    if(is_here==true){
      linkedlistNode temp=currunt.getNext();
      currunt.setNext(node);
      node.setNext(temp);
      size++;

    }
    else if(first==true){
      node.setNext(currunt);
      head=node;
      size++;
    }
    else{
      System.out.println("item is not in the list");
    }
  }
}


  public void insert_after(String value,String new_value){
    if(is_empty()) {
      System.out.println("\n The list is empty ");

    }
    else {
      boolean is_here=false;
      linkedlistNode currunt;
      linkedlistNode node=new linkedlistNode(new_value);
      currunt=head;

      while (currunt.getNext()!=null){
        if(currunt.getValue()==value){
          is_here=true;
          break;
        }
        currunt=currunt.getNext();
      }
      if(is_here==true){
        linkedlistNode temp=currunt.getNext();
        currunt.setNext(node);
        node.setNext(temp);
        size++;

      }
      else if(currunt.getValue()==value){

        currunt.setNext(node);
        size++;
      }
      else{
        System.out.println("item is not in the list");
      }
    }
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

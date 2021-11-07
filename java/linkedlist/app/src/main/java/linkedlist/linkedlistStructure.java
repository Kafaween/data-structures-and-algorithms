package linkedlist;
import Node.Node;
public class linkedlistStructure {
  protected  Node head;
  private int size;

  public linkedlistStructure Test(){
    Node current=head;
    linkedlistStructure l1= new linkedlistStructure();
    linkedlistStructure l2= new linkedlistStructure();
    boolean odd=true;
    while (current!=null){
      if(odd) {
        l1.append(current.getValue());
        odd=false;
      }
      else {
        l2.append(current.getValue());
        odd=true;
      }
      current=current.getNext();
    }
    current=l1.head;
    while (current.getNext()!=null){
      current=current.getNext();
    }
    current.setNext(l2.head);
    return l1;
  }
















//  public void Sort(){
//    Node max= head;
//    Node current= head.getNext();
//    Node prev= head;
//
//    while (current!=null){
//      if(Integer.parseInt(current.getValue())<Integer.parseInt(max.getValue())){
//        Node tmp= current.getNext();
//        current.setNext(max);
//        max=current;
//       prev.setNext(tmp);
//       current=tmp;
//      }
//      else {
//        current =  current.getNext();
//        prev =  prev.getNext();
//      }
//    }
//    head=max;
//  }








  public Node linked_list_zip(linkedlistStructure l1,linkedlistStructure l2){
   Node current1= l1.head;
    Node current2= l2.head;
    Node tmp;
    Node tmp2=current2;
    if(l1.size>l2.size){

    while (current1!=null&&current2!=null){
      tmp=current1.getNext();
      tmp2=current2;
      current2=current2.getNext();
      current1.setNext(tmp2);
      current1.getNext().setNext(tmp);
      current1=current1.getNext().getNext();
    }}
    else{
      while (current1.getNext()!=null&&current2.getNext()!=null){
        tmp=current1.getNext();
        tmp2=current2;
        current2=current2.getNext();
        current1.setNext(tmp2);
        current1.getNext().setNext(tmp);
        current1=current1.getNext().getNext();

      }
        current1.setNext(current2);
      }

    return l1.head;
  }

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

    Node c ;
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
      Node node=new Node(value);
      head=node;
      size++;
    }
    else{
      Node node =new Node((value));
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
      Node current;
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
      Node node = new Node(value);
      head=node;
      size++;
    }
    else{
      Node currunt;
      currunt=head;
      while(currunt.getNext()!=null){
        currunt=currunt.getNext();
      }
      Node node=new Node(value);
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
    Node currunt;
    Node node=new Node(new_value);
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
      Node temp=currunt.getNext();
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
      Node currunt;
      Node node=new Node(new_value);
      currunt=head;

      while (currunt.getNext()!=null){
        if(currunt.getValue()==value){
          is_here=true;
          break;
        }
        currunt=currunt.getNext();
      }
      if(is_here==true){
        Node temp=currunt.getNext();
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
      Node current;
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

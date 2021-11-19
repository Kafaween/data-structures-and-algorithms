package linkedlist;

import java.util.Stack;

public class Test {
  private   linkedlistNode head;
  private int size;

  public boolean palindrom(){
    linkedlistNode current= head;
    Stack stack= new Stack();
    while (current!=null){
      stack.push(current.getValue());
      current=(linkedlistNode) current.getNext();
    }
    current=head;
    while (current!=null&&!stack.isEmpty()){
      if(!(current.getValue().equals(stack.pop()))){
        return false;
      }
      current=(linkedlistNode) current.getNext();
    }
    return true;
  }

  public void Reverse(){
    linkedlistNode current=head;
    linkedlistNode prev= null;
    linkedlistNode next = null;
    while (current!=null){
      next=(linkedlistNode) current.getNext();
      current.setNext(prev);
      prev=current;
      current=next;
    }
    head=prev;
  }
//  public linkedlistNode Zip(Test l1,Test l2){
//    if(l1.size==0&&l2.size==0)return null;
//
//   linkedlistNode current1=l1.head;
//    linkedlistNode current2=l2.head;
//    while (current1!=null&&current2!=null){
//      linkedlistNode tmp=(linkedlistNode) current1.getNext();
//      linkedlistNode tmp2=(linkedlistNode)current2.getNext();
//      current1.setNext();
//    }
//  }
  public void InsertAfter(String value,String newV){
    if(head==null){
      System.out.println("list is empty");
    }
    else if(value.equals(head.getValue())){
      linkedlistNode node= new linkedlistNode(newV);
      linkedlistNode tmp=(linkedlistNode) head.getNext();
      head.setNext(node);
      node.setNext(tmp);
      size++;
      return;
    }
    linkedlistNode current=head;
    linkedlistNode node= new linkedlistNode(newV);
    boolean Notfound=true;
    while(current!=null&&Notfound){
      if(value.equals(current.getValue())){
        linkedlistNode tmp=(linkedlistNode) current.getNext();
        current.setNext(node);
        node.setNext(tmp);
        size++;
        Notfound=false;
      }
      current=(linkedlistNode) current.getNext();
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
          current= (linkedlistNode) current.getNext();
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
        current =(linkedlistNode) current.getNext();
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

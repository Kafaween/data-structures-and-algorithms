package Stack;
import Node.Node;
public class StackStructure {
  private StackNode top;
  private int size=0;

  public boolean isEmpty(){
    if(top==null){
      return true;
    }
    else{
      return false;
    }
  }



  public void push(String value){
    if(isEmpty()){
      StackNode stacknode=new StackNode(value);
      top=stacknode;
      size++;
    }
    else{
      StackNode stacknode=new StackNode(value);
      stacknode.setNext(top);
      top=stacknode;
      size++;
    }
  }

  public String pop(){
    if(isEmpty()){
      return "list is empty";
    }
    else{
      String value =top.getValue();
      top=(StackNode) top.getNext();
      size--;
      return value;
    }
  }
  public String peek() throws Exception {
    if(isEmpty()){
      throw new Exception("this list is epmty");
    }
    else{
      return top.getValue();
    }
  }
  public String to_string() {
    if (top == null) {
      return "List is empty";
    } else {
      StackNode current;
      current = top;
      String output="";



      while (current != null) {
        // moves the current reference along the list
        output=output+("{ "+current+" }" + " -> ");
        current =(StackNode) current.getNext();
      }

      return (output+"NULL");
    }
  }
}

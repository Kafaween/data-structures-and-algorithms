package Queue;

import Stack.StackNode;

import java.io.IOException;

public class QueueStructure {
  private QueueNode front;
  private QueueNode rear;
  private int size;


  public void enqueue(String value){
    if(isEpmty()){
      QueueNode Qnode=new QueueNode(value);
      front=Qnode;
      rear=Qnode;
      size++;
    }
    else{
      QueueNode Qnode =new QueueNode(value);
      rear.setNext(Qnode);
      rear=Qnode;
      size++;
    }

  }

  public String dequeue(){
    if(isEpmty()){
      return "this list is empty";
    }
    else{
      String value = front.getValue();
      front=(QueueNode) front.getNext();
      size--;
      return value;
    }

  }
  public String peek() throws Exception {
    if(isEpmty()){
      throw new Exception("this list is epmty");
    }
    else{
      return front.getValue();
    }
  }
  public boolean isEpmty(){
    if(front==null){
      return true;
    }
    return false;
  }
  public String to_string() {
    if (front == null) {
      return "List is empty";
    } else {
      QueueNode current;
      current = front;
      String output="";



      while (current != null) {
        // moves the current reference along the list
        output=output+("{ "+current+" }" + " -> ");
        current =(QueueNode) current.getNext();
      }

      return (output+"NULL");
    }
  }
}

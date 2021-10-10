package Stack_queue_pseudo;

import Stack.StackNode;
import Stack.StackStructure;

public class Pseudo_Structure {
  private StackStructure stack1=new StackStructure();
  private StackStructure stack2=new StackStructure();
  private int size=0;

  public void Enqueue(String value){
   stack1.push(value);
  }
  public String Deqeue(){
    if(stack1.isEmpty()&&stack2.isEmpty()){
        return "list is empty";
      }
      else if(stack2.isEmpty()) {
        while (!stack1.isEmpty()) {
          stack2.push(stack1.pop());

        }
      String x = stack2.pop();
      return x;
      }
      else {

      String x = stack2.pop();
      return x;
      }

  }
  public String to_string() {
   return "stack one : "+stack1.to_string()+"||"+"stack two : "+stack2.to_string();
  }

  public int getSize() {
    return size;
  }


}

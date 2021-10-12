package Stack_queue_brackets;

import java.util.Stack;

public class Stack_queue_brackets_structure {
  private Stack stack=new Stack();

  public boolean Check_brackets(String string){
    String[] arr = string.split("");
    boolean answer=true;
    for (String ch: arr) {
      if(ch.equals("{")||ch.equals("[")||ch.equals("(")){
        stack.push(ch);
      }
      else if((ch.equals("}")||ch.equals("]")||ch.equals(")"))&&!stack.isEmpty()){
        String tmp = (String) stack.pop();
        if(ch.equals("}")&&tmp.equals("{")||ch.equals("]")&&tmp.equals("[")||ch.equals(")")&&tmp.equals("(")){
          answer=true;
        }
        else {
          return false;
        }
      }
      else if((ch.equals("}")||ch.equals("]")||ch.equals(")"))&&stack.isEmpty()){
        return false;
      }
    }
    if(!stack.isEmpty()){
      return false;
    }
    return true;
  }
}

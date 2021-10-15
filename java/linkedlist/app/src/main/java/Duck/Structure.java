package Duck;

import Queue.QueueStructure;

public class Structure {

  public  String answer(String[] arr,int k){
    QueueStructure Q=new QueueStructure();
    for (int i=0;i<arr.length;i++) {
      Q.enqueue(arr[i]);
    }
    for (int i=0;i<arr.length-1;i++) {
      for (int x = 1; x < k; x++) {
        Q.enqueue(Q.dequeue());
      }
      Q.dequeue();
    }
    return Q.dequeue();

  }
}

package Stack_queue_animal_shelter;


import Queue.QueueStructure;

public class AnimalShelter {
  QueueStructure cat = new Queue.QueueStructure();
  QueueStructure dog = new Queue.QueueStructure();


  public void enqueue(Animal animal) {
    if (animal instanceof Cat) {
      cat.enqueue(animal.getType());
    } else if (animal instanceof Dog) {
      dog.enqueue(animal.getType());
    } else {
      System.out.println("neither dog nor cat");
    }
  }

  public String dequeue(String pref) {
    if (pref.equals("cat") && !cat.isEpmty()) {
      return cat.dequeue();
    } else if (pref.equals("dog") && !dog.isEpmty()) {
      return dog.dequeue();
    } else {
      return null;
    }
  }

  public String to_string(){
    return "dogs :" +dog.to_string() + "  ||| cats :"+cat.to_string();
  }
}

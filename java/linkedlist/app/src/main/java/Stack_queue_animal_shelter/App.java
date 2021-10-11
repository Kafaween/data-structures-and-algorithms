package Stack_queue_animal_shelter;

public class App {
  public static void main(String[] args) {
    AnimalShelter animalShelter= new AnimalShelter();
    Animal dog=new Dog();
    Animal cat= new Cat();
    animalShelter.enqueue(dog);
    animalShelter.enqueue(cat);
    animalShelter.enqueue(dog);
    animalShelter.enqueue(dog);
    animalShelter.enqueue(cat);
    animalShelter.enqueue(dog);
    animalShelter.dequeue("cat");
    animalShelter.dequeue("dog");
    System.out.println(animalShelter.to_string());
  }
}

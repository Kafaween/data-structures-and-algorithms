package Stack_queue_animal_shelter;
import Stack.StackStructure;
import Stack_queue_pseudo.Pseudo_Structure;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AppTest {
  @Test
  @DisplayName("Can successfully Enqueue")
  void test1() {
    AnimalShelter animalShelter= new AnimalShelter();
    Animal dog=new Dog();
    Animal cat= new Cat();
    animalShelter.enqueue(dog);
    animalShelter.enqueue(cat);
    animalShelter.enqueue(dog);

    assertEquals("dogs :{ dog } -> { dog } -> NULL  ||| cats :{ cat } -> NULL", animalShelter.to_string());
  }
  @Test
  @DisplayName("Can successfully Denqueue a cat ")
  void test2() {
    AnimalShelter animalShelter= new AnimalShelter();
    Animal dog=new Dog();
    Animal cat= new Cat();
    animalShelter.enqueue(dog);
    animalShelter.enqueue(cat);
    animalShelter.enqueue(dog);
    animalShelter.dequeue("cat");

    assertEquals("dogs :{ dog } -> { dog } -> NULL  ||| cats :List is empty", animalShelter.to_string());
  }
  @Test
  @DisplayName("Can successfully Denqueue a dog ")
  void test3() {
    AnimalShelter animalShelter= new AnimalShelter();
    Animal dog=new Dog();
    Animal cat= new Cat();
    animalShelter.enqueue(dog);
    animalShelter.enqueue(cat);
    animalShelter.enqueue(dog);
    animalShelter.dequeue("cat");
    animalShelter.dequeue("dog");

    assertEquals("dogs :{ dog } -> NULL  ||| cats :List is empty", animalShelter.to_string());
  }
}

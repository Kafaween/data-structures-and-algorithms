import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class hashmap_left_join {
  @Test
  @DisplayName("Checks for the first dulpicated in a tring")
  void test1()   {
    HashTable<String, String> hashTable1 = new HashTable<>();
    HashTable<String, String> hashTable2 = new HashTable<>();

    hashTable1.add("fond", "enamored");
    hashTable1.add("wrath", "anger");
    hashTable1.add("diligent", "employed");
    hashTable1.add("outfit", "garb");
    hashTable1.add("guide", "usher");

    hashTable2.add("fond", "averse");
    hashTable2.add("wrath", "delight");
    hashTable2.add("diligent", "idle");
    hashTable2.add("guide", "follow");
    hashTable2.add("flow", "jam");

    assertEquals("[[diligent, employed, idle], [wrath, anger, delight], [fond, enamored, averse], [guide, usher, follow], [outfit, garb, null]]", hashTable1.hashmap_left_join(hashTable1,hashTable2).toString());
  }
}

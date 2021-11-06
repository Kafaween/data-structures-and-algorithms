import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class HashTableTest {
  @Test
  @DisplayName("Adding a key/value to your hashtable results in the value being in the data structure")
  void test1()   {
    HashTable<String, Integer> studentAllowances = new HashTable<>();
    studentAllowances.add("John", 300);
    studentAllowances.add("Sally", 400);
    studentAllowances.add("Tom", 200);




    assertEquals(3, studentAllowances.getSize());
  }
  @Test
  @DisplayName("Retrieving based on a key returns the value stored")
  void test2()   {
    HashTable<String, Integer> studentAllowances = new HashTable<>();
    studentAllowances.add("John", 300);
    studentAllowances.add("Sally", 400);
    studentAllowances.add("Tom", 200);




    assertEquals(400, studentAllowances.get("Sally"));
  }
  @Test
  @DisplayName("Successfully returns null for a key that does not exist in the hashtable")
  void test3()   {
    HashTable<String, Integer> studentAllowances = new HashTable<>();
    studentAllowances.add("John", 300);
    studentAllowances.add("Sally", 400);
    studentAllowances.add("Tom", 200);


    assertNull(studentAllowances.get("ally"));
  }
  @Test
  @DisplayName("Successfully handle a collision within the hashtable")
  void test4()   {
    HashTable<String, Integer> studentAllowances = new HashTable<>();
    studentAllowances.add("Johnn", 300);
    studentAllowances.add("Sally", 400);
    studentAllowances.add("Tom", 200);




    assertEquals(null, studentAllowances.get("ally"));
  }
  @Test
  @DisplayName("Successfully handle a collision within the hashtable")
  void test5()   {
    HashTable<String, Integer> studentAllowances = new HashTable<>();
    studentAllowances.add("Johnn", 300);
    studentAllowances.add("Sally", 400);
    studentAllowances.add("Tom", 200);




    assertEquals(null, studentAllowances.get("ally"));
  }
  @Test
  @DisplayName("Successfully handle a collision within the hashtable")
  void test6()   {
    HashTable<String, Integer> studentAllowances = new HashTable<>();
    studentAllowances.add("Johnn", 300);
    studentAllowances.add("Sally", 400);
    studentAllowances.add("Tom", 200);




    assertEquals(null, studentAllowances.get("ally"));
  }
}

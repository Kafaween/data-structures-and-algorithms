import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class hashmap_repeated_word {
  @Test
  @DisplayName("Checks for the first dulpicated in a tring")
  void test1()   {
    HashTable<String, Integer> hashTable = new HashTable<>();
    String s="It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";




    assertEquals("summer", hashTable.hashmap_repeated_word(s));
  }
  @Test
  @DisplayName("Checks for the first dulpicated in a tring")
  void test2()   {
    HashTable<String, Integer> hashTable = new HashTable<>();
    String s="It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";




    assertEquals("it", hashTable.hashmap_repeated_word(s));
  }
}

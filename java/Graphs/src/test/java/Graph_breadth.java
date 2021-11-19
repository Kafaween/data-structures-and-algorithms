import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
public class Graph_breadth {
    @Test
  @DisplayName("can traversal using breadth in right order")
  void test1()   {
      Graphs graph = new Graphs();
      graph.addNode("Pandora");
      graph.addNode("Metroville");
      graph.addNode("Arendelle");
      graph.addNode("New Monstropolis");
      graph.addNode("Naboo");
      graph.addNode("Narnia");

      graph.addEdge("Pandora", "Arendelle",150);
      graph.addEdge("Pandora", "Metroville",82);
      graph.addEdge("Arendelle", "Metroville",99);
      graph.addEdge("Arendelle", "New Monstropolis",42);
      graph.addEdge("Metroville", "New Monstropolis",105);
      graph.addEdge("Metroville", "Naboo",26);
      graph.addEdge("Metroville", "Narnia",37);
      graph.addEdge("New Monstropolis", "Naboo",73);
      graph.addEdge("Naboo", "Narnia",250);
      var x =graph.getNode("Pandora");

    assertEquals("[Narnia, Pandora, Naboo, Metroville, Arendelle, New Monstropolis]", graph.breadth(x).toString());
  }
}

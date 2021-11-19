import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Graph_bussnies_trip {
  @Test
  @DisplayName("Node can be successfully added to the graph")
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
    String[] fly1={"Naboo", "Pandora"};
    System.out.println();
    assertEquals("False, $0", graph.graph_business_trip(fly1));
    String[] fly2={"Metroville", "Pandora"};
    assertEquals("True, $82", graph.graph_business_trip(fly2));
  }
}

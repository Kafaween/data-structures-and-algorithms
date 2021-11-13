import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class Graph {
  @Test
  @DisplayName("Node can be successfully added to the graph")
  void test1()   {
    Graphs graph = new Graphs();
    graph.addNode("Fellow 1");
    graph.addNode("Fellow 2");
    assertEquals(2, graph.size());
  }
  @Test
  @DisplayName("An edge can be successfully added to the graph")
  void test2()   {
    Graphs graph = new Graphs();
    graph.addNode("Fellow 1");
    graph.addNode("Fellow 2");
    graph.addNode("Fellow 3");
    graph.addEdge("Fellow 1", "Fellow 2");

    assertEquals("[Fellow 2]", graph.getNeighbors("Fellow 1").toString());
  }
  @Test
  @DisplayName("A collection of all nodes can be properly retrieved from the graph")
  void test3()   {
    Graphs graph = new Graphs();
    graph.addNode("Fellow 1");
    graph.addNode("Fellow 2");
    graph.addNode("Fellow 3");
    graph.addEdge("Fellow 1", "Fellow 2");

    assertEquals("[Fellow 3, Fellow 2, Fellow 1]", graph.getNodes().toString());
  }
  @Test
  @DisplayName("All appropriate neighbors can be retrieved from the graph")
  void test4()   {
    Graphs graph = new Graphs();
    graph.addNode("Fellow 1");
    graph.addNode("Fellow 2");
    graph.addNode("Fellow 3");
    graph.addEdge("Fellow 1", "Fellow 2");
    graph.addEdge("Fellow 1", "Fellow 3");

    assertEquals("[Fellow 2, Fellow 3]", graph.getNeighbors("Fellow 1").toString());
  }
  @Test
  @DisplayName("Neighbors are returned with the weight between nodes included")
  void test5()   {
    Graphs graph = new Graphs();
    graph.addNode("Fellow 1");
    graph.addNode("Fellow 2");
    graph.addNode("Fellow 3");
    graph.addEdge("Fellow 1", "Fellow 2");

    assertEquals("[Fellow 2]", graph.getNeighbors("Fellow 1").toString());
  }
  @Test
  @DisplayName("The proper size is returned, representing the number of nodes in the graph")
  void test6()   {
    Graphs graph = new Graphs();
    graph.addNode("Fellow 1");
    graph.addNode("Fellow 2");




    assertEquals(2, graph.size());
  }
  @Test
  @DisplayName("A graph with only one node and edge can be properly returned")
  void test7()   {
    Graphs graph = new Graphs();
    graph.addNode("Fellow 1");
    graph.addEdge("Fellow 1", "Fellow 1");




    assertEquals("Fellow 1 is connected to [Fellow 1]", graph.print());
  }
  @Test
  @DisplayName("An empty graph properly returns null")
  void test8()   {
    Graphs graph = new Graphs();

    assertNull( graph.print());
  }
}

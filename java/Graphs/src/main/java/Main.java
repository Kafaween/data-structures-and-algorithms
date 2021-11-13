public class Main {
  public static void main(String[] args) {
    Graphs graph = new Graphs();
    graph.addNode("Fellow 1");
    graph.addNode("Fellow 2");
    graph.addNode("Fellow 3");
    graph.addNode("Fellow 4");

    graph.addEdge("Fellow 1", "Fellow 2");
    graph.addEdge("Fellow 1", "Fellow 3");
    graph.addEdge("Fellow 1", "Fellow 4");
    graph.addEdge("Fellow 2", "Fellow 1");
    graph.addEdge("Fellow 2", "Fellow 3");
    graph.addEdge("Fellow 3", "Fellow 1");
    graph.addEdge("Fellow 3", "Fellow 4");
    graph.addEdge("Fellow 4", "Fellow 2");
    graph.addEdge("Fellow 4", "Fellow 3");

    System.out.println(graph.print());
    System.out.println(graph.getNodes());
    System.out.println(graph.getNeighbors("Fellow 1"));
    System.out.println(graph.size());
  }
}

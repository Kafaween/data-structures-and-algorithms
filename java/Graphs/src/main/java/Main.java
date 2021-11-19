public class Main {
  public static void main(String[] args) {
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

    System.out.println(graph.print());
    System.out.println(graph.getNodes());
    System.out.println(graph.getNeighbors("Fellow 1"));
    System.out.println(graph.size());
    var x =graph.getNode("Pandora");
    graph.breadth(x);
    String[] fly1={"Naboo", "Pandora"};
    System.out.println(graph.graph_business_trip(fly1));
    graph.graph_depth_first("Arendelle");
    System.out.println("--------------------------------------------------------------");
    System.out.println(graph.connected("Pandora","Naboo"));

  }
}

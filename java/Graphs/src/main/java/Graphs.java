import java.util.*;

public class Graphs {
  private static class Node {
    private final String label;

    public Node(String label) {
      this.label = label;
    }
    @Override
    public boolean equals(Object object) {
      Node node = (Node) object;
      return Objects.equals(label, node.label);
    }
    @Override
    public int hashCode() {
      return Objects.hash(label);
    }
    @Override
    public String toString() {
      return label;
    }
  }

  private final Map<Node, List<Node>> adjacencyList = new HashMap<>();
  private final Map<String, Node> nodes = new HashMap<>();

  public Node addNode(String value) {
    Node node = new Node(value);
    nodes.putIfAbsent(value, node);
    adjacencyList.putIfAbsent(node, new ArrayList<>());
    return node;
  }

  public void addEdge(String from, String to) {
    Node fromNode = nodes.get(from);
    if (fromNode == null)
      throw new IllegalArgumentException("It's empty and this is not a valid node");
    Node toNode = nodes.get(to);
    if (toNode == null)
      throw new IllegalArgumentException("It's empty and this is not a valid node");
    adjacencyList.get(fromNode).add(toNode);
//        adjacencyList.get(toNode).add(fromNode); //
  }

  public Set<Node> getNodes() {
    return adjacencyList.keySet();
  }

  public List<Node> getNeighbors(String value) {
    Node collection = new Node(value);
    return adjacencyList.get(collection);
  }

  public int size() {
    return adjacencyList.size();
  }

  public String print() {
    if(adjacencyList.size()==0){
      return null;
    }
    var print = "";
    for (Node source : adjacencyList.keySet()) {
      var targets = adjacencyList.get(source);
      if (!targets.isEmpty()) {
        print += source + " is connected to " + targets+" ,";
      }
    }
    return print;
  }
}

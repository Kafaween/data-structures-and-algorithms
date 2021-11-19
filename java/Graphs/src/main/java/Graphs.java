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
  private static class Edge{
    private Node destination;
    private int weight;

    public Edge(Node destination, int weight) {
      this.destination = destination;
      this.weight = weight;
    }

    @Override
    public String toString() {
      return destination+" {"+weight+"}";
    }
  }

  private final Map<Node, List<Edge>> adjacencyList = new HashMap<>();
  private final Map<String, Node> nodes = new HashMap<>();
  private Set<Node> set = new HashSet<>();

 public boolean connected(String node1,String node2){
   boolean isPath=false;
     Node from= nodes.get(node1);
     Node to= nodes.get(node2);
     if(from==null&&to==null)
       return false;
     for(Edge neighbour :adjacencyList.get(from))
       if(to.equals(neighbour.destination)){
         isPath=true;
         break;
       }
     if(!isPath)
       return false;
return true;
 }











  public Set<Node> graph_depth_first(String root){
  Set<Node> visited= new HashSet<>();
  Node node=nodes.get(root);
  if(node==null)
    return null;
    graph_depth_first(node,visited);
    return set;

  }
  private void graph_depth_first(Node root,Set<Node> visited){
    System.out.println(root);
    set.add(root);
    visited.add(root);
    for(Edge neighbour :adjacencyList.get(root))
      if(!visited.contains(neighbour.destination))
        graph_depth_first(neighbour.destination,visited);
  }







  public String graph_business_trip(String[] cities){
    int cost=0;
      for (int i=0 ;i<cities.length-1;i++){
          Node from= nodes.get(cities[i]);
        Node to= nodes.get(cities[i+1]);
        if(from==null&&to==null)
          return "False, $0";
        boolean isPath=false;
        for(Edge neighbour :adjacencyList.get(from))
          if(to.equals(neighbour.destination)){
            cost=cost+neighbour.weight;
            isPath=true;
            break;
      }
        if(!isPath)
          return "False, $0";
      }
      return "True, $"+cost;
  }







  public Set<Node> breadth(Node node){
   Set<Node> set= new HashSet<>();
    if(nodes.get(node.label)==null)
      return null;
    Set<Node> visited= new HashSet<>();
    Queue<Node> queue = new ArrayDeque<>();
    queue.add(node);
    while (!queue.isEmpty()){
       Node current= queue.remove();
       if(visited.contains(current))
         continue;
      System.out.println(current);
      set.add(current);
      visited.add(current);

      for(Edge neighbour :adjacencyList.get(current))
        if(!visited.contains(neighbour.destination))
          queue.add(neighbour.destination);
    }
    return set;
  }




  public Node addNode(String value) {
    Node node = new Node(value);
    nodes.putIfAbsent(value, node);
    adjacencyList.putIfAbsent(node, new ArrayList<>());
    return node;
  }

  public void addEdge(String from, String to,int weight) {
    Node fromNode = nodes.get(from);
    if (fromNode == null)
      throw new IllegalArgumentException("It's empty and this is not a valid node");
    Node toNode = nodes.get(to);
    if (toNode == null)
      throw new IllegalArgumentException("It's empty and this is not a valid node");
    Edge edgefrom= new Edge(toNode,weight);
    Edge edgeto= new Edge(fromNode,weight);
    adjacencyList.get(fromNode).add(edgefrom);
    adjacencyList.get(toNode).add(edgeto); //
  }

  public Set<Node> getNodes() {
    return adjacencyList.keySet();
  }

  public Node getNode(String string){
    Node node = nodes.get(string);
    if (node == null)
      return null;
    return node;
  }

  public List<Edge> getNeighbors(String value) {
    Node collection = new Node(value);
    List<Edge> list=adjacencyList.get(collection);
    return list;
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

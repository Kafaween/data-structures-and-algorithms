import java.lang.reflect.Array;
import java.util.*;

public class HashTable<K extends Comparable<K>,V> {

  private ArrayList<HashNode<K, V>> bucketArray;
  private int size;
  private int numBuckets;


  public List<List<String>> hashmap_left_join(HashTable<K,V> table1,HashTable<K,V> table2){
    List<List<String>> listOfLists = new ArrayList<>();
    for (HashNode<K,V> node:bucketArray){
      HashNode<K,V> head=node;
      while (head!=null){
        List<String> innerLest= new ArrayList<>();
        innerLest.add((String) head.key) ;
        innerLest.add((String) head.value);
       innerLest.add((String) table2.get(head.key)) ;
       listOfLists.add(innerLest);
       head=head.next;
      }
    }
   return listOfLists;
  }


















public List<K> tree_intersection(TreeStrucutre<K> tree1,TreeStrucutre<K> tree2 ){
  tree1.inorderTraversal();
  tree2.inorderTraversal();
  tree1.tree.addAll(tree2.tree);
  List<K> list= tree1.tree;
  List<K> lastList=new ArrayList<>();
  for(K i:list){
    int bucketIndex = getBucketIndex((K) i);
    int hashCode = hashCode((K)i);
    HashNode<K, V> head = bucketArray.get(bucketIndex);
    while (head != null) {
      if (head.key.equals(i) && head.hashCode == hashCode) {
        head.value =(V) i;
        lastList.add(i);
      }
      head = head.next;
    }
    size++;
    head = bucketArray.get(bucketIndex);
    HashNode<K, V> newNode = new HashNode<>((K) i, (V) i, hashCode);
    newNode.next = head;
    bucketArray.set(bucketIndex, newNode);
    if ((1.0 * size) / numBuckets >= 0.7) {
      ArrayList<HashNode<K, V>> temp = bucketArray;
      bucketArray = new ArrayList<>();
      numBuckets = 2 * numBuckets;
      size = 0;
      for (int index = 0; index < numBuckets; index++) {
        bucketArray.add(null);
      }
      for (HashNode<K, V> headNode : temp) {
        while (headNode != null) {
          add(headNode.key, headNode.value);
          headNode = headNode.next;
        }
      }
    }
  }
  return lastList;
}

  public String hashmap_repeated_word(String string){
    String[] words = string.split("\\s+");
    for (int i = 0; i < words.length; i++) {
      words[i] = words[i].replaceAll("[^\\w]", "");
    }
    String[] s=words;
    System.out.println(Arrays.toString(s));
    for(String i:s){
      i=i.toLowerCase(Locale.ROOT);
      int bucketIndex = getBucketIndex((K) i);
      int hashCode = hashCode((K)i);
      HashNode<K, V> head = bucketArray.get(bucketIndex);
      while (head != null) {
        if (head.key.equals(i) && head.hashCode == hashCode) {
          head.value =(V) i;
          return (String) i;
        }
        head = head.next;
      }
      size++;
      head = bucketArray.get(bucketIndex);
      HashNode<K, V> newNode = new HashNode<>((K) i, (V) i, hashCode);
      newNode.next = head;
      bucketArray.set(bucketIndex, newNode);
      if ((1.0 * size) / numBuckets >= 0.7) {
        ArrayList<HashNode<K, V>> temp = bucketArray;
        bucketArray = new ArrayList<>();
        numBuckets = 2 * numBuckets;
        size = 0;
        for (int index = 0; index < numBuckets; index++) {
          bucketArray.add(null);
        }
        for (HashNode<K, V> headNode : temp) {
          while (headNode != null) {
            add(headNode.key, headNode.value);
            headNode = headNode.next;
          }
        }
      }
    }
    return null;
  }


  public HashTable() {
    bucketArray = new ArrayList<HashNode<K,V>>();
    numBuckets = 10;
    size = 0;
    for (int index = 0; index < numBuckets; index++) {
      bucketArray.add(null);
    }
  }
  private int getBucketIndex(K key) {
    int hashCode = hashCode(key);
    int index = hashCode % numBuckets;
    index = index < 0 ? index * -1 : index;
    return index;
  }

  public void add(K key, V value) {
    int bucketIndex = getBucketIndex(key);
    int hashCode = hashCode(key);
    HashNode<K, V> head = bucketArray.get(bucketIndex);
    while (head != null) {
      if (head.key.equals(key) && head.hashCode == hashCode) {
        head.value = value;
        return;
      }
      head = head.next;
    }
    size++;
    head = bucketArray.get(bucketIndex);
    HashNode<K, V> newNode = new HashNode<>(key, value, hashCode);
    newNode.next = head;
    bucketArray.set(bucketIndex, newNode);
    if ((1.0 * size) / numBuckets >= 0.7) {
      ArrayList<HashNode<K, V>> temp = bucketArray;
      bucketArray = new ArrayList<>();
      numBuckets = 2 * numBuckets;
      size = 0;
      for (int index = 0; index < numBuckets; index++) {
        bucketArray.add(null);
      }
      for (HashNode<K, V> headNode : temp) {
        while (headNode != null) {
          add(headNode.key, headNode.value);
          headNode = headNode.next;
        }
      }
    }
  }
  public V remove(K key) {
    int bucketIndex = getBucketIndex(key);
    int hashCode = hashCode(key);
    HashNode<K, V> head = bucketArray.get(bucketIndex);
    HashNode<K, V> prev = null;
    while (head != null) {
      if (head.key.equals(key) && hashCode == head.hashCode)
        break;
      prev = head;
      head = head.next;
    }
    if (head == null)
      return null;
    size--;
    if (prev != null)
      prev.next = head.next;
    else
      bucketArray.set(bucketIndex, head.next);
    return head.value;
  }
  public V get(K key) {
    int bucketIndex = getBucketIndex(key);
    int hashCode = hashCode(key);
    HashNode<K, V> head = bucketArray.get(bucketIndex);
    while (head != null) {
      if (head.key.equals(key) && head.hashCode == hashCode) {
        return head.value;
      }
      head = head.next;
    }
    return null;
  }
  public boolean contains(K key) {
    int bucketIndex = getBucketIndex(key);
    int hashCode = hashCode(key);
    HashNode<K, V> head = bucketArray.get(bucketIndex);
    while (head != null) {
      if (head.key.equals(key) && head.hashCode == hashCode) {
        return true;
      }
      head = head.next;
    }
    return false;
  }

  private int hashCode(K key) {
    return Objects.hashCode(key);

  }

  public int getSize() {
    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }
}

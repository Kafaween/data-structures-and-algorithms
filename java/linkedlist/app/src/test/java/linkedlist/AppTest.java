/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedlist;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
//    @Test
//    @DisplayName("Can successfully instantiate an empty linked list")
//  void test1() {
//        linkedlistStructure test = new linkedlistStructure();
//        assertEquals(true, test.is_empty());
//    }
//  @Test
//  @DisplayName("Can properly insert into the linked list")
//  void test2() {
//    linkedlistStructure test = new linkedlistStructure();
//    test.insert("4");
//    test.insert("1");
//    test.insert("7");
//    test.insert("2");
//    assertEquals("2", test.head.getValue());
//  }
//  @Test
//  @DisplayName("The head property will properly point to the first node in the linked list")
//  void test3() {
//    linkedlistStructure test = new linkedlistStructure();
//    test.insert("4");
//    test.insert("1");
//    test.insert("7");
//    test.insert("2");
//    assertEquals("2", test.head.getValue());
//  }
//  @Test
//  @DisplayName("Can properly insert multiple nodes into the linked list")
//  void test4() {
//    linkedlistStructure test = new linkedlistStructure();
//    test.insert("4");
//    test.insert("1");
//    test.insert("7");
//    test.insert("2");
//    assertEquals(4, test.size());
//  }
//  @Test
//  @DisplayName("Will return true when finding a value within the linked list that exists")
//  void test5() {
//    linkedlistStructure test = new linkedlistStructure();
//    test.insert("4");
//    test.insert("1");
//    test.insert("7");
//    test.insert("2");
//    assertEquals(true, test.includes("7"));
//  }
//  @Test
//  @DisplayName("Will return false when searching for a value in the linked list that does not exist")
//  void test6() {
//    linkedlistStructure test = new linkedlistStructure();
//    test.insert("4");
//    test.insert("1");
//    test.insert("7");
//    test.insert("2");
//    assertEquals(false, test.includes("3"));
//  }
//  @Test
//  @DisplayName("Can properly return a collection of all the values that exist in the linked list")
//  void test7() {
//    linkedlistStructure test = new linkedlistStructure();
//    test.insert("4");
//    test.insert("1");
//    test.insert("7");
//    test.insert("2");
//    assertEquals("{ 2 } -> { 7 } -> { 1 } -> { 4 } -> NULL", test.to_string());
//  }
//  @Test
//  @DisplayName("Can successfully add a node to the end of the linked list")
//  void test1() {
//    linkedlistStructure test = new linkedlistStructure();
//    test.insert("4");
//    test.insert("1");
//    test.insert("7");
//    test.insert("2");
//    test.append("10");
//    assertEquals("{ 2 } -> { 7 } -> { 1 } -> { 4 } -> { 10 } -> NULL", test.to_string());
//  }
//  @Test
//  @DisplayName("Can successfully add multiple nodes to the end of a linked list")
//  void test2() {
//    linkedlistStructure test = new linkedlistStructure();
//    test.insert("4");
//    test.insert("1");
//    test.insert("7");
//    test.insert("2");
//    test.append("10");
//    test.append("11");
//    assertEquals("{ 2 } -> { 7 } -> { 1 } -> { 4 } -> { 10 } -> { 11 } -> NULL", test.to_string());
//  }
//  @Test
//  @DisplayName("Can successfully insert a node before a node located i the middle of a linked list")
//  void test3() {
//    linkedlistStructure test = new linkedlistStructure();
//    test.insert("4");
//    test.insert("1");
//    test.insert("7");
//    test.insert("2");
//    test.append("10");
//    test.append("11");
//    test.insert_before("4","15");
//    assertEquals("{ 2 } -> { 7 } -> { 1 } -> { 15 } -> { 4 } -> { 10 } -> { 11 } -> NULL", test.to_string());
//  }
//  @Test
//  @DisplayName("Can successfully insert a node before the first node of a linked list")
//  void test4() {
//    linkedlistStructure test = new linkedlistStructure();
//    test.insert("4");
//    test.insert("1");
//    test.insert("7");
//    test.insert("2");
//    test.append("10");
//    test.append("11");
//    test.insert_before("2","15");
//    assertEquals("{ 15 } -> { 2 } -> { 7 } -> { 1 } -> { 4 } -> { 10 } -> { 11 } -> NULL", test.to_string());
//  }
//  @Test
//  @DisplayName("Can successfully insert after a node in the middle of the linked list")
//  void test5() {
//    linkedlistStructure test = new linkedlistStructure();
//    test.insert("4");
//    test.insert("1");
//    test.insert("7");
//    test.insert("2");
//    test.append("10");
//    test.append("11");
//    test.insert_after("4","15");
//    assertEquals("{ 2 } -> { 7 } -> { 1 } -> { 4 } -> { 15 } -> { 10 } -> { 11 } -> NULL", test.to_string());
//  }
//  @Test
//  @DisplayName("Can successfully insert a node after the last node of the linked list")
//  void test6() {
//    linkedlistStructure test = new linkedlistStructure();
//    test.insert("4");
//    test.insert("1");
//    test.insert("7");
//    test.insert("2");
//    test.append("10");
//    test.append("11");
//    test.insert_after("11","15");
//    assertEquals("{ 2 } -> { 7 } -> { 1 } -> { 4 } -> { 10 } -> { 11 } -> { 15 } -> NULL", test.to_string());
//  }
//  @Test
//  @DisplayName("Where k is greater than the length of the linked list")
//  void test7() {
//    linkedlistStructure test = new linkedlistStructure();
//    test.insert("4");
//    test.insert("1");
//    test.insert("7");
//    test.insert("2");
//    test.append("10");
//    test.append("11");
////    "{ 2 } -> { 7 } -> { 1 } -> { 4 } -> { 10 } -> { 11 } -> NULL"
//
//    assertEquals("Exception", test.linked_list_kth(7));
//  }
//  @Test
//  @DisplayName("Where k and the length of the list are the same")
//  void test8() {
//    linkedlistStructure test = new linkedlistStructure();
//    test.insert("4");
//    test.insert("1");
//    test.insert("7");
//    test.insert("2");
//    test.append("10");
//    test.append("11");
////    "{ 2 } -> { 7 } -> { 1 } -> { 4 } -> { 10 } -> { 11 } -> NULL"
//
//    assertEquals("Exception", test.linked_list_kth(6));
//  }
//  @Test
//  @DisplayName("Where k is not a positive integer")
//  void test9() {
//    linkedlistStructure test = new linkedlistStructure();
//    test.insert("4");
//    test.insert("1");
//    test.insert("7");
//    test.insert("2");
//    test.append("10");
//    test.append("11");
////    "{ 2 } -> { 7 } -> { 1 } -> { 4 } -> { 10 } -> { 11 } -> NULL"
//
//    assertEquals("Exception", test.linked_list_kth(-2));
//  }
//  @Test
//  @DisplayName("Where the linked list is of a size 1")
//  void test10() {
//    linkedlistStructure test = new linkedlistStructure();
//
//    test.append("11");
////    "{ 2 } -> { 7 } -> { 1 } -> { 4 } -> { 10 } -> { 11 } -> NULL"
//
//    assertEquals("11", test.linked_list_kth(0));
//  }
//  @Test
//  @DisplayName("Where k is not a positive integer")
//  void test11() {
//    linkedlistStructure test = new linkedlistStructure();
//    test.insert("4");
//    test.insert("1");
//    test.insert("7");
//    test.insert("2");
//    test.append("10");
//    test.append("11");
////    "{ 2 } -> { 7 } -> { 1 } -> { 4 } -> { 10 } -> { 11 } -> NULL"
//
//    assertEquals("1", test.linked_list_kth(3));
//  }
  @Test
  @DisplayName("they both equal ")
void test11() {
  linkedlistStructure list1=new linkedlistStructure();
  list1.append("1");
  list1.append("3");
  list1.append("5");
  list1.append("7");
  list1.append("9");
  linkedlistStructure list2=new linkedlistStructure();
  list2.append("2");
  list2.append("4");
  list2.append("6");
  list2.append("8");
  list1.linked_list_zip(list1,list2);


    assertEquals("{ 1 } -> { 2 } -> { 3 } -> { 4 } -> { 5 } -> { 6 } -> { 7 } -> { 8 } -> { 9 } -> NULL", list1.to_string());
  }
  @Test
  @DisplayName("first bigger ")
  void test12() {
    linkedlistStructure list1=new linkedlistStructure();
    list1.append("1");
    list1.append("3");
    list1.append("5");
    list1.append("7");
    list1.append("9");
    linkedlistStructure list2=new linkedlistStructure();
    list2.append("2");
    list2.append("4");
    list2.append("6");
    list2.append("8");

    list1.linked_list_zip(list1,list2);


    assertEquals("{ 1 } -> { 2 } -> { 3 } -> { 4 } -> { 5 } -> { 6 } -> { 7 } -> { 8 } -> { 9 } -> NULL", list1.to_string());
  }
  @Test
  @DisplayName("second is bigger")
  void test13() {
    linkedlistStructure list1=new linkedlistStructure();
    list1.append("1");
    list1.append("3");
    list1.append("5");
    list1.append("7");
    linkedlistStructure list2=new linkedlistStructure();
    list2.append("2");
    list2.append("4");
    list2.append("6");
    list2.append("8");
    list1.linked_list_zip(list1,list2);


    assertEquals("{ 1 } -> { 2 } -> { 3 } -> { 4 } -> { 5 } -> { 6 } -> { 7 } -> { 8 } -> NULL", list1.to_string());
  }

}

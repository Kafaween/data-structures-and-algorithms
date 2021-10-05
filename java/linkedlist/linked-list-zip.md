# Challenge Summary
Write a function called zip lists
Arguments: 2 linked lists
Return: Linked List, zipped as noted below
Zip the two linked lists together into one so that the nodes alternate between the two lists and return a reference to the head of the zipped list.
Try and keep additional space down to O(1)
You have access to the Node class and all the properties on the Linked List class as well as the methods created in previous challenges.


## Whiteboard Process
![](linked-list-zip.PNG)

## Approach & Efficiency
1-we first insert 2 linked list and make a referance poiter to point for the head of both lists then make 2 template so we dont lose the next node when zipping them
2-am gonna make a loop that end if one of the elemnts gets to its end
3-and each time i am gonna save the next node of the first list in a temp and the current node of list 2 in another tmp also for not losing the list
4-then i am gonna assign the tmp2 for the first node and then the next elemnt in list 1 wich is in tmp 1
and so on tell i reach the end of one of them

big o
time=o(n)
space = o(1)

## Solution

{ 9 } -> { 2 } -> { 1 } -> { 6 } -> { 15 } -> { 5 } -> { 5 } -> { 8 } -> { 16 } -> { 3 } -> { 10 } -> NULL

list.linked_list_zip(list,list2);

System.out.println("after zipping");

System.out.println(list.to_string());

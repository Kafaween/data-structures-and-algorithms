# Singly Linked List

a linear collection of data elements whose order is not given by their physical placement in memory but random locations

## Challenge

Create a Linked List class
Within your Linked List class, include a head property.
Upon instantiation, an empty Linked List should be created.
The class should contain the following methods
insert
Arguments: value
Returns: nothing
Adds a new node with that value to the head of the list with an O(1) Time performance.
includes
Arguments: value
Returns: Boolean
Indicates whether that value exists as a Node’s value somewhere within the list.
to string
Arguments: none
Returns: a string representing all the values in the Linked List, formatted as:
"{ a } -> { b } -> { c } -> NULL"

## Approach & Efficiency

#### for insert : we save the head location in a template then we crea a new node and make next point to template taht point to first elemnt then we make head point to the new node

##### big o 

  time o(1)
  space o(1)
            
#### for includes:we loop throw the linked list using current pointer and check if the value of node mathces the value that has been passed as argument

##### big o 

  time o(n)
  space o(1)

#### for the to string we just loop throw the list and save each value in a string and keep added every time we iterate throw the loop as formated 

##### big o 

  time o(n)
  space o(n)


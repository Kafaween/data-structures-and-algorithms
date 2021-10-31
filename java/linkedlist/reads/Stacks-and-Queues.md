# Stacks and Queues
A stack is a data structure that consists of Nodes. Each Node references the next Node in the stack, but does not reference its previous.

Common terminology for a stack is

Push - Nodes or items that are put into the stack are pushed
Pop - Nodes or items that are removed from the stack are popped. When you attempt to pop an empty stack an exception will be raised.
Top - This is the top of the stack.
Peek - When you peek you will view the value of the top Node in the stack. When you attempt to peek an empty stack an exception will be raised.
IsEmpty - returns true when stack is empty otherwise returns false.
Stacks follow these concepts:

FILO
First In Last Out

## Challenge
creat a stack data structure of wich you can push and pop and peek the last node the stack should follow filo concept
and also creat a data structe called queue that you can enqueu and deqeueu and peek the first node the queue should follow fifo concept

## Approach & Efficiency
for stack i made for pushing into it if the stack is empty you just create a new node and make the top refernce points at it ,if not you creat a new node and and make the next of the new node points to what ever the top pointer is poining to and then make the top point at the new node ,for pop we make save the vale of node that the top is pointing to and make the top points to the next node;

for queeu i made for enqueue into the queue we just check if the queue is empty then if so we creat a new node and make front and rear referances points at the new node , if queue is not empty we create a new node and make what ever the rear is pointing to points to the new node and then make the rear point to the new node,for dequeue we just save the value of the node of wich the fornt is pinting to and then we make the front points to the next element

Big-o

push
pop
peek
enqueue
deqeueu
all of them of o(1)

## API
did answer it in approach and efficiency

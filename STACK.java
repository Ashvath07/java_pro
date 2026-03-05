// Node class represents each element in the stack
class Node{
    int data;      // variable to store data
    Node next;     // reference to the next node

    // constructor to create a node
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

// Stack class using Linked List
class stack{

    Node top = null;   // top pointer of stack

    // PUSH operation (insert element at top)
    public void push(int data){

        Node temp = new Node(data);   // create new node

        // if stack is empty
        if (top == null){
            top = temp;               // make new node as top
        }
        else{
            temp.next = top;          // link new node to previous top
            top = temp;               // update top
        }
    }

    // POP operation (remove top element)
    public void pop(){

        if(top == null){
            System.out.println("Stack is Empty");   // stack underflow
        }
        else{
            System.out.println("pop element ==> " + top.data);
            top = top.next;   // move top to next node
        }
    }

    // PEEK operation (view top element)
    public void peek(){

        if (top == null){
            System.out.println("Stack is Empty");
        }
        else{
            System.out.println("Top element ==> " + top.data);
        }
    }

    // DISPLAY operation (print all stack elements)
    public void display(){

        Node temp = top;   // temporary pointer to traverse stack

        if (top == null){
            System.out.println("Stack is Empty");
        }

        // traverse linked list
        while(temp != null){
            System.out.println("pushed element ==> " + "[" + temp.data + "]");
            temp = temp.next;   // move to next node
        }
    }
}

// Main class to test stack operations
class Main {
    public static void main(String[] args) {

        stack newn = new stack();   // create stack object

        // pushing elements into stack
        newn.push(50);
        newn.push(10);
        newn.push(20);
        newn.push(30);

        // performing stack operations
        newn.pop();      // remove top element
        newn.peek();     // view top element
        newn.display();  // display stack
    }
}

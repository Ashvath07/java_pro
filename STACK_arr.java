// Class to implement Stack using Array
class array{

    int size = 5;              // maximum size of stack
    int[] ary = new int[size]; // array to store stack elements
    int top = -1;              // top pointer (initially -1 means empty stack)

    // PUSH operation (insert element into stack)
    public void push(int data){
        if(top == size-1){ // check if stack is full
            System.out.println("Stack is Full");
        }
        else {
            top++;              // move top pointer
            ary[top] = data;    // insert element
            System.out.println("Pushed element ==> " + ary[top]);
        }
    }

    // POP operation (remove element from stack)
    public void pop(){
        if(top == -1){ // check if stack is empty
            System.out.println("Stack is Underflow");
        }
        else{
            System.out.println("Popped value ==> " + ary[top]);
            top--; // decrease top pointer
        }
    }

    // PEEK operation (view the top element)
    public void peek(){
        if(top == -1){
            System.out.println("Stack is Empty");
        }
        else{
            System.out.println("Top element ==> " + ary[top]);
        }
    }

    // DISPLAY operation (print all stack elements)
    public void display(){
        if(top == -1){
            System.out.println("Stack is Empty");
        }
        else{
            System.out.println("Stack elements are:");
            for(int i = top; i >= 0; i--){ // traverse from top to bottom
                System.out.println(ary[i]);
            }
        }
    }
}

// Main class
class Main {
    public static void main(String[] args) {

        array s = new array(); // create stack object

        s.push(10); // insert 10
        s.push(20); // insert 20
        s.push(30); // insert 30

        s.pop();    // remove top element
        s.peek();   // view top element
        s.display();// display stack
    }
}

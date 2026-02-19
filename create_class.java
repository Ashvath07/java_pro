// Parent Class A
class A {
    protected int a = 10;   // Protected variable (accessible in child classes)

    // Method to set value of a
    public void setA(int a) {
        this.a = a;   // this.a refers to instance variable
    }
}

// Class B inherits A
class B extends A {
    protected int b = 20;   // Variable b

    // Method to set value of b
    public void setB(int b) {
        this.b = b;   // this.b refers to instance variable
    }
}

// Class C inherits B
class C extends B {
    int c;   // Variable to store sum

    // Method to calculate sum of a and b
    public void sum() {
        c = a + b;   // Accessing inherited variables
        System.out.println("Sum of a and b is --> " + c);
    }
}

// Main class
class Main {
    public static void main(String[] args) {

        C obj = new C();  // Creating object of class C

        obj.sum();        // Calling sum method
    }
}

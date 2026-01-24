import java.util.*;
// Imports utility classes (Scanner is used for input)

class Main {
    public static void main(String[] args) {

        System.out.println("enter the value:");
        // Prompts the user to enter how many Fibonacci numbers to print

        Scanner in = new Scanner(System.in);
        // Creates Scanner object to read input

        int n = in.nextInt();
        // Stores the number entered by the user

        int sum = 0;
        // Variable to store the sum of previous two numbers

        int a = 0, b = 1;
        // Initializes first two Fibonacci numbers

        for (int i = 0; i <= n; i++) {
            // Loop runs n+1 times

            sum = a + b;
            // Calculates next Fibonacci number

            a = b;
            // Moves b value to a

            b = sum;
            // Updates b with new Fibonacci number

            System.out.print(b + " ");
            // Prints the Fibonacci number
        }
    }
}

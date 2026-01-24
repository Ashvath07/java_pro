import java.util.*;
// Imports utility classes (Scanner is used for input)

class Main {
    public static void main(String[] args) {

        System.out.println("enter the value:");
        // Prompts the user to enter a number

        Scanner in = new Scanner(System.in);
        // Creates Scanner object to read input from keyboard

        int n = in.nextInt();
        // Reads the input number

        int original = n;
        // Stores the original number for comparison later

        int sum = 0;
        // Variable to store the sum of cubes of digits

        while (n != 0) {
            // Loop runs until all digits are processed

            int store = n % 10;
            // Extracts the last digit of the number

            int cube = store * store * store;
            // Calculates the cube of the digit

            sum += cube;
            // Adds cube to the total sum

            n = n / 10;
            // Removes the last digit from the number
        }

        if (original == sum) {
            // Checks if sum of cubes equals the original number
            System.out.println(sum + " -= is an Armstrong number");
        } else {
            // Executes if the number is not an Armstrong number
            System.out.println("not an Armstrong number: " + sum);
        }
    }
}

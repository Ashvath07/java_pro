import java.util.*;  
// Imports all utility classes (Scanner is used from this package)

class Main {
    public static void main(String[] args) {
        
        int n;  
        // Variable to store the day number entered by the user
        
        System.out.println("enter the value 1:");
        // Prompt message (before reading first input)
        
        int m;  
        // Variable declared but NOT used in the program
        
        System.out.println("enter the value 2:");
        // Prompt message (before reading second input)
        
        Scanner in = new Scanner(System.in);
        // Creates a Scanner object to read input from the keyboard
        
        n = in.nextInt();
        // Reads first integer input and stores it in n
        
        m = in.nextInt();
        // Reads second integer input and stores it in m (unused)
        
        switch (n) {
            // Switch statement checks the value of n
            
            case 1:
                System.out.println("monday");
                break;
                // Stops execution after this case
                
            case 2:
                System.out.println("Tuesday");
                break;
                
            case 3:
                System.out.println("wednesday");
                break;
                
            case 4:
                System.out.println("Thursday");
                break;
                
            case 5:
                System.out.println("Friday");
                break;
                
            case 6:
                System.out.println("Saturday");
                break;
                
            case 7:
                System.out.println("Sunday");
                break;
                
            default:
                System.out.println("invaild days choice");
                // Executes if n is not between 1 and 7
        }
    }
}

class Main {
    public static void main(String[] args) {

        // First array
        int[] a = {1, 2, 3, 4, 5};
        // Second array to check if it is a rotation of the first
        int[] b = {3, 4, 5, 1, 2};  

        // Step 1: Arrays must have the same length
        if (a.length != b.length) {
            System.out.println(false); // Cannot be rotation if lengths differ
            return;
        }

        int n = a.length;           // Length of the arrays
        boolean isRotation = false; // Flag to track if b is a rotation of a

        // Step 2: Try each index in b as a possible starting point
        for (int i = 0; i < n; i++) {
            // Check if current element in b matches the first element of a
            if (a[0] == b[i]) {  
                boolean match = true; // Assume this starting point works

                // Step 3: Check all elements in order with circular wrap-around
                for (int j = 0; j < n; j++) {
                    // Compare a[j] with b[(i+j) % n]
                    // % n wraps index back to start of array (circular rotation)
                    if (a[j] != b[(i + j) % n]) {
                        match = false; // Found a mismatch
                        break;        // Stop checking this rotation
                    }
                }

                // Step 4: If all elements match, b is a rotation
                if (match) {
                    isRotation = true; // Set flag
                    break;             // No need to check further
                }
            }
        }

        // Step 5: Print the result
        System.out.println(isRotation); // true if rotation, false otherwise
    }
}

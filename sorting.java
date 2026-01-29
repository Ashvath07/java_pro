class Main {
    public static void main(String[] args) {

        // Declare and initialize the array
        int[] a = {3, 2, 10, 29, -9};

        // Temporary variable used for swapping
        int b = 0;

        // Outer loop controls the number of passes
        for (int i = 0; i < a.length; i++) {

            // Inner loop compares adjacent elements
            // a.length - i - 1 reduces comparisons after each pass
            for (int j = 0; j < a.length - i - 1; j++) {

                // If current element is greater than next, swap them
                if (a[j] > a[j + 1]) {
                    b = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = b;
                }
            }
        }

        // Print the sorted array without using Arrays.toString()
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

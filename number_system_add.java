class Main {
    public static void main(String[] args) {

        // Binary numbers stored as strings
        String a = "101", b = "010", result = "";

        // Carry for binary addition (base 2)
        int carry = 0;

        // Index pointing to the last bit (rightmost)
        int i = a.length() - 1;
        int j = b.length() - 1;

        // Loop continues while there are bits left in a or b
        // OR a carry is still present
        while (i >= 0 || j >= 0 || carry == 1) {

            // Start with carry value
            int sum = carry;

            // Add bit from a if index is valid
            if (i >= 0) {
                // Convert character '0'/'1' to integer 0/1
                sum += a.charAt(i) - '0';
                i--;
            }

            // Add bit from b if index is valid
            if (j >= 0) {
                // Convert character '0'/'1' to integer 0/1
                sum += b.charAt(j) - '0';
                j--;
            }

            // Store the current bit of result (sum modulo 2)
            result = (sum % 2) + result;

            // Compute carry for the next iteration
            carry = sum / 2;
        }

        // Print the final binary sum
        System.out.println(result);
    }
}

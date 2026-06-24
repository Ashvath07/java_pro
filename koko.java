class Solution {

    public int minEatingSpeed(int[] piles, int h) {

        // Minimum possible speed
        int l = 1;

        // Maximum possible speed
        int r = 1000000000;

        // Binary Search
        while (l < r) {

            // Middle speed
            int mid = l + (r - l) / 2;

            // Total hours needed at speed = mid
            int total = 0;

            for (int num : piles) {

                // Ceiling Division
                // Example:
                // 7 bananas, speed 3
                // (7+3-1)/3 = 3 hours
                total += (num + mid - 1) / mid;
            }

            // Need more than h hours
            // Speed is too slow
            if (total > h) {
                l = mid + 1;
            }

            // Can finish within h hours
            // Try smaller speed
            else {
                r = mid;
            }
        }

        // Minimum valid speed
        return l;
    }
}

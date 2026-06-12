class Solution {
    public int mySqrt(int x) {
        int small = 1;
        int large = x;
        while (small <= large) {
            int middle = small + (large - small) / 2;
            long ans = (long) middle * middle;
            if (ans == x) {
                return middle;
            } else if (ans < x) {
                small = middle + 1;
            } else {
                large = middle - 1;
            }
        }
        return large;
    }
}
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        for (int i = 1; i < piles.length; i++) {
            if (max < piles[i]) {
                max = piles[i];
            }
        }
        int totalH = 0;
        int low = 1;
        int high = max;
        int ans = max;
        while (low <= high) {
            int mid = (high + low) / 2;
            totalH = requiredTime(piles, mid);
            if (totalH <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    private int requiredTime(int[] arr, int j) {
        int rqTime = 0;
        for (int i = 0; i < arr.length; i++) {
            rqTime = rqTime + (int) Math.ceil((double) arr[i] / (double) j);
        }
        return rqTime;
    }
}

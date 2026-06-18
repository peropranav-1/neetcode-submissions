class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0;
        int minPerDay = 0;
        for (int num : weights) {
            sum = sum + num;
            minPerDay = Math.max(minPerDay, num);
        }
        // for (int i = minPerDay; i <= sum; i++) {
        //     int dayCount = countDays(i, weights);
        //     if (dayCount <= days) {
        //         return i;
        //     }
        // }
        int low = minPerDay;
        int high = sum;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (countDays(mid, weights) > days) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
    int countDays(int limit, int[] weights) {
        int days = 1;
        int sum = 0;
        for (int weight : weights) {
            if (sum + weight <= limit) {
                sum = sum + weight;
            } else {
                sum = weight;
                days = days + 1;
            }
        }
        System.out.println(days);
        return days;
    }
}
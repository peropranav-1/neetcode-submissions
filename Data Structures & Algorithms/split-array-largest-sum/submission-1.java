class Solution {
    public int splitArray(int[] nums, int k) {
        int sum = 0;
        int min = 0;
        for (int num : nums) {
            sum += num;
            min = Math.max(num, min);
        }

        // for (int i = min; i <= sum; i++) {
        //     if (countPart(i, nums) <= k) {
        //         return i;
        //     }
        // }

        int low = min;
        int high = sum;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (countPart(mid, nums) > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    int countPart(int target, int[] nums) {
        int sum = 0;
        int part = 1;
        for (int num : nums) {
            if (sum + num <= target) {
                sum = sum + num;
            } else {
                sum = num;
                part = part + 1;
            }
        }
        System.out.println(part);
        return part;
    }
}
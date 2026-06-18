class Solution {
    public int splitArray(int[] nums, int k) {
        int sum = 0;
        int min = 0;
        for (int num : nums) {
            sum += num;
            min = Math.max(num, min);
        }

        for (int i = min; i <= sum; i++) {
            if (countPart(i, nums) <= k) {
                return i;
            }
        }
        return 0;
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
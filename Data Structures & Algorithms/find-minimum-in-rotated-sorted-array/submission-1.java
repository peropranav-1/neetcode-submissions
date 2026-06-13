class Solution {
    public int findMin(int[] nums) {
        if (nums[0] < nums[nums.length - 1]) {
            return nums[0];
        }
        int left = 0;
        int right = nums.length - 1;
        int min = nums[right];

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > min) {
                left = mid + 1;
            } else {
                min = nums[mid];
                right = mid - 1;
            }
        }
        return nums[left];
    }
}
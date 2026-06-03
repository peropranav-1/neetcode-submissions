class Solution {
    public int[] getConcatenation(int[] nums) {
        int newArrSize = nums.length * 2;
        int[] nums1 = new int[newArrSize];
        for (int i = 0; i < nums.length; i++) {
            nums1[i] = nums[i];
            nums1[newArrSize / 2 + i] = nums[i];
        }
        return nums1;
    }
}
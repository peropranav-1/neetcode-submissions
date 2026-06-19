class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> numsSet = new HashSet<>();
        int L = 0;
        for (int R = 0; R < nums.length; R++) {
            if (R - L > k) {
                numsSet.remove(nums[L]);
                L++;
            }
            if (numsSet.contains(nums[R])) {
                return true;
            }
            numsSet.add(nums[R]);
        }
        return false;
    }
}
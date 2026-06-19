class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> numsSet = new HashSet<>();
        int lastElemAdded = nums[0];
        numsSet.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (i > k) {
                numsSet.remove(lastElemAdded);
                lastElemAdded = nums[i - k];
            }
            if (numsSet.contains(nums[i])) {
                return true;
            } else {
                numsSet.add(nums[i]);
            }
        }
        return false;
    }
}
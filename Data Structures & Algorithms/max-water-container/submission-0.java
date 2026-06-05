class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length - 1;
        int maxVol = 0;
        while (i < j) {
            if (heights[i] > heights[j]) {
                maxVol = Math.max(maxVol, heights[j] * (j - i));
                j--;
            } else {
                maxVol = Math.max(maxVol, heights[i] * (j - i));
                i++;
            }
        }
        return maxVol;
    }
}

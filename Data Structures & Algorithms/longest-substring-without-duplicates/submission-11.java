class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        int L = 0;
        Map<Character, Integer> sSet = new HashMap<>();
        for (int R = 0; R < s.length(); R++) {
            if (sSet.containsKey(s.charAt(R)) && sSet.get(s.charAt(R)) >= L) {
                L = sSet.get(s.charAt(R)) + 1;
                sSet.put(s.charAt(R), R);
            } else {
                sSet.put(s.charAt(R), R);
                length = Math.max(length, R - L + 1);
            }
        }
        return length;
    }
}

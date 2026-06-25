class Solution {
    public int characterReplacement(String s, int k) {
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            Map<Character, Integer> map = new HashMap<>();
            int maxF = 0;
            int length = 0;
            for (int j = i; j < s.length(); j++) {
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
                maxF = Math.max(maxF, map.get(s.charAt(j)));
                int changes = (j - i + 1) - maxF;
                if (changes <= k) {
                    length = (j - i + 1);
                } else {
                    break;
                }
            }
            maxLength = Math.max(maxLength, length);
        }
        return maxLength;
    }
}

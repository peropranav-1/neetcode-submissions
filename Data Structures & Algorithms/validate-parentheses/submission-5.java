class Solution {
    public boolean isValid(String s) {
        Stack<Character> bracStack = new Stack<>();
        Map<Character, Character> openCloseMap = createOpenCloseMap();
        for (char ch : s.toCharArray()) {
            Character expected = openCloseMap.get(ch);
            if (expected == null) {
                bracStack.push(ch);
            } else {
                if (bracStack.isEmpty() || expected != bracStack.pop()) {
                    return false;
                }
            }
        }
        return bracStack.isEmpty();
    }

    private Map<Character, Character> createOpenCloseMap() {
        Map<Character, Character> open = new HashMap<>();
        open.put(')', '(');
        open.put('}', '{');
        open.put(']', '[');
        return open;
    }
}

class Solution {
    public boolean isValid(String s) {
        Stack<Character> bracStack = new Stack<>();
        Map<Character, Character> openCloseMap = createOpenCloseMap();
        for (int i = 0; i < s.length(); i++) {
            Character a = s.charAt(i);
            Character expected = openCloseMap.get(a);
            if (expected == null) {
                bracStack.push(a);
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

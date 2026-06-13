class Solution {
    public boolean isValid(String s) {
        Stack<Character> bracStack = new Stack<>();
        Map<Character, Character> openCloseMap = createOpenCloseMap();
        for (int i = 0; i < s.length(); i++) {
            Character a = s.charAt(i);
            if (openCloseMap.containsValue(a)) {
                bracStack.push(a);
            } else {
                if (bracStack.isEmpty())
                    return false;
                if (openCloseMap.get(a) != bracStack.pop()) {
                    return false;
                }
            }
        }
        return bracStack.isEmpty() ? true : false;
    }

    private Map<Character, Character> createOpenCloseMap() {
        Map<Character, Character> open = new HashMap<>();
        open.put(')', '(');
        open.put('}', '{');
        open.put(']', '[');
        return open;
    }
}

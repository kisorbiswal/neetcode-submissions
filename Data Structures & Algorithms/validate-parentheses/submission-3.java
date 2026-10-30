class Solution {
    public boolean isValid(String s) {
		Map<Character, Character> pair = new HashMap<Character, Character>();
		pair.put('}', '{');
		pair.put(']', '[');
		pair.put(')', '(');
		Stack<Character> openings = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (pair.values().contains(c)) {
				openings.add(c);
			} else {
				if(openings.isEmpty()){
                    return false;
                }
                
				if (pair.get(c) != openings.pop()) {
					return false;
				}
			}
		}
		return openings.isEmpty();
	}
}

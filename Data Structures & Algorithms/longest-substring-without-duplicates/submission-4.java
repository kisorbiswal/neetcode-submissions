class Solution {
   public int lengthOfLongestSubstring(String s) {
        int result =0;


        Set<Character> seen =new HashSet<>();
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (!seen.add(c)) {
                result = Math.max(result, seen.size());
                // Remove chars from left to seen char and update left to last seen index +1
                while (left < i) {
                    Character oldChar = s.charAt(left);
                    left++;
                    if (oldChar == c) {
                        break;
                    } else {
                        seen.remove(oldChar);
                    }

                }
            }

        }
        return Math.max(result, seen.size());
    }
}

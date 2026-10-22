class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map =new HashMap<>((int)(strs.length/0.75f)+1);

        for(String s: strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedKey = new String(chars);
            map.computeIfAbsent(sortedKey, key -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }
}

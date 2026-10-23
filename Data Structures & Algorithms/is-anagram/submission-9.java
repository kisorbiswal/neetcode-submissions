class Solution {
    public boolean isAnagram(String s, String t) {
     
        if(s.length() != t.length()){
            return false;
        }
        
        char[] ss = s.toCharArray();
        Arrays.sort(ss);
        String sn = new String(ss);

        char[] ts = t.toCharArray();
        Arrays.sort(ts);
        String tn = new String(ts);
        return sn.equals(tn);
    }
}

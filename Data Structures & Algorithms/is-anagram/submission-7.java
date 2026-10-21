class Solution {
    public boolean isAnagram(String s, String t) {
     
        if(s.length() != t.length()){
            return false;
        }
        int[] ss = s.chars().sorted().toArray();
        int[] ts = t.chars().sorted().toArray();

        for(int i =0; i < ss.length; i++){
            if(ss[i]!=ts[i]){
                return false;
            }
        }
        return true;
    }
}

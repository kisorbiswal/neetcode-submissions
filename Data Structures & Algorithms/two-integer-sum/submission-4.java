class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> needMap =new HashMap<>((int)(nums.length/0.75f)+1);
    
        for(int i = 0 ; i < nums.length; i++){
            int need = target - nums[i];
            if(needMap.containsKey(need)){
                return new int[]{needMap.get(need), i};
            }
            needMap.put(nums[i], i);
        }
        return new int[0];
    }
}

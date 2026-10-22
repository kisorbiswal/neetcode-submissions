class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> needMap =new HashMap<>();
    
        for(int i = 0 ; i < nums.length; i++){
            Integer need = target - nums[i];
            Integer has = needMap.get(need);
            if(has != null){
                return new int[]{has, i};
            }
            needMap.put(nums[i], i);
        }
        return null;
    }
}

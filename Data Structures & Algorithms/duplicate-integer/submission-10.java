class Solution {
    
    public boolean hasDuplicate(int[] nums) {
    // 1
    //     Set<Integer> seen = new HashSet<>();
    //     for(int i: nums){
    //         if(!seen.add(i)){
    //             return true;
    //         }
    //     }
    //     return false;



    // 2
    // public boolean hasDuplicate(int[] nums) {
    //     Set<Integer> seen =             Arrays.stream(nums).boxed().collect(Collectors.toSet());
    //     return seen.size() != nums.length;
    // }

    Arrays.sort(nums);
    for(int i=1; i < nums.length; i++){
        if(nums[i] == nums[i-1]){
            return true;
        }
    }
    return false;
    }
}
class Solution {
    // public boolean hasDuplicate(int[] nums) {
    //     Set<Integer> seen = new HashSet<>();
    //     for(int i: nums){
    //         if(!seen.add(i)){
    //             return true;
    //         }
    //     }
    //     return false;
    // }
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        return seen.size() != nums.length;
    }
}
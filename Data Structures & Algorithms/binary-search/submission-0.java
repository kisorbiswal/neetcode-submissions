class Solution {
    public int search(int[] nums, int target) {
        int found = -1;
		int start = 0;
		int end = nums.length - 1;
		while(start <= end) {
			int mid = start + (end - start) / 2;
			if(nums[mid] == target) {
				found = mid;
				return found;
			} else if(nums[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return found;
    }
}

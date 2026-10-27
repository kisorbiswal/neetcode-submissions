class Solution {
    public int[] productExceptSelf(int[] nums) {
		int[] result = new int[nums.length];
		
		int product = 1;
		int last = nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			product = product * last;
			result[i] = product;
			last = nums[i];
		}

		product = 1;
		last = nums[nums.length - 1];

		for (int i = nums.length - 2; i > -1; i--) {
			product = product * last;
			if (i == 0) {
				result[i] = product;
			} else {
				result[i] = result[i] * product;
			}
			last = nums[i];

		}
		return result;
	}
}  

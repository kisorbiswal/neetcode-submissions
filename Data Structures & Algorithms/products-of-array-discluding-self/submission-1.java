class Solution {
    public int[] productExceptSelf(int[] nums) {
		int[] result = new int[nums.length];
		
		int product = 1;
		result[0] = product;
		
		for (int i = 1; i < nums.length; i++) {
			product = product * nums[i - 1];
			result[i] = product;
		}

		product = 1;

		for (int i = nums.length - 2; i > -1; i--) {
			product = product * nums[i + 1];

			result[i] = result[i] * product;


		}
		return result;
	}
}  

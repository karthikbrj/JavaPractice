public class SingleNumber {

	public static void main(String[] args) {
		int[] nums = {1,2,2 };
		int singleNumber = singleNumber(nums);
		System.out.println(singleNumber);
	}

	public static int singleNumber(int[] nums) {
		int result = 0;
		if (nums.length == 1) {
			return nums[0];
		}
		if (nums.length == 0) {
			return -1;
		}
		for (int i = 0; i < nums.length; i++) {
			result ^= nums[i];
		}
		return result;

	}

}
public class MajorityElement {

	public static void main(String[] args) {
		int[] nums = { 3, 2, 3, 2, 2, 2 };
		int majorityElement = majorityElement(nums);
		System.out.println("majority element is = " + majorityElement);
	}

//	public static int majorityElement(int[] nums) {
//		if (nums.length == 0) {
//			return -1;
//		}
//		if (nums.length == 1) {
//			return nums[0];
//		}
//		int majorityElement = 0;
//		int majorityElementCount = 0;
//		for (int i = 0; i < nums.length; i++) {
//			int count = 1;
//			for (int j = 0; j < nums.length; j++) {
//				if (nums[i] == nums[j]) {
//					count++;
//				}
//			}
//			if (count > majorityElementCount) {
//				majorityElementCount = count;
//				majorityElement = nums[i];
//			}
//		}
//
//		return majorityElement;
//	}

	public static int majorityElement(int[] nums) {
		int candidate = 0;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (count == 0) {
				candidate = nums[i];

			}
			if (candidate == nums[i]) {
				count++;
			} else {
				count--;
			}

		}
		return candidate;
	}

}


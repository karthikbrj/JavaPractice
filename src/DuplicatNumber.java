import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicatNumber {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1 };
		boolean containsDuplicate = containsDuplicate(nums);
		System.out.println(containsDuplicate);
	}

//	public static boolean containsDuplicate(int[] nums) {
//		for (int i = 0; i < nums.length; i++) {
//			for (int j = 1 + i; j < nums.length; j++) {
//				if (nums[i] == nums[j]) {
//					return true;
//				}
//			}
//
//		}
//		return false;
//
//	}

//	public static boolean containsDuplicate(int[] nums) {
//		Set<Integer> number = new HashSet<Integer>();
//		for (int integer : nums) {
//			if (number.contains(integer)) {
//				return true;
//			} else {
//				number.add(integer);
//			}
//		}
//		return false;
//
//	}

	public static boolean containsDuplicate(int[] nums) {
		if (nums == null || nums.length == 0) {
			return false;
		}
		Arrays.sort(nums);
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == nums[i - 1]) {
				return true;
			}
		}
		return false;
	}

}

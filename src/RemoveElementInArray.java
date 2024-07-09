public class RemoveElementInArray {

	public static void main(String[] args) {
		int[] arr = { 3, 2, 2, 3 };
		int val = 3;
		int n = removeElement(arr, val);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int removeElement(int[] nums, int val) {
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				System.out.println(nums[i]);
				nums[j++] = nums[i];

			}
		}
		return j;
	}

}
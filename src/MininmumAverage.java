import java.util.Arrays;

public class MininmumAverage {

	public static void main(String[] args) {
		int[] nums = { 7, 8, 3, 4, 15, 13, 4, 1 };
		double minimumAverage = minimumAverage(nums);
		System.out.println(minimumAverage);
	}

	public static double minimumAverage(int[] nums) {
		int lengthOfArray = nums.length;
		Arrays.sort(nums);
		double[] averages = new double[lengthOfArray / 2];
		for (int i = 0; i < lengthOfArray/2; i++) {
			int minElement = nums[i];
			int maxElement = nums[lengthOfArray - 1 - i];
			double average = (minElement + maxElement) / 2.0;
			averages[i] = average;

		}
		double minAverage = Double.MAX_VALUE;
		for (int i = 0; i < averages.length; i++) {
			if (averages[i] < minAverage) {
				minAverage = averages[i];
			}
		}
		return minAverage;
	}

}

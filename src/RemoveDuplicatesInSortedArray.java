public class RemoveDuplicatesInSortedArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 3, 4, 4, 5 };
		System.out.print("The input is ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		int output = removeDuplicates(arr);
		System.out.println();
		System.out.print("The output is ");
		for (int i = 0; i < output; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int removeDuplicates(int[] arr) {
		int temp = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[temp] != arr[i]) {
				temp++;
				arr[temp] = arr[i];
			}
		}
		return temp + 1;
	}

}

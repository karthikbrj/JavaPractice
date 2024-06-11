public class MaximumSubArray {
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int sum = maximumSubArray(arr);
        System.out.println("The maximum sub Array is "+sum);
        
    }

    public static int maximumSubArray(int[] arr) {
        int maxSum = Integer.MIN_VALUE ;
        int currentSum = 0;
        for(int i=0 ; i < arr.length; i++) {
            currentSum += arr[i];
            maxSum = Math.max(maxSum, currentSum);
            if(currentSum<0){
               currentSum = 0;
            }
        }
        return maxSum;
    }

}

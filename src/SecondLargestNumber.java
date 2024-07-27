public class SecondLargestNumber {
    public static int findSecondLargestNumber(int []arr){
        int largestNumber=Integer.MIN_VALUE;
        int secondLargestNumber=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largestNumber){
                secondLargestNumber=largestNumber;
                largestNumber=arr[i];
            }
            if(arr[i]>secondLargestNumber && arr[i]!=largestNumber){
                secondLargestNumber=arr[i];
            }
        } 
        return secondLargestNumber;
    }
    public static void main(String[] args) {
        int arr[]={1,2,10,35,9,7};
       int secondLargestNumber= findSecondLargestNumber(arr);
       System.out.println("The second largest number is "+secondLargestNumber);
    }
}

public class MissingNumber {
    public static void main(String[] args) {
        int array[] = {1,2,4,5,6};
        int missingNumber = missingNumber(array);
        System.err.println("The missing number is "+missingNumber);
        
    }
    public static int missingNumber(int []array){
        int arraySum=0;
        for(int i=0;i<array.length;i++){
            arraySum += array[i];
        }

        int n= array[array.length-1];

        int sum = n*(n+1)/ 2;

        int missingNumber = sum - arraySum;

        return missingNumber;
        
    }
}

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,8};
        int target=4;
        boolean found=findNumber(arr,target);
        System.out.println(found);

    }

    public static boolean findNumber(int[] arr, int target) {
        int start=0;
        int last=arr.length-1;  
        while(start<=last ){
           int mid=(start+last)/2;
            if(target==arr[mid]){
                return true;
            }if(target<arr[mid]){
                last=mid-1;
            }if(target>arr[mid]){
                start=mid+1;
            }
            
        }
        return false;
        
    }

    
}

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={1,5,4,2,3};
        for (int i : arr) {
            System.out.print(i+" ");
        }
        int brr[]=bubbleSort(arr);
        System.out.println();
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    public static int[] bubbleSort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    arr[i]=arr[i]^arr[j];
                    arr[j]=arr[i]^arr[j];
                    arr[i]=arr[i]^arr[j];
                }
            }
        }
        return arr;

    }
}

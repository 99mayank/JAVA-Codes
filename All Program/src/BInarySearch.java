public class BInarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,55,77,99,101,320,479,609,900,1023};

        System.out.println(binary(arr,900));
    }
    public static int binary(int arr[], int tar){

        int start =0;
        int end =arr.length;

        while(start<=end){

            int mid = start+(end-start)/2;

            if(arr[mid]==tar){
                return mid;
            }
            else if(arr[mid]>tar){
                end=(mid-1);
            }
            else{
                start=(mid+1);
            }
        }
        return -1;
    }
}

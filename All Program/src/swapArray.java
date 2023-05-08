import java.util.*;
public class swapArray {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,6};
        swap(arr);
        System.out.println(Arrays.toString(arr));   
    }
    private static void swap(int[] arr) {
        int first = 0;
        int last = arr.length-1;
        while(first<=last){
            int temp = arr[first];
            arr[first]=arr[last];
            arr[last]=temp;

            first++;
            last--;
        }
        
    }
}

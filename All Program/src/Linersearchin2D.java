import java.util.*;
public class Linersearchin2D {
    public static void main(String[] args) {
        int arr[][]={
                        {1,4,7,9},
                        {5,6,3},
                        {44,66}
        };

        int ans []= find(arr,44);
        System.out.print(Arrays.toString(ans));
    }

    private static int[] find(int[][] arr, int key) {

        for(int i=0; i<arr.length ;i++){
            for(int j=0; j<arr[i].length; i++){

                if(arr[i][j]==key){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
}

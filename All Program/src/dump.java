import java.util.*;
public class dump {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean>ans =new ArrayList<Boolean>(); 
        int maxCand =0;
        
        for(int i=0; i<candies.length; i++){
            maxCand = Math.max(maxCand,candies[i]);
        }
    
        for(int i=0 ;i<candies.length; i++){
            if((candies[i]+extraCandies)>maxCand){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
        }
    public static void main(String[] args) {
        int arr[] ={2,3,5,1,3};
        System.out.println(kidsWithCandies(arr,3));
    }
}

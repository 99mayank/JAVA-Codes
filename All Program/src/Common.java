import java.util.*;
public class Common{

    //Factorial of a no 
    public static int fact (int n){
        int ans =1;
        for(int i=1; i<=n; i++){
            ans *=i;
        }
        return ans;
    }

    public static void factors (int n) {
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }

    public static int  SumNo() {
        Scanner sc = new Scanner(System.in);
        int input=0;
        int sum=0;
        do{
            input = sc.nextInt();
            sum+=input;
        }while(input !=0);

        return sum;
    }
    public static int  largestNo() {
        Scanner sc = new Scanner(System.in);
        int input=0;
        int larger =0;
        do{
            input = sc.nextInt();
            larger =Math.max(larger,input);
        }while(input !=0);

        return larger;
    }

    public static int commi (int c, int s){
         return (((s-c)*100)/100);    
    }
    public static int nCr (int n, int r){
        
        return  fact(n)/(fact(n-r)*fact(r));
    }

    public static StringBuilder revString (String str){
        str.trim();
        int len = str.length()-1;
        StringBuilder ans = new StringBuilder("");
        for(int i= len ; i>=0; i--){
            ans.append(str.charAt(i));
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.print("Enter no. = ");
        factors(10);
        sc.close();
    }
}
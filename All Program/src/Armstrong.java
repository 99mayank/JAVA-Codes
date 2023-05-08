import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter First No = ");
        int f = sc.nextInt();
        System.out.print("Enter Secound No = ");
        int s = sc.nextInt();

        for(int i=f; i<=s; i++){
            int i2 = i;
            String str = Integer.toString(i);
            int n = str.length();
            int check = 0;
            while(i2 >0){
                int lastNo = i2%10;
                check = check +(int) Math.pow(lastNo,n);
                i2=i2/10;
            }
            if(i==check){
                System.out.print(i+" ");
            }

        }
        sc.close();
    }
    
}

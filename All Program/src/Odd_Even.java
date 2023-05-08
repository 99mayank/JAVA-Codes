import java.util.*;
public class Odd_Even {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any No. = ");
        int input = sc.nextInt();

        if(input%2==0){
            System.out.println(input + " is even");
        }
        else{
            System.out.println(input+" is odd");
        }
        sc.close();
    }
}

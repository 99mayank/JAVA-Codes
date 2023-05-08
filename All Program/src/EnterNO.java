import java.util.*;
public class EnterNO {
    public static void main(String[] args){
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        int sum =0;
        char input ='A' ;

        while (input != 'X'){
            System.out.print("Enter the No. = ");
            int no = sc.nextInt();
            sum +=no;
            System.out.print("Enter Char in Cap = ");
            input =sc.next().charAt(0);
        }
        System.out.println("Total sum is = "+sum);
        sc.close();
    }
}

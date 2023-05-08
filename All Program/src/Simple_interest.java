import java.util.*;
public class Simple_interest{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the Principle= ");
        int p = sc.nextInt();
        System.out.print("Enter the rate = ");
        int r = sc.nextInt();
        System.out.print("Enter the time = ");
        int t = sc.nextInt();

        System.out.println("Simple Interest = "+(p*r*t)/100);
        sc.close();
    }
}
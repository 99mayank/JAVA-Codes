import java.util.*;
public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name = ");
        String name = sc.nextLine();

        System.out.println("Good Morning "+name);
        sc.close();
    }
}

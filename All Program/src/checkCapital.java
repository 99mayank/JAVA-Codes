import java.util.*;
public class checkCapital {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        char chr = ((sc.next().trim()).charAt(0));

        if(chr >='a' && chr<= 'z'){
            System.out.println(chr + " ais a small case");
        }
        else{
            System.out.println(chr+ " is a Capital");
        }
        sc.close();
    }
}

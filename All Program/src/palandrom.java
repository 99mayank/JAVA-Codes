import java.util.*;

public class palandrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Word = ");
        String input = sc.next();
        int check =1;
        for(int i=0; i< (input.length()/2); i++){
            if(input.charAt(i) != input.charAt(input.length()-1-i)){
                System.out.println("Its not a palandrom");
                check =0;
            }
        }
        if(check ==1){
            System.out.println("Its a palandrom");
        }
        sc.close();
    }
    
}

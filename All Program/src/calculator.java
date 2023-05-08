import java.util.*;
public class calculator {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Enter Operation want to perform = ");

            char opt = (sc.next().trim()).charAt(0);
            
            System.out.print("Enter First No = ");
            int f = sc.nextInt();
            System.out.print("Enter Sec No = ");
            int s = sc.nextInt();

            if(opt == '+'){
                System.out.println( f +" + "+s+" = "+(f+s));
            }
            if(opt == '-'){
                System.out.println( f +" - "+s+" = "+(f-s));
            }
            if(opt == '*'){
                System.out.println( f +" * "+s+" = "+(f*s));
            }
            if(opt == '/'){
                System.out.println( f +" / "+s+" = "+(f/s));
            }

            if(opt =='X' || opt =='x'){
                break;
            }
            else {
                System.out.println("Wrong Input");
            }
        }
        sc.close();
    }
}

import java.util.*;
public class Max_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first No. = ");
        int a = sc.nextInt();
        System.out.print("Enter the sec No. = ");
        int b = sc.nextInt();
        System.out.print("Enter the Third No. = ");
        int c = sc.nextInt();
        max_min(a,b,c);
        sc.close();
        
    }
    public static void max_min (int a,int b, int c){
            if(a>b){
                if(b>c){
                    System.out.println(a+" is the largest one");
                    System.out.println(c+" is the Smallest one");
                }
                else{
                    if(a>c){
                        System.out.println(a+" is the largest one");
                        System.out.println(b+" is the Smallest one");
                    }
                    else{
                        System.out.println(c+" is the largest one");
                        System.out.println(b+" is the Smallest one");
                    }
                }
            }
            else{
                    if(b>c){
                        System.out.println(b+" is the largest one");
                        if(a<c){
                            System.out.println(a+" is the Smallest one");
                        }
                        else{
                            System.out.println(c+" is the Smallest one");
                        }
                    }
                    else{
                        System.out.println(c+" is the largest one");
                        if(a<b){
                            System.out.println(a+" is the Smallest one");
                        }
                        else{
                            System.out.println(b+" is the Smallest one");
                        }
                    }

            }

            //Smallest

    }
}
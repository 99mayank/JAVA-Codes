import java.util.*;
public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Marks = ");
        int marks = sc.nextInt();

        grd(marks);
        sc.close();
    }

    private static void grd(int marks) {
        switch ((marks-1)/10) {
            case 9:
                System.out.println("AA");
                break;
            case 8:
                System.out.println("AB");
                break;
            case 7:
                System.out.println("BB");
                break;
            
            case 6:
                System.out.println("BC");
                break; 
            case 5:
                System.out.println("CD");
                break; 
            case 4:
                System.out.println("DD");
                break; 
            case 3:
                System.out.println("Fail");
                break;
            case 2:
                System.out.println("Fail");
                break;
            case 1:
                System.out.println("Fail");
                break;
            case 0:
                System.out.println("Fail");
                break;      
            default:
                break;
        }
    }
}

import java.util.*;
public class ArrayListnotes {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
       ArrayList<ArrayList<Integer>> mayank = new ArrayList<>(10);
       for(int i=0; i<3; i++){
        mayank.add(new ArrayList<>());
       }
       for(int i=0; i<3; i++){
        for(int j=0;j<3;j++){
            mayank.get(i).add(in.nextInt());
        }
       }
       in.close();
    }
}

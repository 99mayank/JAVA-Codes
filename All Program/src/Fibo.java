public class Fibo {
    public static void main(String[] args){
        int n =10;

        if(n<2){
            System.out.println(1);
        }
        int i=3;
        int first_no = 1;
        int secound_no =1;

        while(i<=n){
            int temp = secound_no;
            secound_no=first_no+secound_no;
            first_no=temp;
            i++;
        }
        System.out.println(secound_no);

    }
}

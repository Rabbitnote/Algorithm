import java.util.Scanner;
public class RussianPer{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int n2 = sc.nextInt();
        int temp =0;
        while(n!=1){
            if(n%2==0){
                n=n/2;
                n2 = n2*2;
            }
            else{
                temp += n2;
                n=n/2;
                n2 = n2*2;
            }

        }
        System.out.println(temp+n2);
    }
}
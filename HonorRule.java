import java.util.Scanner;
public class HonorRule{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Insert Number");
        int n =sc.nextInt();
        int arr[] = new int[n];
        int accumulate=0;
        System.out.println("Please Insert Array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Please Insert X");
        int x = sc.nextInt();
        for(int i=0;i<n;i++){
            accumulate=(x*accumulate)+arr[i];
        }
        System.out.println(accumulate);
        
    }
}
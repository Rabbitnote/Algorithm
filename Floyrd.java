import java.util.Scanner;
public class Floyrd{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        

        System.out.println("Insert Floyrd Array");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    int temp;
                    if (arr[i][k] > 0 && arr[j][i] >0 && arr[j][k] != 0) {
                        temp = arr[i][k]+arr[j][i];
                        if(temp < arr[j][k]){
                            arr[j][k]=temp;
                        }
                    }
                }
            }
        }

        System.out.println("New Array");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
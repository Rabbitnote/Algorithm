import java.util.Arrays;
import java.util.Scanner;

public class DistributionCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int temp[] = new int[n];
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = getMax(arr);
        int frequency[] = new int[max+1];
        int distribution[] = new int[max+1];
        System.out.println(max);

        for (int i = 0; i < arr.length; i++) {
            frequency[arr[i]]++;
        }
   
        for(int i=1;i<frequency.length;i++){
            distribution[i]=distribution[i-1]+frequency[i];
        }
        for(int i=arr.length-1;i>=0;i--){
            ans[distribution[arr[i]]-1]=arr[i];
            distribution[arr[i]]--;
        }
      
        // System.out.println("This is Frequency");
        // for (int i : frequency) {
        //     System.out.print(i + " ");

        // }
        System.out.println("");
        for (int i : ans) {
            System.out.print(i + " ");

        }
        // System.out.println("");
        // for (int i : arr) {
        //     System.out.print(i + " ");

        // }
        // System.out.println("This is Distribution Value");
        // for (int i : distribution) {
        //     System.out.print(i + " ");
        // }
        System.out.println("");

    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

    }
}
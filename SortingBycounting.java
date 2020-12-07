import java.util.Scanner;

public class SortingBycounting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int temp[] = new int[n];
        int ans[] =new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n ; i++) {
            for (int j = i + 1; j < n ; j++) {
                if (arr[i] > arr[j]) {
                    temp[i]++;
                } else {
                    temp[j]++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            ans[temp[i]] = arr[i];
        }

        System.out.println("This is Answer");
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");

    }
}

import java.util.Scanner;


public class searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Target Element is:- ");
        int target = sc.nextInt();
        int foundAt= linearSearch(arr, n, target);
        System.out.print(target);
        System.out.println((foundAt == -1) ? " Not Found" : (" Found at " + foundAt));
    }

    public static int linearSearch(int arr[], int n, int target) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

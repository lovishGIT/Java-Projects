
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Number of Elements to be reversed:- ");
        int x = sc.nextInt();
        int arr2[] = reverse(arr, x);
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

    public static int[] reverse(int arr[], int n) {
        if (n > arr.length) {
            System.out.println("Elemets specified more than length of array. Result is reverse of an array.");
            n = arr.length;
        }
        int ans[] = arr.clone();
        int i=0;
        int j= n-1;
        while (i < j) {
            int temp = ans[i];
            ans[i] = ans[j];
            ans[j] = temp;
            i++;
            j--;
        }
        return ans;
    }
}

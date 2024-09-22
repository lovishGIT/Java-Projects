import java.util.Arrays;
import java.util.Scanner;

public class Sorting_2 {

    public static int[] cyclicSort(int[] arr) {
        int i= 0;
        while (i<arr.length) {
            int correct= arr[i] - 1;
            if(arr[i] != arr[correct]) {
                //swap
                int temp= arr[i];
                arr[i]= arr[correct];
                arr[correct]= temp;
            } else {
                i++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(cyclicSort(arr)));
    }
}

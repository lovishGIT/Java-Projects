import java.util.Scanner;

public class arrays {
    static int findMin(int[] arr) {
        int min= arr[0];
        for(int i=1; i<arr.length; i++) {
            min= (arr[i] < min) ? arr[i] : min;
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Number of Elements: ");
        int n= sc.nextInt();
        System.out.print("Enter "+ n +" elements: ");
        int[] arr= new int[n];
        for(int i=0; i<n; i++) {
            arr[i]= sc.nextInt();
        }
        // System.out.println(findMin(arr));
    }
}

package essyQues;

import java.util.Scanner;

public class pascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[1];
        int arr2[] = new int[2];
        arr1[0] = 1;
        arr2[0] = 1;
        arr2[1] = 1;
        for (int i = 3; i <= n + 1; i++) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[j] + " ");
            }
            System.out.println();
            arr1 = arr2; // copying arr2 to arr1

            // make arr2
            arr2 = new int[i];
            arr2[0] = 1;
            for (int j = 1; j < i - 1; j++) {
                arr2[j] = arr1[j - 1] + arr1[j];
            }
            arr2[i - 1] = 1;
        }
        for (int j = 0; j < arr1.length; j++) {
            System.out.print(arr1[j] + " ");
        }
        System.out.println();
        for (int j = 0; j < arr2.length; j++) {
            System.out.print(arr2[j] + " ");
        }
        System.out.println();

        sc.close();
    }
}
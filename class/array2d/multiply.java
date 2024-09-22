package array2d;

import java.util.Scanner;

public class multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("array 1: ");
        int n1 = sc.nextInt();
        int m1 = sc.nextInt();
        int arrA[][] = new int[n1][m1];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                arrA[i][j] = sc.nextInt();
            }
        }

        System.out.println("array 2: ");
        int n2 = sc.nextInt();
        int m2 = sc.nextInt();
        int arrB[][] = new int[n2][m2];
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < m2; j++) {
                arrB[i][j] = sc.nextInt();
            }
        }

        if (n2 != m1) {
            System.out.println("Multiplication Not Possible.");
        }
        int ans[][] = new int[n1][m2];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m2; j++) {
                ans[i][j] = 0;
                for (int k = 0; k < n2; k++) {
                    ans[i][j] += arrA[i][k] * arrB[k][j];
                }
                System.out.print(ans[i][j] + "\t");
            }
            System.out.println();
        }
    }
}


// 1 1 1 1   2 2 2
// 1 1 1 1   2 2 2
// 1 1 1 1   2 2 2
//           2 2 2


// 3,4  4,3


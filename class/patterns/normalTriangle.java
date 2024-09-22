package patterns; // ignore errors package declaration

import java.util.Scanner;

public class normalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of rows: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
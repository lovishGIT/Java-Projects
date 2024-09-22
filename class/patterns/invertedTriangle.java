package patterns; // ignore errors package declaration

import java.util.Scanner;


public class invertedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

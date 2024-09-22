package patterns;

public class cross {
    // public static void main(String[] args) {
    //     int n = 6;
    //     for (int i = 0; i < n / 2; i++) {
    //         for (int j = 0; j < i+1; j++) {
    //             System.out.print(" ");
    //         }
    //         System.out.print("*");
    //         for (int j = n-(i*2); j > 2; j--) {
    //             System.out.print(" ");
    //         }
    //         System.out.println("*");
    //     }
    //     if (n % 2 != 0) {
    //         for (int i = 0; i <= n / 2; i++) {
    //             System.out.print(" ");
    //         }
    //         System.out.println("*");
    //     }
    //     for (int i = n / 2; i > 0; i--) {
    //         for (int j = 0; j < i; j++) {
    //             System.out.print(" ");
    //         }
    //         System.out.print("*");
    //         for (int j = n-(i*2); j > 0; j--) {
    //             System.out.print(" ");
    //         }
    //         System.out.println("*");
    //     }
    // }
    public static void main(String[] args) {
        int n = 5;
        int i = 0, j = n - 1;
        while (j >= 0 && i < n) {
            for (int k = 0; k < n; k++) {
                if (k == i || k == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            i++;
            j--;
            System.out.println();
        }
    }
}

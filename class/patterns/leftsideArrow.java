package patterns;

public class leftsideArrow {
    // 2 major loops
    // public static void main(String[] args) {
    //     int n = 5;
    //     int i = 0;
    //     for (; i < n - 1; i++) {
    //         for (int j = 0; j <= i; j++) {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    //     for (; i >= 0; i--) {
    //         for (int j = 0; j <= i; j++) {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    // optimized way
    public static void main(String[] args) {
        int n = 5;

        int i = 0;
        n = n - 1;
        while (i <= n * 2) {
            if (i < n) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j <= n * 2 - i; j++) {
                    System.out.print("*");
                }
            }
            i++;
            System.out.println();
        }
    }
}


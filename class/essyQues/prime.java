package essyQues;
public class prime {
    public static void main(String[] args) {
        int n = 10;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.print("Not ");
                break;
            }
        }
        System.out.println("Prime");
    }

    // public static void main(String[] args) {
    //     int n = 100;

    //     for (int i = 2; i < n; i++) {
    //         boolean prime = true;
    //         for (int j = 2; j < i; j++) {
    //             if (i % j == 0) {
    //                 prime = false;
    //             }
    //         }
    //         if (prime) {
    //             System.out.print(i + " ");
    //         }
    //     }
    // }
}

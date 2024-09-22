package essyQues;
public class fibonacci {
    // public static void main(String[] args) {
    //     int n = 90;

    //     long a = 0, b = 1;
    //     long c = 1;

    //     for (int i = 2; i < n; i++) {
    //         c = a + b;
    //         a = b;
    //         b = c;
    //     }
    //     System.out.println(c > 1 ? c :
    //         (n==0 ? 0:1)
    //     );
    // }
    public static void main(String[] args) {
        int n = 6;

        if (n < 2) {
            System.out.println(n);
            System.exit(0);
        }
        long a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            long c = a + b;
            a = b;
            b = c;
        }
    }
}

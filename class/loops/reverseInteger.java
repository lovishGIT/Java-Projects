package loops;

import java.util.Scanner;

public class reverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rev = 0;
        while (n > 0) {
            int i = n % 10;
            n = n / 10;
            rev = rev * 10 + i;
        }
        System.out.println(rev);
    }
}

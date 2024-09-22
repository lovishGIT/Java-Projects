package essyQues;

import java.util.Scanner;

public class kaprekar {
    public static Boolean fin_keprekar(int n) {
        int num = n;
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        num = n * n;
        int div = (int) Math.pow(10, count);
        int sum = 0;
        while (num > 0) {
            sum += num % div;
            num /= div;
        }
        if (n == sum) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            return;
        }
        for (int i = 1; i < n; i++) {
            if (fin_keprekar(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

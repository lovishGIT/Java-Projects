import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = num;
        int count = (int) (Math.log10(n) + 1);
        int sum = 0;
        while (n > 0) {
            int dig = n % 10;
            sum += Math.pow(dig, count);
            n = n / 10;
        }
        if (sum == num) {
            System.out.println("True.");
        } else {
            System.out.println("False.");
        }
    }
}

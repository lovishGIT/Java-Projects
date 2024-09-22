package essyQues;

import java.util.Scanner;

public class timeCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int days = n / (60 * 60 * 24);
        if (days > 0) {
            System.out.print(days + " days, ");
        }
        n %= (60 * 60 * 24);
        int hours = n / (60 * 60);
        if (hours > 0) {
            System.out.print(hours + " hours, ");
        }
        n %= (60 * 60);
        int minutes = n / (60);
        if (minutes > 0) {
            System.out.print(minutes + " minutes, ");
        }
        n %= (60);
        System.out.println(n + " seconds. ");
    }
}
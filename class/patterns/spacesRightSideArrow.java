package patterns;

public class spacesRightSideArrow {
    public static void main(String[] args) {
        int n = 5;
        int i = 0;
        n = n - 1;
        while (i <= n * 2) {
            int spaces = i < n ? n - i : i - n;
            // int stars = i < n ? n - i : i - n;
            int stars = spaces; // at end it will be spaces + 1
            for (int j = 0; j < spaces; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
            i++;
        }
    }
}

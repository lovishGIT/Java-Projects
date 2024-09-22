package patterns;

public class spacesLeftSideArrow {
    public static void main(String[] args) {
        int n = 5;
        int i = 0;
        n = n - 1;
        while (i <= (n) * 2) {
            int spaces = i < n ? i : (n * 2 - i);
            int stars = i < n ? n - i : i - n;

            for (int j = 0; j < spaces * 2; j++) {
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
package patterns;

public class rightsideArrow {
    public static void main(String[] args) {
        int n = 5;
        int i = 0;
        n = n - 1;
        while (i <= n * 2) {
            int stars = i <= n ? i : n * 2 - i;
            int spaces = i <= n ? n - i : i - n;
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

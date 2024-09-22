package patterns;

public class exclamationTree {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                if (j % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("! ");
                }
            }
            System.out.println();
        }
    }
}

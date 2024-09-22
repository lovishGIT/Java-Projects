package patterns;

public class invertedExclamationTree {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0; i<n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j < (n - i) * 2; j++) {
                if (j % 2 == 0) {
                    System.out.print("! ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}

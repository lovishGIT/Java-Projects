// * * *   * * *
// * *       * *
// *           *

// *           *
// * *       * *
// * * *   * * *

package patterns;

public class boxWithoutMiddle {
    public static void main(String[] args) {
        int n= 5;
        int i=0;
        // n= n-1;
        while(i <= n * 2) {
            for (int k = 0; k < n; k++) {
                if (k < n - i || k < i - n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for(int k=n; k>=0; k--) {
                if (k < n - i || k < i - n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            i++;
        }
    }
}

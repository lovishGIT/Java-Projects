import java.util.*;
public class farenhitToCelcius {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int skip = sc.nextInt();
        for (int i = start; i <= end; i += skip) {
            double ans = ((i - 32.0) * 5.0) / 9.0;
            System.out.println(i + "\t" + (int) ans);
        }
    }
}

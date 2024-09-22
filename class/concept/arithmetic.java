package concept;
public class arithmetic {
    public static void main(String[] args) {
        int n = 120;

        // 1 2 3 4 5 6 8 10 12 15 20 24 30 40 60 120

        int count = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        System.out.println(count+1);

    }
}
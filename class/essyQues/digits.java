package essyQues;

public class digits {
    public static void main(String[] args) {
        int n = 12345;
        int k = 2;
        int x = 0;
        int newNum = 0;
        int dig = 0;
        while (n > 0 && x < k) {
            dig = n % 10;
            n = n / 10;
            newNum = newNum * 10 + dig;
            x++;
        }
        if (k != 0) {
            return;
        }
        if (n > 0 && k == 0) {
            newNum = newNum * (int) Math.pow(10, k+1) + n;
        }
        System.out.println(newNum);
    }
}

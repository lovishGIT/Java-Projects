package essyQues;

public class binary {
    public static void main(String[] args) {
        int n = 11;
        String binTemp = "";
        while (n > 1) {
            char rem = (n%2==0) ? '0' : '1';
            binTemp = rem + binTemp;
            n = n / 2;
        }
        System.out.println(n + binTemp);
    }
}

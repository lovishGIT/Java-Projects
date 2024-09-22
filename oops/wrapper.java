public class wrapper {
    public static void main(String[] args) {
        Integer a1 = 10;
        Integer a2 = 10;
        Integer a3 = 190;
        Integer a4 = 190;

        System.out.println(a1 == a2); // true
        System.out.println(a3 == a4); // false
        System.out.println();

        Integer s1 = 10;
        Integer s2 = 10;
        Integer s3 = 127;
        Integer s4 = 127;
        Integer s5 = 128;
        Integer s6 = 128;

        System.out.println(s1 == s2);
        System.out.println(s3 == s4);
        System.out.println(s5 == s6);
    }
}

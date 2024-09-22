package concept;
// class 16/7
public class clss1 {
    static int a = 20;

    public void demo1() {
        a = 10;
        System.out.println("Hello World!");
        System.out.println(a);
    }

    public void demo2() {
        System.out.println(a);
    }

    public static  void main(String[] args) {
        clss1 obj = new clss1();
        obj.demo1();
        obj.demo2();
    }
}
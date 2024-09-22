package concept.interrface;

public class client {
    public static void main(String[] args) {
        // ecommerce sc = new ecommerce(); // Cannot instantiate the type ecommerce

        ecommerce_1 sc = new ecommerce_1();
        sc.Add();
        sc.Remove();

        // sc.a = 40; // client cant manupilate variables of parent interface 
        System.out.println(sc.a);
    }
}

package concept;
public class clss2 {
    public static void mainTask(int arg) {
        int n = arg;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try {
            clss2 obj = new clss2();
            obj.mainTask(5);
            synchronized (obj) {
                obj.wait(2000);
            }
            obj.mainTask(10);
        } catch (InterruptedException ex) {
            System.out.println("Exception: " + ex);
        }
    }
}
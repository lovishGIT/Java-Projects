class Thread_Demo extends Thread {
    @Override
    public void run() {
        System.out.println("Thread Created.");
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread2.");
    }
}

public class client {
    public static void main(String[] args) {
        Thread_Demo sc = new Thread_Demo();
        Thread2 s1 = new Thread2();
        s1.start();
        sc.start();

        if (sc.isAlive()) {
            System.out.println("sc is alive.");
        } else {
            System.out.println("not created");
        }
    }
}
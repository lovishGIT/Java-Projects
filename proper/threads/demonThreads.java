public class demonThreads {
    public static void main(String[] args) {
        Adding a1 = new Adding();
        a1.setPriority(10);
        Subraction s1 = new Subraction();
        s1.setPriority(10);

        Adding a2 = new Adding();
        a2.setPriority(5);
        Subraction s2 = new Subraction();
        s2.setPriority(5);

        a1.start(); // 0
        s1.start(); // 1
        a2.start(); // 2
        s2.start(); // 3
    }
}

class Adding extends Thread {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println("Adding-" + name);
    }
}

class Subraction extends Thread {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println("Subraction-" + name);
    }
}
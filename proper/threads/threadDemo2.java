class MyThread extends Thread {
    private char ch;

    MyThread(char ch) {
        this.ch = ch;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " " + ch);
            try {
                Thread.sleep(1000); // Pause the thread for 1 second
            } catch (InterruptedException e) {
                System.out.println("");
            }
        }
    }
}

public class threadDemo2 {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread('1'); // Create a new thread object
        thread1.start(); // Start the thread

        MyThread thread2 = new MyThread('2'); // Create a new thread object
        thread2.start(); // Start the thread
    }
}

// basically isme kabhi bhi koyi bhi thread gaand mar skta
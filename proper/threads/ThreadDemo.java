class MyThread extends Thread {
    public void run() {
        // Code that will run in a separate thread
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " - Running in MyThread");
            try {
                Thread.sleep(1000);  // Pause the thread for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread thread = new MyThread();  // Create a new thread object
        thread.start();  // Start the thread (which calls the run() method)

        for (int i = 0; i < 5; i++) {
            System.out.println(i + " - Running in Main Thread");
            System.out.println("-----------------------------");
            System.out.println("-----------------------------");
            System.out.println("-----------------------------");
            System.out.println("-----------------------------");
            try {
                Thread.sleep(1000);  // Main thread pauses for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// basically isme kabhi bhi koyi bhi thread gaand mar skta
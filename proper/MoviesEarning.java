public class MoviesEarning {
    public static void main(String[] args) throws Exception {
        TotalEarn t = new TotalEarn();
        t.start();
        synchronized (t) {
            t.wait();
        }
        System.out.println(t.TotalEarn);
    }
}

class TotalEarn extends Thread {
    int totalEarn = 0;
    
}
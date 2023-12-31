class ThreadStart extends Thread {
    public void run() {
        System.out.println("Current thread name is :" + Thread.currentThread().getName());
        System.out.println("run() methods called");
    }
}

public class Start2 {
    public static void main(String[] args) {
        ThreadStart obj = new ThreadStart();
        obj.start();
    }
}

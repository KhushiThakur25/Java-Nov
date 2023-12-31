class MultiDemo extends Thread {
    public void run() {
        try {
            System.out.println("Thread" + Thread.currentThread().getId() + "is running");
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}

public class MultiThread {
    public static void main(String[] args) {
        int n = 6;// number of threads
        for (int i = 0; i < n; i++) {
            MultiDemo obj = new MultiDemo();
            obj.start();
        }
    }
}

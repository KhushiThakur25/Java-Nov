class MultiDemo implements Runnable {
    public void run() {
        try {
            System.out.println("Thread" + Thread.currentThread().getId() + "is running");
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}

public class MultiThread2 {

    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {
            Thread obj = new Thread(new MultiDemo());
            obj.start();
        }
    }
}

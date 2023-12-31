public class SleepMethods {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(3000);
                System.out.println(i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

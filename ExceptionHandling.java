public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int data = 90 / 2;
            System.out.println("value is :" + data);
            int val = 60 / 0;
            System.out.println("val is:" + val);
        } catch (ArrayIndexOutOfBoundsException msg) {
            System.out.println("cannot divide by zero..");
        }
        System.out.println("I'm always executed..");
    }
}

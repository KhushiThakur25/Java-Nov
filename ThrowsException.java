public class ThrowsException {
    public static void division(int a, int b) throws ArithmeticException {
        System.out.println("the result is:" + a / b);
    }

    public static void main(String[] args) {
        division(10, 0);
    }
}

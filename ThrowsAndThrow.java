
public class ThrowsAndThrow {

    // Throws and Throw

    public static int positiveNumber(int a) throws RuntimeException {

        if (a < 0) {
            throw new RuntimeException("Value is negative...");
        } else {
            System.out.println("number is positive");
        }
        return a;
    }

    public static void main(String[] args) {
        try {
            int num = positiveNumber(5);
            System.out.println("Number is" + num);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

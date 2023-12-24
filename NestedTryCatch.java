import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        try {
            System.out.println("I am first try block!..");
            try {
                arr[6] = 10;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            try {
                int a = 16 / 0;
                System.out.println("value of a is" + a);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

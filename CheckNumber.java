import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number ...");
        int in = input.nextInt();
        if (in > 0) {
            System.out.println("Number is positive..");
        } else if (in < 0) {
            System.out.println("Number is negative..");
        } else {
            System.out.println("Number is ZERO");
        }
        input.close();
    }

}

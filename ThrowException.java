import java.util.Scanner;

public class ThrowException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age..");
        int age = sc.nextInt();
        if (age < 18) {
            throw new RuntimeException("Sorry you are not eligible for voting..");
        } else {
            System.out.println("You are eligible to vote..");
        }
    }
}

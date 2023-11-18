import java.util.Scanner;

public class TableForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for the table..");
        int i = sc.nextInt();

        for (int n = 1; n <= 10; n++) {
            int sum = i * n;
            System.out.println(i+ " X "+n+" = "+sum);

        }
        sc.close();
    }
}

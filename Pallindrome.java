import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
		System.out.println("Enter Number to check Palindrome");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int org = a;
		int rev = 0;
		while(a!=0) {
			int rem = a%10;
			a/=10;
			rev = rev*10+rem;
			rem++;
		
		}
		if(org==rev) {
			System.out.println(org + " palindrome number");
			}	else {
				System.out.println(org + " not palindrome number");
			}	
	}
}

public class ArmstrongRecur {
    public static int countDigit(int num, int count) {
        if (num == 0) {
            return count;
        }
        if (num > 0) {
            count++;
            return countDigit(num / 10, count);
        }

        return 0;

    }

    public static int armstrong(int n,int digit,int sum) {
		int rem = 0;
        if(n==0){
            return sum;
        }

		if(n > 0) {
			rem = n%10;
			sum += (int)Math.pow(rem,digit);
            return armstrong(n/10,digit,sum);
		}
		return sum;
	}

    public static void main(String[] args) {
        int count = 0;
        int n = 456;
        int num = n;
        int org = n;
        int sum = 0;
        int digit = countDigit(num, count);
        System.out.println(digit);

        int val = armstrong(n, digit, sum);
        System.out.println(val);
        if (org == val) {
            System.out.println(org + " Is ArmStrong Number");
        } else {
            System.out.println(org + " Not ArmStrong Number");
        }
    }
}

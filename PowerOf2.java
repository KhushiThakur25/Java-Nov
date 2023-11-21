public class PowerOf2 {
    public static boolean isPowerOfTwo(int num){
        if(num == 1){
            return true;
        }
        if(num % 2 != 0){
            return false;
        }
        return isPowerOfTwo(num/2);
    }
    public static void main(String[] args) {
        int num = 15;
        boolean power = isPowerOfTwo(num);
        if(power){
            System.out.println(num + "is a power of two");
        }
        else{
            System.out.println(num + "is not a power of two");
        }
    }
}

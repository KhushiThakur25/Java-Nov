public class FiboRecursion {
    public static void fibonacci(int count,int n1,int n2 ){
        int sum=0;       
        if(count >0){
            sum = n1+n2;
            n1 = n2;
            n2 = sum;
            System.out.print(" "+sum);
            fibonacci(count-1,n1,n2);
        }
    }
    public static void main(String[] args) {
        int count=10;
        int n1=0;
        int n2=1;
        System.out.print(n1+" "+n2);
        fibonacci(count-2,n1,n2);
    }
}

public class Recursion {
    static void print(int count){
        count++;
        if(count < 5){
            System.out.println("Hello World");
            print(count);
        }
        
    }
    public static void main(String[] args) {
        int count = 0;
        print(count);
    }
}

interface InterfaceOne {
     int MAX = 10;
     int N = 10;
     int a = 10;
     int b = 20;
     void runs();
     void add();
}
class P1 implements InterfaceOne{
    
    public void runs(){
        System.out.println("running..");
    }
    public void add(){
        System.out.println("adding"+(a+b));
    }
    void eat(){
        System.out.println("eating..");
    }
    
}
class P2 implements InterfaceOne{
    public void runs(){
        System.out.println("running..");
    }
    public void add(){
        System.out.println("adding"+(a+b));
    }
    void run(){
        System.out.println("running..");
    }
}
class Child extends P1{
    void walk(){
        System.out.println("walking..");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        P1 p = new P1();
        p.add();
    }
}

abstract class Shape{
    abstract void draw(); 
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("drawing reactangle..");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("drawing circle...");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}

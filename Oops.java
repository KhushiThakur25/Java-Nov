class Rectangle {
    private int length = 62;
    public int width = 31;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
       System.out.println("Area of rectangle is:"+(length*width));
        
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}

public class Oops {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle(10, 5);
        System.out.println(obj.width);
        obj.setLength(20);
        System.out.println("Update value of length" + obj.getLength());
    }
}

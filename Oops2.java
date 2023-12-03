
    class Rectangle {
        protected int length = 62;
        public int width = 31;
    
        public Rectangle() {
            System.out.println(length);
            System.out.println(width);
           System.out.println("Area of rectangle is:"+(length*width));
            
        }
    
        public int getLength() {
            return this.length;
        }
    
        public void setLength(int length) {
            this.length = length;
        }
    }
    
    public class Oops2 {
        public static void main(String[] args) {
            Rectangle obj = new Rectangle();
            System.out.println(obj.width);
            obj.setLength(20);
            System.out.println("Update value of length" + obj.getLength());
            System.out.println(obj.length);
        }
    
    
}

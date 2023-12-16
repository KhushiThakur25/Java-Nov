import javax.swing.JFrame;

public class Frame {
    public Frame(){
        JFrame jFrame = new JFrame();
        jFrame.setLayout(null);
        jFrame.setSize(400, 400);
        jFrame.setVisible(false);
    }
    public static void main(String[] args) {
        Frame f = new Frame();
    }
}

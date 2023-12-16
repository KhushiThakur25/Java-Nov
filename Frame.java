import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame {
    public Frame(){
        JFrame jFrame = new JFrame();
        JButton jButton = new JButton("click me");
        jButton.setBounds(100,40,100,30);
        jFrame.add(jButton);
        jFrame.setTitle("This is my frame..");
        jFrame.setLayout(null);
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
    }
    public static void main(String[] args) {
        Frame f = new Frame();
    }
}

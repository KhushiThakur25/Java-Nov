import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Frame {
    public Frame() {
        JFrame jFrame = new JFrame();
        JButton jButton = new JButton("click me");
        JLabel jLabel = new JLabel("this is button..");
        JTextField jTextField  = new JTextField();
        jTextField.setBounds(100,150,250,30);
        jLabel.setBounds(120, 90, 250, 30);
        jButton.setBounds(100, 40, 100, 30);
        jFrame.add(jButton);
        jFrame.add(jLabel);
        jFrame.add(jTextField);
        jFrame.setTitle("This is my frame..");
        jFrame.setLayout(null);
        jFrame.setBounds(200, 200, 400, 400);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        Frame f = new Frame();
    }
}

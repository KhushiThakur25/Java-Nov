import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Frame implements ActionListener {
    public JFrame jFrame;
    JLabel jLabel;
    JTextField jTextField;
    public Frame() {
        JFrame jFrame = new JFrame();
        JButton jButton = new JButton("click me");
        JLabel jLabel = new JLabel("this is button..");
        JTextField jTextField = new JTextField();
        jTextField.setBounds(100, 150, 250, 30);
        jLabel.setBounds(120, 90, 250, 30);
        jButton.setBounds(100, 40, 100, 30);
        jFrame.add(jButton);
        jFrame.add(jLabel);
        jFrame.add(jTextField);
        jButton.addActionListener(this);
        jFrame.setTitle("This is my frame..");
        jFrame.setLayout(null);
        jFrame.setBounds(200, 200, 400, 400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
                jLabel.setText("our label is changed..");
                jTextField.setText("our field is changed..");
            }

    public static void main(String[] args) {
        Frame f = new Frame();
    }
}

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;

public class Frame implements ActionListener {
    public JFrame jFrame;
    JLabel jLabel;
    JTextField jTextField;
    JTextArea jTextArea;
    JButton jButton, jButton2;

    public Frame() {
        jFrame = new JFrame();
        jButton = new JButton("click me");
        jButton.setBounds(100, 40, 100, 30);
        jButton2 = new JButton("word count");
        jButton2.setBounds(10, 80, 100, 40);
        jLabel = new JLabel("this is button..");
        jLabel.setBounds(120, 90, 250, 30);
        jTextField = new JTextField();
        jTextField.setBounds(100, 150, 250, 30);
        jTextArea = new JTextArea();
        jTextArea.setBounds(10, 200, 400, 200);
        jTextArea.setBackground(Color.CYAN);
        jTextArea.setForeground(Color.GRAY);
        jFrame.add(jButton2);
        jFrame.add(jButton);
        jFrame.add(jLabel);
        jFrame.add(jTextField);
        jFrame.add(jTextArea);
        jButton2.addActionListener(this);
        jFrame.setTitle("This is my frame..");
        jFrame.setLayout(null);
        jFrame.setBounds(200, 200, 400, 400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e) {
        String text = jTextArea.getText();
        String word[] = text.split(" ");
        jLabel.setText("Total char" + text.length() + " " + "Total words" + word.length);
    }

    public static void main(String[] args) {
        Frame f = new Frame();
    }
}

import javax.swing.*;
import java.awt.*;

public class accountdetails {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ATM");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        JLabel label = new JLabel("Account Details");
        label.setHorizontalAlignment(JLabel.CENTER);
        JLabel label1 = new JLabel("Name");
        label1.setHorizontalAlignment(JLabel.CENTER);
        JLabel label2 = new JLabel("Balance");
        label2.setHorizontalAlignment(JLabel.CENTER);
        JLabel label3 = new JLabel("Last Transaction");
        label3.setHorizontalAlignment(JLabel.CENTER);

        JTextField textField1 = new JTextField();
        JTextField textField2 = new JTextField();
        JTextField textField3 = new JTextField();

        JButton b1 = new JButton("Get Account Details");
        b1.setHorizontalAlignment(JLabel.CENTER);

        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        panel2.setLayout(new GridLayout(3, 2));
        panel.setBounds(0, 25, 400, 25);
        panel2.setBounds(0, 75, 400, 150);
        panel3.setBounds(0, 250, 400, 100);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.add(panel);
        frame.add(panel2);
        frame.add(panel3);

        panel.add(label);
        panel2.add(label1);
        panel2.add(textField1);
        panel2.add(label2);
        panel2.add(textField2);
        panel2.add(label3);
        panel2.add(textField3);
        panel3.add(b1);

    }
}

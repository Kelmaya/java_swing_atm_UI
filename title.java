import javax.swing.*;
import java.awt.*;
public class title {

    public static void main(String[] args) {
        JFrame frame = new JFrame("ATM");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JLabel label1 = new JLabel("Welocme to the ATM Machine");
        JButton b1 = new JButton("Balance");
        JButton b2 = new JButton("Deposit");
        JButton b3 = new JButton("Withdraw");
        JButton b4 = new JButton("Account");
        JLabel label2 = new JLabel("Have a great day");

        

        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        
        panel2.setLayout(new GridLayout(2, 2));
        panel.setBounds(0, 50, 400, 100);
        panel2.setBounds(0, 100, 400, 150);
        panel3.setBounds(0, 250, 400, 100);
        frame.setLayout(null);
        frame.setVisible(true);
        
        frame.add(panel);
        frame.add(panel2);
        frame.add(panel3);
        panel.add(label1);
        panel2.add(b1);
        panel2.add(b2);
        panel2.add(b3);
        panel2.add(b4);
        panel3.add(label2);
    }
}
/**
 * atm
 */
import javax.swing.*;
import java.awt.*;
public class atm {

    public static void main(String[] args) {
        JFrame frame = new JFrame("ATM");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        JTextField textField = new JTextField();
        JLabel label = new JLabel("Enter amount to be deposited");
        textField.setPreferredSize(new Dimension(400,200));
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b0 = new JButton("0");
        JButton bstar = new JButton("*");
        JButton bpound = new JButton("#");
        JButton accept = new JButton("Accept");
        accept.setBackground(Color.green);
        JButton cancel = new JButton("Cancel");
        cancel.setBackground(Color.red);
        JButton clear = new JButton("Clear");
        

        JPanel panel = new JPanel();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        panel.setBackground(Color.blue);
        panel2.setBackground(Color.red);
        panel1.setBackground(new java.awt.Color(207, 245, 193));
        
        panel2.setLayout(new GridLayout(4, 3));
        panel3.setLayout(new GridLayout(1, 3));
        panel.setBounds(0, 0, 400, 170);
        panel1.setBounds(0, 170, 400, 30);
        panel2.setBounds(0, 200, 400, 100);
        panel3.setBounds(0, 300, 400, 100);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(panel);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        panel.add(textField);
        panel2.add(b1);
        panel2.add(b2);
        panel2.add(b3);
        panel2.add(b4);
        panel2.add(b5);
        panel2.add(b6);
        panel2.add(b7);
        panel2.add(b8);
        panel2.add(b9);
        panel2.add(bstar);
        panel2.add(b0);
        panel2.add(bpound);
        panel3.add(accept);
        panel3.add(cancel);
        panel3.add(clear);
        panel1.add(label);



    }
}
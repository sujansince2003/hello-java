import java.awt.*;

import javax.swing.*;

public class flow {
    public static void main(String[] args) {
        JFrame frame = new JFrame("hello no laoyut");
        // JButton btn1 = new JButton("CLICKKK");
        // JButton btn2 = new JButton("sujan");
        // JTextField textField = new JTextField("Enter your name", 20);
        JPasswordField pf = new JPasswordField(20);
        JLabel lbl = new JLabel("Username:");
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem menuItem1 = new JMenuItem("New");
        JMenuItem menuItem2 = new JMenuItem("Open");

        menu.add(menuItem1);
        menu.add(menuItem2);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        // Message dialog
        JOptionPane.showMessageDialog(null, "Hello!");

        // Confirm dialog
        int choice = JOptionPane.showConfirmDialog(null, "Do you want to continue?");
        if (choice == JOptionPane.YES_OPTION) {
            System.out.println("Yes clicked");
        }

        // Input dialog
        String name = JOptionPane.showInputDialog("Enter your name:");

        // frame.add(btn1);
        // frame.add(btn2);
        // frame.add(textField);
        frame.add(lbl);
        frame.add(pf);
        frame.setLayout(new FlowLayout());
        // frame.setBounds(20, 30, 500, 400);
        // frame.setLayout(new BorderLayout());
        // frame.add(btn1, BorderLayout.NORTH);
        // frame.add(btn2, BorderLayout.EAST);

        frame.setSize(500, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}

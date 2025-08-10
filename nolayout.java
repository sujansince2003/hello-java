import javax.swing.*;

public class nolayout {

    public static void main(String[] args) {
        JFrame frame = new JFrame("hello no laoyut");
        JButton btn1 = new JButton("CLICKKK");
        frame.add(btn1);
        // frame.setLayout(null);
        // frame.setBounds(20, 30, 500, 400);
        frame.setSize(500, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}

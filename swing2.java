import javax.swing.*;

public class swing2 {
    public static void main(String args[]) {
        JFrame frame = new JFrame("This is my own swing");
        JButton button = new JButton("hello sujan");
        frame.add(button);
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
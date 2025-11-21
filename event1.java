
// event delegation model
// event source- where event occurs
// event object- contains info abt event ActionEvent,MouseEvent
// event listener- respond to the event by exec. the code
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;iugjhkj
import java.awt.event.KeyEvent;

public class event1 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Event listner");
        JButton btn = new JButton("click me");

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("button is clicked");
            }
        });

        frame.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                System.out.println("Key pressed: " + e.getKeyChar());
            }
        });
        frame.add(btn);
        frame.setSize(150, 100);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}

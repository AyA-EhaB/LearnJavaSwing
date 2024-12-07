import javax.swing.*;
import java.awt.*;

public class GUI03 {
    public static void main(String[] args) {
        JLabel label = new JLabel();
        //set text for the label
        label.setText("test");
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JButton("North"), BorderLayout.NORTH);
        panel.add(new JButton("South"), BorderLayout.SOUTH);
        frame.add(panel);
        frame.setVisible(true);
        
    }
}

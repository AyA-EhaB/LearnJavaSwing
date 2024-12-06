import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    int count = 0;
    JLabel label;
    JFrame frame;
    JPanel panel;
    public Main(){
        frame = new JFrame();// Window
        JButton button = new JButton("CLick Me!!");
        //setup the button to be able to listen to click events
        button.addActionListener(this);
        panel = new JPanel();
        label = new JLabel("Number of Clicks:0");
        panel.setBorder(BorderFactory.createEmptyBorder(30,30, 10,30 ));
        //top bottom left right
        panel.setLayout(new GridLayout(0, 1)); // take rows and columns
        panel.add(button);
        panel.add(label);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("OUR GUI");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Main();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of Clicks: "+count);
    }
}

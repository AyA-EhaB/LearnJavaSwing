import javax.swing.*;
import java.awt.*;

public class GUI02 {
    public static void main(String[] args) {
    // JFrame as GUI window to add components to
        JFrame frame  = new JFrame();
        frame.setTitle("my Second GUI");//set title of the frame
        frame.setSize(420, 420);//width and a height
        // to make the frame visible
        frame.setVisible(true);
        //when i hit x biutton on the frame it's not really closes the frame
        // it only hides it
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit the app
        // if i want to prevent resize the window
        frame.setResizable(false);
//        //change logo icon in the frame
//        ImageIcon image = new ImageIcon("image name if in the source folder");
//        frame.setIconImage(image.getImage());//change icon

        //change background Color
        frame.getContentPane().setBackground(new Color(51,50,90));
    }
}

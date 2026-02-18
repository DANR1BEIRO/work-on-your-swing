import javax.swing.*;
import java.awt.*;

import static java.awt.BorderLayout.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class MakeAWindow {


    public static void main(String[] args) {
        go();
    }

    public static void go() {

        // make a window(a JFrame)
        JFrame frame = new JFrame();

        // make a component (button, text field, etc)
        JButton button = new JButton("click me");
        JCheckBox checkBox = new JCheckBox("choose me");
        JTextField textField = new JTextField("this is a text field");

        // add the component to the frame
        frame.getContentPane().add(button, NORTH);
        frame.getContentPane().add(checkBox, SOUTH);
        frame.getContentPane().add(textField, WEST);

        // display it (give it a size and make it visible)
        frame.setSize(1000, 1000);
        frame.setVisible(true);
    }

}



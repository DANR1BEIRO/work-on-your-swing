import javax.swing.*;
import java.awt.*;

import static java.awt.BorderLayout.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class MakeAWindow {


    public static void main(String[] args) {
        // go();
        // layoutManager();
        borderLayoutTest();
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

    public static void layoutManager() {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel checkBoxes = new JPanel();
        checkBoxes.setPreferredSize(new Dimension(200, 50));

        checkBoxes.add(new JCheckBox("checkbox1"));
        checkBoxes.add(new JCheckBox("checkbox2"));
        checkBoxes.add(new JCheckBox("checkbox3"));

        JPanel buttons = new JPanel();
        buttons.add(new JButton("Button 1"));
        buttons.add(new JButton("Button 2"));
        buttons.add(new JButton("Button 3"));

        JPanel panelA = new JPanel(new BorderLayout());
        panelA.setBackground(Color.red);
        panelA.add(buttons);

        frame.getContentPane().add(panelA, NORTH);
        frame.getContentPane().add(checkBoxes, SOUTH);

        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    public static void borderLayoutTest() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JButton center = new JButton("center");
        JButton north = new JButton("north");
        JButton east = new JButton("east");
        JButton south = new JButton("south");
        JButton west = new JButton("west");
        Font bigFont = new Font("serif", Font.BOLD, 28);

        // add button and specify the region
        frame.getContentPane().add(NORTH, north);
        frame.getContentPane().add(WEST, west);
        frame.getContentPane().add(SOUTH, south);
        frame.getContentPane().add(EAST, east);
        frame.getContentPane().add(CENTER, center);
        frame.setSize(1000, 1000);
        frame.setLocationRelativeTo(null); // this centers it on the screen
        frame.setVisible(true);
    }

}



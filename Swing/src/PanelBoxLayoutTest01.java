import javax.swing.*;
import java.awt.*;

public class PanelBoxLayoutTest01 {
    public static void main(String[] args) {
        go();
    }

    public static void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // finish the app when is closed

        JButton button = new JButton("click me");
        button.setFont(new Font("serif", Font.BOLD, 28));

        JButton buttonTwo = new JButton("i'm the button two");
        buttonTwo.setFont(new Font("serif", Font.BOLD, 28));

        JButton buttonThree = new JButton("button three here!");
        buttonThree.setFont(new Font("serif", Font.BOLD, 28));

        JPanel panel = new JPanel();
        // boxlayout force a
        // “new line” to make the components wrap to
        // the next line, even if there’s room for them
        // to fit horizontally.
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(Color.darkGray); // add a color just to see the panel range
        panel.add(button);
        panel.add(buttonTwo);
        panel.add(buttonThree);

        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setSize(1000, 700);
        frame.setLocationRelativeTo(null); // set the panel open default to the center
        frame.setVisible(true);
    }
}



import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxTest implements ItemListener {
    private static JCheckBox check = new JCheckBox("Check box");

    public static void main(String[] args) {
        new CheckBoxTest().go();

    }

    private void go() {
        JFrame frame = new JFrame("JCheckBox test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        check.setFont(new Font("Hack", Font.TRUETYPE_FONT, 50));
        check.addItemListener(this);

        frame.getContentPane().add(BorderLayout.CENTER, check);
        frame.setSize(1500, 1500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        String onOrOff = "off";
        if (check.isSelected()) {
            onOrOff = "on";
        }
        System.out.println("Check box is " + onOrOff);
    }
}

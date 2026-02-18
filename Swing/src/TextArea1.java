import javax.swing.*;
import java.awt.*;

public class TextArea1 {
    public static void main(String[] args) {
        go();
    }

    private static void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel(new BorderLayout());
        JButton button = new JButton("Just Click It");
        button.setFont(new Font("Hack", Font.TRUETYPE_FONT, 40));

        JTextArea text = new JTextArea(30, 50);
        text.setLineWrap(true);
        text.setFont(new Font("Hack", Font.TRUETYPE_FONT, 40));
        button.addActionListener(e -> text.append("button clicked \n"));

        // make a JScrollPane and give it the text area that it's going to scroll for
        JScrollPane scroller = new JScrollPane(text);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroller.setPreferredSize(new Dimension(800, 600));

        // give the text area to the scroll pane, and then add the scroll pane to the panel.
        // don't add the text area directly to the panel
        panel.setBorder(BorderFactory.createEmptyBorder(200, 200, 200, 200));
        panel.add(scroller, BorderLayout.CENTER);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.setPreferredSize(new Dimension(1500, 1500));
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class JListTest implements ListSelectionListener {
    String[] listEntries = {"Alpha", "Beta", "Gamma", "Delta", "Epsilon", "Zeta"};
    JList<String> list = new JList<>(listEntries);

    public static void main(String[] args) {
        new JListTest().go();

    }

    private void go() {
        JFrame frame = new JFrame("JList Test");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JScrollPane scroller = new JScrollPane(list);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        list.setFont(new Font("SansSerif", Font.PLAIN, 70));
        // set the number of lines to show before scrolling
        list.setVisibleRowCount(10);
        // restrict the user to select only ONE thing at time
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        // Register for list selection events
        list.addListSelectionListener(this);

        JPanel container = new JPanel();
        container.setBorder(BorderFactory.createEmptyBorder(100,300,400,300));
        container.setLayout(new BorderLayout());
        container.add(scroller, BorderLayout.CENTER);

        frame.add(container);

        frame.setSize(1000, 1000);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) {
            String selection = list.getSelectedValue();
            System.out.println(selection);
        }
    }
}

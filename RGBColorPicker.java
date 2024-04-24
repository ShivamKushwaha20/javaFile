import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class RGBColorPicker {
    public static void main(String[] args) {
        JFrame frame = new JFrame("RGB Color Picker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel colorPanel = new JPanel();
        colorPanel.setPreferredSize(new Dimension(300, 200));

        JScrollBar redScrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 1, 0, 256);
        JScrollBar greenScrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 1, 0, 256);
        JScrollBar blueScrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 1, 0, 256);

        redScrollBar.addChangeListener(new ColorChangeListener(colorPanel, redScrollBar, greenScrollBar, blueScrollBar));
        greenScrollBar.addChangeListener(new ColorChangeListener(colorPanel, redScrollBar, greenScrollBar, blueScrollBar));
        blueScrollBar.addChangeListener(new ColorChangeListener(colorPanel, redScrollBar, greenScrollBar, blueScrollBar));

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(3, 2));
        controlPanel.add(new JLabel("Red:"));
        controlPanel.add(redScrollBar);
        controlPanel.add(new JLabel("Green:"));
        controlPanel.add(greenScrollBar);
        controlPanel.add(new JLabel("Blue:"));
        controlPanel.add(blueScrollBar);

        frame.getContentPane().add(controlPanel, BorderLayout.NORTH);
        frame.getContentPane().add(colorPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    static class ColorChangeListener implements ChangeListener {
        private JPanel colorPanel;
        private JScrollBar redScrollBar;
        private JScrollBar greenScrollBar;
        private JScrollBar blueScrollBar;

        public ColorChangeListener(JPanel colorPanel, JScrollBar redScrollBar, JScrollBar greenScrollBar, JScrollBar blueScrollBar) {
            this.colorPanel = colorPanel;
            this.redScrollBar = redScrollBar;
            this.greenScrollBar = greenScrollBar;
            this.blueScrollBar = blueScrollBar;
        }

        @Override
        public void stateChanged(ChangeEvent e) {
            int red = redScrollBar.getValue();
            int green = greenScrollBar.getValue();
            int blue = blueScrollBar.getValue();

            Color color = new Color(red, green, blue);
            colorPanel.setBackground(color);
        }
    }
}

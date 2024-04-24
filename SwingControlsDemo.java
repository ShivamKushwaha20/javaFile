import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingControlsDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Controls Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a JLabel
        JLabel label = new JLabel("Enter your name:");
        label.setHorizontalAlignment(SwingConstants.CENTER);

        // Create a JTextField
        JTextField textField = new JTextField();

        // Create a JCheckBox
        JCheckBox checkBox = new JCheckBox("Subscribe to newsletter");
        checkBox.setSelected(true);

        // Create a JComboBox
        String[] hobbies = {"Reading", "Cooking", "Gaming", "Traveling"};
        JComboBox<String> comboBox = new JComboBox<>(hobbies);

        // Create a JButton
        JButton button = new JButton("Submit");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                String newsletter = checkBox.isSelected() ? "subscribed" : "not subscribed";
                String hobby = comboBox.getSelectedItem().toString();
                JOptionPane.showMessageDialog(frame, "Hello, " + name + "! You are " + newsletter +
                        " to the newsletter. Your hobby is " + hobby + ".");
            }
        });

        // Create a JPanel to hold the components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1));
        panel.add(label);
        panel.add(textField);
        panel.add(checkBox);
        panel.add(comboBox);
        panel.add(button);

        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}

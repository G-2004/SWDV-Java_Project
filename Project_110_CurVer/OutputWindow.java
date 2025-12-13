import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OutputWindow extends JFrame {

    private JTextArea currDialogue;
    private JTextField inputField;
    private JButton submitButton;
    private String inputValue = null;
    private final Object lock = new Object();

    public OutputWindow() {
        setTitle("Faceless Quest | Title WIP");
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Text display
        currDialogue = new JTextArea("FACELESS QUEST\n");
        currDialogue.setFont(new Font("Arial", Font.BOLD, 24));
        currDialogue.setEditable(false);
        currDialogue.setLineWrap(true);
        currDialogue.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(currDialogue);
        add(scrollPane, BorderLayout.CENTER);

        // Input area
        JPanel inputPanel = new JPanel(new BorderLayout());
        inputField = new JTextField();
        submitButton = new JButton("Submit");
        inputPanel.add(inputField, BorderLayout.CENTER);
        inputPanel.add(submitButton, BorderLayout.EAST);
        add(inputPanel, BorderLayout.SOUTH);

        ActionListener submitAction = e -> {
            synchronized(lock) {
                inputValue = inputField.getText();
                inputField.setText("");
                lock.notify();
            }
        };

        submitButton.addActionListener(submitAction);
        inputField.addActionListener(submitAction);
    }

    public void println(String text){
        currDialogue.append(text + "\n");
    }

    public void print(String text){
        currDialogue.append(text);
    }

    public String getInput() {
        synchronized(lock) {
            inputValue = null;
            try {
                while(inputValue == null) {
                    lock.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return inputValue;
        }
    }

    public static void createWindow() {
        SwingUtilities.invokeLater(() -> {
            OutputWindow frame = new OutputWindow();
            frame.setVisible(true);
        });
    }
}

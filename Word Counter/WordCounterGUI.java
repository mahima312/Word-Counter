import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WordCounterGUI extends JFrame implements ActionListener {
    // Define GUI components
    private JTextArea inputTextArea;
    private JButton countButton;
    private JLabel resultLabel;

    public WordCounterGUI() {
        // Set up the frame properties
        setTitle("Word Counter");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Initialize GUI components
        inputTextArea = new JTextArea();
        countButton = new JButton("Count Words");
        resultLabel = new JLabel();

        // Add components to the frame
        add(new JScrollPane(inputTextArea), BorderLayout.CENTER);
        add(countButton, BorderLayout.SOUTH);
        add(resultLabel, BorderLayout.NORTH);

        // Register the button's ActionListener
        countButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == countButton) {
            String inputText = inputTextArea.getText();
            int wordCount = countWords(inputText);
            resultLabel.setText("Total number of words: " + wordCount);
        }
    }

    private int countWords(String text) {
        String[] words = text.split("\\s+|\\p{Punct}");
        return words.length;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            WordCounterGUI wordCounterGUI = new WordCounterGUI();
            wordCounterGUI.setVisible(true);
        });
    }
}


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyEventDemo extends JFrame {
    private JLabel statusLabel;

    public KeyEventDemo() {
        // Set up the frame
        setTitle("Key Event Demo");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Label to display key events
        statusLabel = new JLabel("Press any key", JLabel.CENTER);
        statusLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        add(statusLabel);

        // Add KeyListener using KeyAdapter to the frame
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                char keyChar = e.getKeyChar();
                statusLabel.setText("Key Pressed: " + keyChar + " (Code: " + keyCode + ")");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                statusLabel.setText("Key Released: " + e.getKeyChar());
            }
        });

        // Make the frame focusable so it can listen to key events
        setFocusable(true);
        setVisible(true);
    }

    public static void main(String[] args) {
        new KeyEventDemo();
    }
}

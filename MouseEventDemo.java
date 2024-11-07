import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEventDemo extends JFrame implements MouseListener, MouseMotionListener {
    private JLabel statusLabel;

    public MouseEventDemo() {
        // Set up the frame
        setTitle("Mouse Event Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Label to display mouse events
        statusLabel = new JLabel("Perform a mouse action to see events", JLabel.CENTER);
        add(statusLabel, BorderLayout.SOUTH);

        // Add mouse listeners to the frame
        addMouseListener(this);
        addMouseMotionListener(this);

        setVisible(true);
    }

    // MouseListener methods
    @Override
    public void mouseClicked(MouseEvent e) {
        statusLabel.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        statusLabel.setText("Mouse Pressed at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        statusLabel.setText("Mouse Released at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        statusLabel.setText("Mouse Entered the window");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        statusLabel.setText("Mouse Exited the window");
    }

    // MouseMotionListener methods
    @Override
    public void mouseDragged(MouseEvent e) {
        statusLabel.setText("Mouse Dragged at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        statusLabel.setText("Mouse Moved at (" + e.getX() + ", " + e.getY() + ")");
    }

    public static void main(String[] args) {
        new MouseEventDemo();
    }
}

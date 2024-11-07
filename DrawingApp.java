import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawingApp extends JFrame {
    private CanvasPanel canvas;
    private String currentShape = "Line"; // Default shape

    public DrawingApp() {
        // Set up the frame
        setTitle("Drawing Application");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a canvas for drawing
        canvas = new CanvasPanel();
        add(canvas, BorderLayout.CENTER);

        // Create a toolbar with shape selection buttons
        JPanel toolbar = new JPanel();
        JButton lineButton = new JButton("Line");
        JButton rectButton = new JButton("Rectangle");
        JButton ovalButton = new JButton("Oval");

        // Add action listeners to buttons
        lineButton.addActionListener(e -> currentShape = "Line");
        rectButton.addActionListener(e -> currentShape = "Rectangle");
        ovalButton.addActionListener(e -> currentShape = "Oval");

        toolbar.add(lineButton);
        toolbar.add(rectButton);
        toolbar.add(ovalButton);
        add(toolbar, BorderLayout.NORTH);

        setVisible(true);
    }

    // Inner class for the drawing canvas
    class CanvasPanel extends JPanel {
        private int startX, startY, endX, endY;

        public CanvasPanel() {
            setBackground(Color.WHITE);

            // Mouse listener for capturing start and end points
            addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    startX = e.getX();
                    startY = e.getY();
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    endX = e.getX();
                    endY = e.getY();
                    repaint();
                }
            });

            // Mouse motion listener for updating end point as the mouse is dragged
            addMouseMotionListener(new MouseMotionAdapter() {
                @Override
                public void mouseDragged(MouseEvent e) {
                    endX = e.getX();
                    endY = e.getY();
                    repaint();
                }
            });
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.setColor(Color.BLACK);

            // Draw the selected shape based on start and end coordinates
            switch (currentShape) {
                case "Line":
                    g.drawLine(startX, startY, endX, endY);
                    break;
                case "Rectangle":
                    g.drawRect(Math.min(startX, endX), Math.min(startY, endY),
                            Math.abs(endX - startX), Math.abs(endY - startY));
                    break;
                case "Oval":
                    g.drawOval(Math.min(startX, endX), Math.min(startY, endY),
                            Math.abs(endX - startX), Math.abs(endY - startY));
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new DrawingApp();
    }
}

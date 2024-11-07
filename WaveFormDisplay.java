import java.awt.*;
import javax.swing.*;

public class WaveFormDisplay extends JPanel {
    
    // Frequency, amplitude, and phase shift for the sine wave
    private final int amplitude = 100;  // Height of the wave
    private final int frequency = 2;    // Number of waves within the width of the panel
    private final int phaseShift = 0;   // Phase shift (you can change this value to shift the wave)
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);  // Call the superclass method to ensure proper painting
        
        // Cast Graphics to Graphics2D for better control and quality
        Graphics2D g2d = (Graphics2D) g;
        
        // Set the color for the sine wave
        g2d.setColor(Color.BLUE);
        
        // Get the width and height of the JPanel
        int width = getWidth();
        int height = getHeight();
        
        // Draw the sine wave
        for (int x = 0; x < width; x++) {
            // Calculate the y-coordinate for the sine wave using the sine function
            int y = (int) (height / 2 + amplitude * Math.sin((2 * Math.PI * frequency * x) / width + phaseShift));
            g2d.drawLine(x, height / 2, x, y);  // Draw a line from the center to the y point
        }
    }
    
    public static void main(String[] args) {
        // Create a frame to display the wave
        JFrame frame = new JFrame("Sine Wave Form");
        
        // Set the size of the window
        frame.setSize(800, 400);
        
        // Add the custom JPanel (waveform)
        frame.add(new WaveFormDisplay());
        
        // Set default close operation to exit when window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Make the window visible
        frame.setVisible(true);
    }
}

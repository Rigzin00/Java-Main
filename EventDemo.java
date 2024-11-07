import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.InvocationTargetException;

import javax.swing.*;

public class EventDemo extends JFrame implements ActionListener {
    
    public void EventDe(){
        JLabel Jlab = null;
        Jlab = new JLabel("Press a button");
        
        setLayout(new FlowLayout());
        setSize(200, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton ok = new JButton("OK");
        JButton can = new JButton("Cancel");
        ok.setToolTipText("Click to confirm");
        
        ok.addActionListener(this);
        can.addActionListener(this);
        
        add(ok);
        add(can);
        add(Jlab);
        
        setVisible(true);
      }
      
      public void actionPerformed(ActionEvent ae) {
        String s = ae.getActionCommand();
        if (s.equals("OK")) {
          Jlab.setText("OK pressed");
        } else {
          Jlab.setText("Cancel pressed");
        }
      }
    }

    // public static void main(String[] args) {
    //     SwingUtilities.invokeLater(() -> new EventDemo());
    // }
    public void init() throws InvocationTargetException, InterruptedException{
      SwingUtilities.invokeAndWait(new Runnable (){
        public void run(){
          EventDe();
        }
      });
    }
}

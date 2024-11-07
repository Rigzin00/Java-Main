import java.io.*;
import java.lang.*;
import javax.swing.*;

public class hi {
  public static void main(String[] args)throws IOException {
    JFrame frame = new JFrame("this is my frame");
    // String s = "My Name";
    // StringBuffer sb = new StringBuffer(s);
    
    // sb.append("love");
    // System.out.println(sb);

    // sb.insert(1,"hiii");
    // System.out.println(sb);

    
    // sb.replace(1,5,"njzhubu");
    // System.out.println(sb);

    // sb.delete(1,3);
    // System.out.println(sb);

    // sb.reverse();
    // System.out.println(sb);

    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // char c ;
    // String s = br.readLine();
    // do {
    //   c = (char)br.read();
    //   System.out.println(c);
    // } while (c != 'q');
    // System.out.println(s);

    // String[] s = new String[20];
    // for (int i = 0; i < 20; i++) {
    //   s[i] = br.readLine();
    //   if(s[i].equals("stop"))break;
    // }
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300,400);

    JLabel label = new JLabel("this is my label");
    frame.add(label);
    frame.setVisible(true); 

}
}

import javax.swing.*;

public class MainClass {
  public static void main(String args[]) {
    Sky sky = new Sky();
    JFrame frame = new JFrame();
    frame.add(sky);
    frame.setSize(500, 500);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setBackground(java.awt.Color.white);
  }
}

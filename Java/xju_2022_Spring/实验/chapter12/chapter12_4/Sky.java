import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Sky extends JLabel implements ActionListener {
  Earth earth;
  Timer timer;
  double pointX[] = new double[360],
      pointY[] = new double[360];
  int w = 400, h = 400, i = 0;

  Sky() {
    setLayout(new FlowLayout());
    timer = new Timer(100, this); // 【代码2】--------//创建timer,振铃间隔是100毫秒当前Sky对象为其监视器
    setPreferredSize(new Dimension(w, h));
    earth = new Earth();
    add(earth);
    earth.setPreferredSize(new Dimension(200, 200));
    pointX[0] = 0;
    pointY[0] = h / 2;
    double angle = 1 * Math.PI / 180; // 刻度为1度
    for (int i = 0; i < 359; i++) { // 计算出数组中各个元素的值
      pointX[i + 1] = pointX[i] * Math.cos(angle) - Math.sin(angle) * pointY[i];
      pointY[i + 1] = pointY[i] * Math.cos(angle) + pointX[i] * Math.sin(angle);
    }
    for (int i = 0; i < 360; i++) {
      pointX[i] = 0.5 * pointX[i] + w / 2; // 坐标缩放、平移
      pointY[i] = 0.5 * pointY[i] + h / 2;
    }
    timer.start();
  }

  public void actionPerformed(ActionEvent e) {
    i = (i + 1) % 360;
    earth.setLocation((int) pointX[i] - 100, (int) pointY[i] - 100);
  }
}

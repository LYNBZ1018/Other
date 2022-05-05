package class_test1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CircleJFrame extends JFrame {
    JTextField txtR,txtS;
    JButton btnJS,btnQC;

    public CircleJFrame(String s) {
        init(s);
        setBounds(60,100,600,200);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    void init(String s) {
        setTitle(s);
        txtR=new JTextField(10);
        txtS=new JTextField(20);
        btnJS=new JButton("计算");
        btnQC=new JButton("清空");
        setLayout(new FlowLayout());
        add(new JLabel("圆半径="));
        add(txtR);
        add(new JLabel("圆面积="));
        add(txtS);
        add(btnJS);
        add(btnQC);
        ActionImp actionImp=new ActionImp();

        actionImp.setR(txtR);
        actionImp.setS(txtS);
        actionImp.setJS(btnJS);
        actionImp.setQC(btnQC);

        txtR.addActionListener(actionImp);
        btnJS.addActionListener(actionImp);
        btnQC.addActionListener(actionImp);
    }


}

package class_test1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

public class ActionImp implements ActionListener{
    JTextField txtR,txtS;
    JButton btnJS,btnQC;

    public void setR(JTextField x) {
        txtR = x;
    }

    public void setS(JTextField x) {
        txtS = x;
    }

    public void setJS(JButton x) {
        btnJS = x;;
    }

    public void setQC(JButton x) {
        btnQC = x;
    }

    public void actionPerformed(ActionEvent e)  {
        // TODO Auto-generated method stub
        if (e.getSource()==txtR || e.getSource()==btnJS) {
            try {
                double r=Double.parseDouble(txtR.getText());
                if(r>=0) {
                    double s=Math.PI*r*r;
                    txtS.setText(s+"");
                }
                else
                    throw new CircleException(r);
            }catch(NumberFormatException  e1) {
                txtS.setText("圆半径输入格式异常");
            }catch(CircleException e2) {
                txtS.setText(e2.toString());
            }
        }
        else if(e.getSource()==btnQC) {
            txtR.setText("");
            txtS.setText("");
            //txtR.getFocusAccelerator();
        }
    }



}
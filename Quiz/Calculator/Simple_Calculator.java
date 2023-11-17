package Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Simple_Calculator extends JFrame {
    private javax.swing.JPanel JPanel;
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JTextField tfResult;
    private JComboBox cbOperations;
    private JLabel lbNumber1;
    private JLabel lbNumber2;
    private JLabel lbResult;
    private JButton btnCompute;

    public Simple_Calculator()
    {
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tfNumber1.getText().equals("")||tfNumber2.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Input 2 numbers.");
                    return;
                }
                float first;
                float second;
                try {
                    first = Float.parseFloat(tfNumber1.getText());
                    second = Float.parseFloat(tfNumber2.getText());
                }catch (Exception a)
                {
                    JOptionPane.showMessageDialog(null,"Not a valid input.");
                    return;
                }
                float res;
                if(cbOperations.getSelectedIndex() == 0)
                {
                    res = first + second;
                    tfResult.setText(Float.toString(res));
                }
                else if (cbOperations.getSelectedIndex() == 1)
                {
                    res = first - second;
                    tfResult.setText(String.valueOf(res));
                }
                else if (cbOperations.getSelectedIndex() == 2)
                {
                     res = first * second;
                    tfResult.setText(String.valueOf(res));
                }
                else
                {
                    if(second == 0){
                        JOptionPane.showMessageDialog(null,"Divisor cannot be 0");
                        return;
                    }

                    res = first / second;

                    tfResult.setText(String.valueOf(res));
                }
            }
        });




    }
    public static void main(String[] args) {
        Simple_Calculator app = new Simple_Calculator();

        app.setContentPane(app.JPanel);
        app.setSize(600, 400);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Simple Calculator");
        app.setVisible(true);
    }
}

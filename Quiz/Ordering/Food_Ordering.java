package Ordering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Food_Ordering extends JFrame {
    private JLabel lbFoods;
    private JLabel lbDiscount;
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private javax.swing.JPanel JPanel;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    public Food_Ordering()
    {

        btnOrder.addActionListener(new ActionListener() {


            public void actionPerformed(ActionEvent e) {
                double sum = 0;
                if(cPizza.isSelected())
                {
                    sum += 100;
                }
                if(cBurger.isSelected())
                    sum+= 80;
                if(cFries.isSelected())
                    sum+= 65;
                if(cSoftDrinks.isSelected())
                    sum+=55;
                if(cTea.isSelected())
                    sum+= 50;
                if(cSundae.isSelected())
                    sum+= 40;

                if(rb5.isSelected())
                    sum = sum * .95;
                else if(rb10.isSelected())
                    sum = sum * .90;
                else if(rb15.isSelected())
                    sum = sum * .85;
                if(sum == 0){
                    JOptionPane.showMessageDialog(null, "Select something.");
                    return;
                }

                JOptionPane.showMessageDialog(null,"The total price is PHP "+sum);
            }
        });
    }
    public static void main(String[] args) {

        Food_Ordering app = new Food_Ordering();

        app.setContentPane(app.JPanel);
        app.setSize(600, 400);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Food Ordering System");
        app.setVisible(true);
    }
}


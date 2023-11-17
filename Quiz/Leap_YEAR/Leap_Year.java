package Leap_YEAR;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Leap_Year extends JFrame{
    private JButton btnCheckYear;
    private JTextField tfYear;
    JPanel JPanel;

   public Leap_Year()
   {
       btnCheckYear.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               int year = 0;
               try{
                year = Integer.parseInt(tfYear.getText());

               }
               catch(Exception a)
               {
                   JOptionPane.showMessageDialog(null,"Not a valid input");
                   return;
               }

               if (year % 400 == 0) {
                   JOptionPane.showMessageDialog(null, "Leap year");
               }
               // not a leap year if divisible by 100
               // but not divisible by 400
               else if (year % 100 == 0) {
                   JOptionPane.showMessageDialog(null, "Not a leap year");
               }
               // leap year if not divisible by 100
               // but divisible by 4
               else if (year % 4 == 0) {
                   JOptionPane.showMessageDialog(null, "Leap year");
               }
               // all other years are not leap years
               else {
                   JOptionPane.showMessageDialog(null, "Not a leap year");
               }
           }
       });
   }

    public static void main(String[] args) {
        Leap_Year app = new Leap_Year();

        app.setContentPane(app.JPanel);
        app.setSize(400, 400);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Leap Year Checker");
        app.setVisible(true);
    }
}



package mirea.pract4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class NullLayout extends JFrame {
    private int ACM = 0;
    private int RealM = 0;

    Font fnt = new Font("Times new roman",Font.BOLD,20);

    JButton ACMil = new JButton("AC Milan");
    JButton Real = new JButton("Real Madrid");

    JLabel Result = new JLabel("Result " + ACM + "X" + RealM);
    JLabel Last = new JLabel("Last Scorer: N/A");
    JLabel Win = new JLabel("Winner: DRAW");

    public NullLayout() {
        super("Milan VS Madrid");
        setLayout(null);
        ACMil.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                ACM++;
                Result.setText("Result " + ACM + "X" + RealM);
                Last.setText("Last Scorer: AC Milan");
                if(ACM > RealM){
                    Win.setText("Winner: AC Milan");
                }else if(ACM < RealM){
                    Win.setText("Winner: Real Madrid");
                }else{
                    Win.setText("Winner: DRAW");
                }
            }
        });
        Real.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                RealM++;
                Result.setText("Result " + ACM + "X" + RealM);
                Last.setText("Last Scorer: Real Madrid");
                if(ACM > RealM){
                    Win.setText("Winner: AC Milan");
                }else if(ACM < RealM){
                    Win.setText("Winner: Real Madrid");
                }else{
                    Win.setText("Winner: DRAW");
                }
            }
        });
        Last.setLocation(150,10);
        Last.setSize(200, 50);
        Result.setLocation(150,50);
        Result.setSize(200,50);
        ACMil.setLocation(50,100);
        ACMil.setSize(100,50);
        Real.setLocation(250,100);
        Real.setSize(150,50);
        Win.setLocation(150,170);
        Win.setSize(200,50);
        add(Last);
        add(Result);
        add(ACMil);
        add(Real);
        add(Win);
        setSize(450, 270);
    }

    public static void main(String[] args) {
        new NullLayout().setVisible(true);
    }
}
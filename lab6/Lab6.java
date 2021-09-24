package mirea.lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lab6 extends JFrame {
    JTextField jta = new JTextField(10);
    JMenuBar menu = new JMenuBar();
    Font fntTNR = new Font("Times new roman",Font.BOLD,20);
    Font fntMSSS = new Font("MS Sans Serif",Font.BOLD,20);
    Font fntCN = new Font("Courier New",Font.BOLD,20);
    Lab6(){
        super("Лаба 6");
        setLayout(new FlowLayout());
        setSize(200,150);
        JMenuBar menu = new  JMenuBar();
        JMenu color = new  JMenu("Цвет");
        JMenuItem blue = new JMenuItem("Синий");
        JMenuItem red = new JMenuItem("Красный");
        JMenuItem black = new JMenuItem("Чёрный");
        JMenu font = new  JMenu("Шрифт");
        JMenuItem TNR = new JMenuItem("Times New Roman");
        JMenuItem MSSS = new JMenuItem("MS Sans Serif");
        JMenuItem CN = new JMenuItem("Courier New");
        menu.add(color);
        color.add(blue);
        color.add(red);
        color.add(black);
        menu.add(font);
        font.add(TNR);
        font.add(MSSS);
        font.add(CN);
        add(menu);
        add(jta);
        black.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0) {
                jta.setForeground(Color.BLACK);
            }
        });
        blue.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0) {
                jta.setForeground(Color.BLUE);
            }
        });
        red.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0) {
                jta.setForeground(Color.RED);
            }
        });
        TNR.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0) {
                jta.setFont(fntTNR);
            }
        });
        MSSS.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0) {
                jta.setFont(fntMSSS);
            }
        });
        CN.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0) {
                jta.setFont(fntCN);
            }
        });
        jta.setFont(fntTNR);
        jta.setForeground(Color.BLACK);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[]args)
    {
        new Lab6();
    }
}

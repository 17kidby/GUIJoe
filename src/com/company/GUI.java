package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JPanel implements ActionListener {
    // canvas for other GUI widgets

    JButton button1;
    JButton button2;
    JLabel label;

    public GUI(int width, int height) {
        System.out.println("SEQUENCE: GUI constructor");
        this.setPreferredSize(new Dimension(width, height));
        setLayout(null);
        button1 = new JButton("b1");
        button1.setBounds(0,0, 100, 40);
        button2 = new JButton("b2");
        button2.setBounds(120,0, 100, 40);
        add(button1);
        button1.addActionListener(this);
        add(button2);
        button2.addActionListener(this);

        label = new JLabel();
        label.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\17kidby_m\\IdeaProjects\\GUI Joe\\src\\com\\company\\pog tree.PNG").getImage().getScaledInstance(600, 600, Image.SCALE_SMOOTH)));
        add(label);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("b1")){
            System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            Graph leGraph = new Graph(650,650);
        }else{
            System.out.println("AAAAAAAAAAAAAAAAA b");
        }

    }
}

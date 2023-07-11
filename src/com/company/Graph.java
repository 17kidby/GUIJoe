package com.company;


import javax.swing.*;
import java.awt.*;

public class Graph extends JPanel {
    private JFrame frame;

    public Graph(int width, int height){
        frame = new JFrame("line maybe?");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(width, height);
        // canvas for graphic
        frame.getContentPane().add(this);
        frame.setVisible(true);

    }

    @Override
    public void paintComponent(Graphics g){
        int[] points = {1, 2, 3, 4, 5};

        int left = 50;
        int top = 80;
        int width = 10;
        int height = 500;
        g.setColor(Color.black);
        g.fillRect(left, top, width, height);

        top = 580;
        width = 600;
        height = 10;
        g.fillRect(left, top, width, height);

        for (int i=0; i<points.length;i++){
            left=80+(i*100);
            top= 580-(points[i]*100);
            width=100;
            height=points[i]*100;
            g.setColor(Color.red);
            g.fillRect(left, top, width, height);
        }

        /*
        left=80;
        top= 180;
        width=100;
        height=400;
        g.setColor(Color.red);
        g.fillRect(left, top, width, height);
        */
    }




}

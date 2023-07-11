package com.company;
import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        // demo GUI
        System.out.println("SEQUENCE: Program started");
        JFrame frame = new JFrame("snooping as usual i see");
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI myGUI = new GUI(1366,768);

        //frame.add(new JLabel(new ImageIcon("\\\\bex-file-01\\studenthome$\\17\\17kidby_m\\My Pictures")));
        //frame.pack();
        //frame.setVisible(true);


        frame.add(myGUI);
        frame.pack();
        frame.setVisible(true);
        frame.setLocation(-7,-1);

        //JFrame newFrame = new JFrame("My first JFrame");
        //newFrame.setSize(600, 600);

        //newFrame.add(label);
        //newFrame.pack();
        //newFrame.setVisible(true);
        //newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}




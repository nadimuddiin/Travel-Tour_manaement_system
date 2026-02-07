//package travel.tourism.management.system;
//
//import javax.swing.*;
//import java.awt.*;
//
//public class Destination extends JFrame implements Runnable {
//
//    JLabel[] labels = new JLabel[10];
//    Thread th;
//
//    public void run() {
//        try {
//            for (int i = 0; i < labels.length; i++) {
//                labels[i].setVisible(true);
//                Thread.sleep(2800);
//                labels[i].setVisible(false);
//            }
//            this.setVisible(false);
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//
//    public Destination() {
//        setBounds(580, 220, 900, 700);
//        getContentPane().setBackground(new Color(220, 250, 250));
//        setLayout(null);
//        
//        th = new Thread(this);
//
//        String[] imagePaths = {
//            "icons/dest1.jpeg",
//            "icons/dest2.png",
//            "icons/dest3.jpg",
//            "icons/dest4.jpg",
//            "icons/dest5.jpg",
//            "icons/dest6.jpg",
//            "icons/dest7.jpeg",
//            "icons/dest8.jpg",
//            "icons/dest9.jpg",
//            "icons/dest10.jpg"
//        };
//
//        for (int i = 0; i < imagePaths.length; i++) {
//            ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource(imagePaths[i]));
//            Image img = icon.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
//            labels[i] = new JLabel(new ImageIcon(img));
//            labels[i].setBounds(0, 0, 900, 700);
//            add(labels[i]);
//            labels[i].setVisible(false);
//        }
//
//        th.start();
//    }
//
//    public static void main(String[] args) {
//        new Destination().setVisible(true);
//    }
//}

package travel.tourism.management.system;

import javax.swing.*;
import java.awt.*;

public class Destination extends JFrame implements Runnable {

    JLabel[] labels = new JLabel[10];
    Thread th;

    public void run() {
        try {
            for (int i = 0; i < labels.length; i++) {
                labels[i].setVisible(true);
                Thread.sleep(2800);
                labels[i].setVisible(false);
            }
            this.setVisible(false);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Destination() {
        setBounds(580, 220, 900, 700);
        getContentPane().setBackground(new Color(220, 250, 250));
        setLayout(null);
        
        th = new Thread(this);

        String[] imagePaths = {
            "icons/dest1.jpeg",
            "icons/dest2.png",
            "icons/dest3.jpg",
            "icons/dest4.jpg",
            "icons/dest5.jpg",
            "icons/dest6.jpg",
            "icons/dest7.jpeg",
            "icons/dest8.jpg",
            "icons/dest9.jpg",
            "icons/dest10.jpg"
        };

        for (int i = 0; i < imagePaths.length; i++) {
            ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource(imagePaths[i]));
            Image img = icon.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
            labels[i] = new JLabel(new ImageIcon(img));
            labels[i].setBounds(0, 0, 900, 700);
            add(labels[i]);
            labels[i].setVisible(false);
        }

        th.start();
    }

    public static void main(String[] args) {
        new Destination().setVisible(true);
    }
}

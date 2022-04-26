package Page;

import logic.AirportSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class windows6 extends JFrame {
    public static void main(String[] args){
        new windows6();
    }

    public windows6() {
        Container container1 = this.getContentPane();

        container1.setLayout(null);
        JLabel jLabel1 = new JLabel("Payment details");
        jLabel1.setBounds(400,20,500,100);
        jLabel1.setFont(new Font("微软雅黑", Font.BOLD, 50));

        JLabel jLabel2 = new JLabel("Price： $580");
        jLabel2.setBounds(750,500,400,25);
        jLabel2.setFont(new Font("微软雅黑", Font.BOLD, 25));

        JButton jButton1 = new JButton("Pay");
        jButton1.setBounds(750,590,150,50);
        jButton1.setBackground(new Color(255, 140, 0));

        JButton jButton2 = new JButton("Back");
        jButton2.setBounds(930,590,150,50);
        jButton2.setBackground(new Color(30, 144, 255));
        jButton1.setFont(new Font("微软雅黑", Font.BOLD, 25));
        jButton2.setFont(new Font("微软雅黑", Font.BOLD, 25));


        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AirportSystem.toPage(7);
            }
        });

        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AirportSystem.toPage(4);
            }
        });
//        this.setVisible(true);
        this.add(jLabel1);
        this.add(jLabel2);
        this.add(jButton1);
        this.add(jButton2);
        this.setSize(1200, 800);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    }

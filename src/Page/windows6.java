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
        //this.setVisible(true);
        this.setSize(1200, 800);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        Container container1 = this.getContentPane();
        this.setResizable(false);
        container1.setLayout(null);
        JLabel jLabel1 = new JLabel("Payment details");
        jLabel1.setBounds(400,-20,500,100);
        jLabel1.setFont(new Font("微软雅黑", Font.BOLD, 30));

        JLabel jLabel2 = new JLabel("Total order amount: ￥580");
        jLabel2.setBounds(500,460,800,50);
        jLabel2.setFont(new Font("微软雅黑", Font.BOLD, 25));

        JButton jButton1 = new JButton("Payment");
        jButton1.setBounds(500,560,180,60);
        jButton1.setBackground(new Color(255, 140, 0));

        JButton jButton2 = new JButton("Choose the seat");
        jButton2.setBounds(700,560,300,60);
        jButton2.setBackground(new Color(30, 144, 255));
        jButton1.setFont(new Font("微软雅黑", Font.BOLD, 30));
        jButton2.setFont(new Font("微软雅黑", Font.BOLD, 30));

        this.add(jLabel1);
        this.add(jLabel2);
//        this.add(jLabel5);
//        this.add(jLabel4);
        this.add(jButton1);
        this.add(jButton2);

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
    }
    }

package Page;

import data.ReadTXT;
import data.TemBook;
import logic.AirportSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class windows6 extends JFrame {
    private final JLabel jL1 = new JLabel();
    private final JLabel jL2 = new JLabel();
    private final JLabel jL3 = new JLabel();

    public static void main(String[] args){
        new windows6();
    }

    public windows6() {
        Container container1 = this.getContentPane();

        container1.setLayout(null);
        JLabel jLabel1 = new JLabel("Payment details");
        jLabel1.setBounds(400,20,500,100);
        jLabel1.setFont(new Font("微软雅黑", Font.BOLD, 50));

        JLabel jLabel2 = new JLabel("Price： " + ReadTXT.temBook.sumPrice());
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



        jL1.setText("Your Seat is: " + ReadTXT.temBook.getSeat());
        jL2.setText("Your food is: " + ReadTXT.temBook.getRealFood());
        jL3.setText("Your insurance is: " + ReadTXT.temBook.getRealInsurance());

        jL1.setFont(new Font("微软雅黑", Font.BOLD, 30));
        jL2.setFont(new Font("微软雅黑", Font.BOLD, 30));
        jL3.setFont(new Font("微软雅黑", Font.BOLD, 30));

        jL1.setBounds(200,120,1000,100);
        jL2.setBounds(200,220,1000,100);
        jL3.setBounds(200,320,1000,100);

        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AirportSystem.toPage(7);
            }
        });

        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AirportSystem.toPage(5);
            }
        });
//        this.setVisible(true);
        this.add(jLabel1);
        this.add(jLabel2);
        this.add(jButton1);
        this.add(jButton2);
        this.add(jL1);
        this.add(jL2);
        this.add(jL3);

        this.setSize(1200, 800);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    }

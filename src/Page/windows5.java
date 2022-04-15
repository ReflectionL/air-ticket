package Page;

import logic.AirportSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class windows5 extends JFrame {
    public static void main(String[] args){
        new windows5();
    }

    public windows5() {
        //this.setVisible(true);
        this.setSize(1200, 800);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        Container container1 = this.getContentPane();
        this.setResizable(false);
        container1.setLayout(null);

        JLabel jLabel1 = new JLabel("Other service");
        jLabel1.setBounds(550,-40,1000,200);
        jLabel1.setFont(new Font("微软雅黑", Font.BOLD, 35));

        JLabel jLabel2 = new JLabel("Standard plane meal (Lao tan pickled cabbage noodles + Shuanghui Wang Zhongwang) * 1: ￥58");
        jLabel2.setBounds(50,150,1200,50);
        jLabel2.setFont(new Font("微软雅黑", Font.BOLD, 23));
        JLabel jLabel3 = new JLabel("---------------------------------------------------------------------------------------------------------------------------");
        jLabel3.setBounds(0,100,8000,50);
        jLabel3.setFont(new Font("微软雅黑", Font.BOLD, 23));
        JLabel jLabel5 = new JLabel("---------------------------------------------------------------------------------------------------------------------------");
        jLabel5.setBounds(0,200,8000,50);
        jLabel5.setFont(new Font("微软雅黑", Font.BOLD, 23));
        JLabel jLabel6 = new JLabel("---------------------------------------------------------------------------------------------------------------------------");
        jLabel6.setBounds(0,480,8000,50);
        jLabel6.setFont(new Font("微软雅黑", Font.BOLD, 23));
        JLabel jLabel4 = new JLabel("Protest protection + Accident Insurance:");
        jLabel4.setBounds(100,230,800,50);
        jLabel4.setFont(new Font("微软雅黑", Font.BOLD, 23));
        JButton jButton1 = new JButton("<html>"+"No guarantee"+"<br>"+"No insurance"+"<html>");
        JButton jButton2 = new JButton("<html>"+"Standard security"+"<br>"+"￥20"+"<html>");
        JButton jButton3 = new JButton("<html>"+"The sovereign guarantee"+"<br>"+"￥50"+"<html>");
        JButton jButton4 = new JButton("Detail");
        JButton jButton5 = new JButton("Reservation");
        JButton jButton6 = new JButton("Choose the seat");
        jButton4.setFont(new Font("微软雅黑", Font.BOLD, 23));
        jButton5.setFont(new Font("微软雅黑", Font.BOLD, 23));
        jButton6.setFont(new Font("微软雅黑", Font.BOLD, 23));

        jButton1.setBounds(200,300,170,190);
        jButton1.setFont(new Font("微软雅黑", Font.BOLD, 23));
        jButton1.setMargin(new Insets(0,0,0,0));
        jButton2.setBounds(440,300,170,190);
        jButton2.setFont(new Font("微软雅黑", Font.BOLD, 23));
        jButton3.setBounds(680,300,170,190);
        jButton3.setFont(new Font("微软雅黑", Font.BOLD, 23));
        JLabel jLabel7 = new JLabel("Total order amount: ￥580");
        jLabel7.setBounds(100,500,800,50);
        jLabel7.setFont(new Font("微软雅黑", Font.BOLD, 23));

        jButton4.setBounds(200,560,150,40);
        jButton4.setMargin(new Insets(0,0,0,0));
        jButton5.setBounds(700,660,200,60);
        jButton5.setBackground(new Color(255, 140, 0));
        jButton6.setBounds(930,660,250,60);
        jButton6.setBackground(new Color(30, 144, 255));
        container1.add(jLabel1);
        container1.add(jLabel3);
        container1.add(jLabel2);
        container1.add(jLabel5);
        container1.add(jLabel4);
        container1.add(jButton1);
        container1.add(jButton2);
        container1.add(jButton3);
        container1.add(jButton4);
        container1.add(jButton5);
        container1.add(jButton6);

        container1.add(jLabel6);
        container1.add(jLabel7);

        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AirportSystem.toPage(6);
            }
        });
        jButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AirportSystem.toPage(7);
            }
        });
        jButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AirportSystem.toPage(4);
            }
        });
    }
}

package 暂时用不上;

import data.ReadTXT;
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

        Container container1 = this.getContentPane();
        container1.setLayout(null);


        JLabel jLabel1 = new JLabel("Other service");
        jLabel1.setBounds(400,10,500,100);
        jLabel1.setFont(new Font("微软雅黑", Font.BOLD, 50));
        JButton jButton10 = new JButton("No meal");
        JButton jButton11 = new JButton("Standard Plane meal (Pasta + hamburger)* 1： $58");
        JButton jButton12= new JButton("Luxurious Plane meal (pasta + hamburger + Coke)* 1: $78");
        jButton10.setBounds(200,140,650,25);
        jButton10.setFont(new Font("微软雅黑", Font.BOLD, 20));
        jButton11.setBounds(200,180,650,25);
        jButton12.setBounds(200,220,650,25);
        jButton11.setFont(new Font("微软雅黑", Font.BOLD, 20));
        jButton12.setFont(new Font("微软雅黑", Font.BOLD, 20));


        JLabel jLabel3 = new JLabel("---MEAL---------------------------------------------------------------------------------------------------------------------");
        jLabel3.setBounds(0,100,8000,25);
        jLabel3.setFont(new Font("微软雅黑", Font.BOLD, 25));
        JLabel jLabel5 = new JLabel("---Insurance---------------------------------------------------------------------------------------------------------------------");
        jLabel5.setBounds(0,290,8000,25);
        jLabel5.setFont(new Font("微软雅黑", Font.BOLD, 25));
        JLabel jLabel6 = new JLabel("---------------------------------------------------------------------------------------------------------------------------");
        jLabel6.setBounds(0,520,8000,25);
        jLabel6.setFont(new Font("微软雅黑", Font.BOLD, 25));
        Color color=new Color(0,191,255);

        JButton jButton1 = new JButton("<html>"+"No insurance<br>"+"<html>");
        JButton jButton2 = new JButton("<html>"+"Standard insurance"+"<br>"+"$20"+"<html>");
        JButton jButton3 = new JButton("<html>"+"Supreme insurance"+"<br>"+"$50"+"<html>");
        jButton1.setFont(new Font("微软雅黑", Font.BOLD, 16));
        jButton2.setFont(new Font("微软雅黑", Font.BOLD, 16));
        jButton3.setFont(new Font("微软雅黑", Font.BOLD, 16));

        JButton jButton4 = new JButton("Detail");
        JButton jButton5 = new JButton("Reserve");
        JButton jButton6 = new JButton("Back");

        jButton1.setBounds(200,340,110,130);
        jButton1.setMargin(new Insets(0,0,0,0));
        jButton2.setBounds(435,340,110,130);
        jButton3.setBounds(670,340,110,130);
        JLabel jLabel7 = new JLabel("Price： $"+ ReadTXT.temBook.sumPrice());
        jLabel7.setBounds(10,600,400,25);
        jLabel7.setFont(new Font("微软雅黑", Font.BOLD, 25));

        jButton4.setBounds(200,600,120,25);
        jButton4.setMargin(new Insets(0,0,0,0));
        jButton5.setBounds(750,650,120,40);
        jButton5.setBackground(new Color(255, 140, 0));
        jButton6.setBounds(930,650,120,40);
        jButton6.setBackground(new Color(30, 144, 255));
        jButton4.setFont(new Font("微软雅黑", Font.BOLD, 20));
        jButton6.setFont(new Font("微软雅黑", Font.BOLD, 20));
        jButton5.setFont(new Font("微软雅黑", Font.BOLD, 20));
        jButton1.setEnabled(false);
        jButton1.setBackground(color);
        jButton2.setEnabled(false);
        jButton2.setBackground(color);
        jButton3.setEnabled(false);
        jButton3.setBackground(color);
        jButton10.setEnabled(false);
        jButton10.setBackground(color);
        jButton11.setEnabled(false);
        jButton11.setBackground(color);
        jButton12.setEnabled(false);
        jButton12.setBackground(color);

        JRadioButton radioButton1 = new JRadioButton();
        JRadioButton radioButton2 = new JRadioButton();
        JRadioButton radioButton3 = new JRadioButton();
        JRadioButton radioButton4 = new JRadioButton();
        JRadioButton radioButton5 = new JRadioButton();
        JRadioButton radioButton6 = new JRadioButton();
        radioButton1.setBounds(240,490,70,25);
        radioButton2.setBounds(475,490,70,25);
        radioButton3.setBounds(710,490,70,25);
        radioButton4.setBounds(900,140,70,25);
        radioButton5.setBounds(900,180,70,25);
        radioButton6.setBounds(900,220,70,25);

        ButtonGroup group1 = new ButtonGroup();
        ButtonGroup group2 = new ButtonGroup();

        group1.add(radioButton1);
        group1.add(radioButton2);
        group1.add(radioButton3);
        group2.add(radioButton4);
        group2.add(radioButton5);
        group2.add(radioButton6);
        container1.add(jLabel1);
        container1.add(jLabel3);
        container1.add(jButton11);
        container1.add(jButton12);
        container1.add(jButton10);
        container1.add(jLabel5);
        container1.add(jButton1);
        container1.add(jButton2);
        container1.add(jButton3);
        container1.add(jButton4);
        container1.add(jButton5);
        container1.add(jButton6);

        container1.add(jLabel6);
        container1.add(jLabel7);
        container1.add(radioButton1);
        container1.add(radioButton2);
        container1.add(radioButton3);
        container1.add(radioButton4);
        container1.add(radioButton5);
        container1.add(radioButton6);
        radioButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReadTXT.temBook.setInsurancePrice(0);
                jLabel7.setText("Price： $"+ ReadTXT.temBook.sumPrice());
            }
        });
        radioButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReadTXT.temBook.setInsurancePrice(20);
                jLabel7.setText("Price： $"+ ReadTXT.temBook.sumPrice());
            }
        });
        radioButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReadTXT.temBook.setInsurancePrice(50);
                jLabel7.setText("Price： $"+ ReadTXT.temBook.sumPrice());
            }
        });
        radioButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReadTXT.temBook.setFoodPrice(0);
                jLabel7.setText("Price： $"+ ReadTXT.temBook.sumPrice());
            }
        });
        radioButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReadTXT.temBook.setFoodPrice(58);
                jLabel7.setText("Price： $"+ ReadTXT.temBook.sumPrice());
            }
        });
        radioButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReadTXT.temBook.setFoodPrice(78);
                jLabel7.setText("Price： $"+ ReadTXT.temBook.sumPrice());
            }
        });
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
//        this.setVisible(true);
        this.setSize(1200, 800);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
}
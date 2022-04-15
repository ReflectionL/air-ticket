package Page;

import data.ReadTXT;
import logic.AirportSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class windows9 extends JFrame {
    public static void main(String[] args) {
        new windows9();
    }

    public windows9() {
        //this.setVisible(true);
        this.setSize(1200, 800);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        Container container1 = this.getContentPane();
        //this.setResizable(false);
        container1.setLayout(null);

        JPanel jPanel1 = new JPanel();
        jPanel1.setBounds(200,160,800,400);
        jPanel1.setLayout(null);
        jPanel1.setBorder(BorderFactory.createCompoundBorder());

        JLabel jLabel1 = new JLabel("Credit Card Number:");
        jLabel1.setBounds(20,0,1000,200);
        jLabel1.setFont(new Font("微软雅黑", Font.BOLD, 25));

        JLabel jLabel2 = new JLabel("Password:");
        jLabel2.setBounds(40,80,1000,200);
        jLabel2.setFont(new Font("微软雅黑", Font.BOLD, 25));

        JLabel jLabel3 = new JLabel("Credit card payment");
        jLabel3.setBounds(460,-20,1000,200);
        jLabel3.setFont(new Font("微软雅黑", Font.BOLD, 30));

        JTextField jTextField1 = new JTextField();
        jTextField1.setBounds(280,80,400,40);
        jTextField1.setFont(new Font("微软雅黑", Font.BOLD, 25));


        JPasswordField jTextField2 = new JPasswordField();
        jTextField2.setBounds(280,160,400,40);
        jTextField2.setFont(new Font("微软雅黑", Font.BOLD, 25));

        JButton jButton1 = new JButton("Payment");
        jButton1.setBounds(300,280,200,40);
        jButton1.setFont(new Font("微软雅黑", Font.BOLD, 30));

        this.add(jPanel1);
        this.add(jLabel3);
        jPanel1.add(jLabel1);
        jLabel1.add(jLabel2);
        jPanel1.add(jTextField1);
        jPanel1.add(jTextField2);
        jPanel1.add(jButton1);

        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReadTXT.ticket.setSeat(ReadTXT.temBook.getSeat());
                ReadTXT.writeFile(ReadTXT.ticket);
                AirportSystem.toPage(10);
                AirportSystem.refreshPage();
            }
        });
    }
}
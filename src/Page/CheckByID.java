package Page;

import data.interfence.LoginValidate;
import data.interfence.tEST1;
import logic.AirportSystem;

import java.awt.*;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * This class generate a user interface to let user input their ID and Name to inquire their tickets information
 * @author Zhaoyu Wang
 * @version 1.0
 */
public class CheckByID extends JFrame {
    public CheckByID() {
        this.setLayout(null);
        JPanel kb = new tEST1();
        kb.setBounds(0,250,1200,350);
        add(kb);

        JLabel lblNewLabel = new JLabel("Please input your information");
        lblNewLabel.setBounds(260,-40,1000,200);
        lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 50));
        add(lblNewLabel);

        JLabel lblNewLabel1 = new JLabel("Name：");
        lblNewLabel1.setBounds(270,40,1000,200);
        lblNewLabel1.setFont(new Font("微软雅黑", Font.BOLD, 40));
        add(lblNewLabel1);

        JTextField jt1 = new JTextField();
        jt1.setBounds(410, 124, 400, 42);
        jt1.setFont(new Font("微软雅黑", Font.BOLD, 30));
        jt1.setColumns(30);
        add(jt1);

        JLabel lblNewLabel2 = new JLabel("ID：");
        lblNewLabel2.setBounds(344,200,1000,35);
        lblNewLabel2.setFont(new Font("微软雅黑", Font.BOLD, 40));
        add(lblNewLabel2);

        JTextField jt2 = new JTextField();
        jt2.setBounds(410, 204, 400, 42);
        jt2.setFont(new Font("微软雅黑", Font.BOLD, 30));
        jt2.setColumns(30);
        add(jt2);

        JButton btnNewButton1 = new JButton("Inquire");
        btnNewButton1.setBounds(350, 650, 194, 60);
        btnNewButton1.setFont(new Font("微软雅黑", Font.BOLD, 30));
        add(btnNewButton1);

        JButton btnNewButton2 = new JButton("Back");
        btnNewButton2.setBounds(600, 650, 194, 60);
        btnNewButton2.setFont(new Font("微软雅黑", Font.BOLD, 30));
        add(btnNewButton2);

        btnNewButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(LoginValidate.queryID(jt2.getText().toString(), jt1.getText().toString())) {
                        AirportSystem.refreshtoPage(12);
                        jt1.setText("");
                        jt2.setText("");
                }
                else JOptionPane.showMessageDialog(null, "The ticket is not exist.", "Waring", JOptionPane.ERROR_MESSAGE);
            }
        });
        btnNewButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AirportSystem.toPage(1);
            }
        });

        this.setSize(1200,800);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
}
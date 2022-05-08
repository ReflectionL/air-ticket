package Page;

import data.interfence.ReadTXT;
import data.interfence.tEST1;
import logic.AirportSystem;

import java.awt.*;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class windows3_1 extends JFrame {


    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        windows3_1 windows3_1 = new windows3_1();
    }

    /**
     * Create the frame.
     */
    public windows3_1() {
//        Container container1 = this.getContentPane();
//        container1.setLayout(null);
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
        add(jt1);
        jt1.setColumns(30);

        JLabel lblNewLabel2 = new JLabel("ID：");
        lblNewLabel2.setBounds(344,200,1000,35);
        lblNewLabel2.setFont(new Font("微软雅黑", Font.BOLD, 40));
        add(lblNewLabel2);


        JTextField jt2 = new JTextField();
        jt2.setBounds(410, 204, 400, 42);
        jt2.setFont(new Font("微软雅黑", Font.BOLD, 30));
        add(jt2);
        jt2.setColumns(30);

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
                String name = jt1.getText().toString();
                String ID = jt2.getText().toString();
                ReadTXT.queryID(ID);

                if(ReadTXT.tickets.size() != 0) {
                    if(ReadTXT.tickets.get(0).getName().equals(name)) {
                        AirportSystem.toPage(12);
                        jt1.setText("");
                        jt2.setText("");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "The ticket is not exist.", "Waring", JOptionPane.ERROR_MESSAGE);
                    }

                }
                else {
                    JOptionPane.showMessageDialog(null, "The ticket is not exist.", "Waring", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btnNewButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AirportSystem.toPage(1);
            }
        });
        //this.setVisible(true);
        this.setSize(1200,800);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
}
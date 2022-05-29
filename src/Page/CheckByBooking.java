package Page;
import data.interfence.LoginValidate;
import data.interfence.tEST1;
import logic.AirportSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * This class generate a user interface to let user input their booking ID to inquire their tickets informatio
 * @author Zhaoyu Wang
 * @version 1.0
 */
public class CheckByBooking extends JFrame {
    private tEST1 board;

    public CheckByBooking() {
        Container container = this.getContentPane();
        container.setLayout(null);

        JPanel kb = new tEST1();
        kb.setBounds(0,250,1200,350);
        add(kb);

        JLabel lblNewLabel = new JLabel("Please input your information");
        lblNewLabel.setBounds(260,-40,1000,200);
        lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 50));
        add(lblNewLabel);

        JLabel lblNewLabel1 = new JLabel("Booking:");
        lblNewLabel1.setBounds(250,100,250,200);
        lblNewLabel1.setFont(new Font("微软雅黑", Font.BOLD, 40));
        add(lblNewLabel1);

        JTextField jt1 = new JTextField();
        jt1.setBounds(480, 184, 400, 42);
        jt1.setFont(new Font("微软雅黑", Font.BOLD, 30));
        jt1.setColumns(60);
        add(jt1);

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
                if(LoginValidate.queryBookid(jt1.getText().toString())) {
                    AirportSystem.refreshtoPage(12);
                    jt1.setText("");
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
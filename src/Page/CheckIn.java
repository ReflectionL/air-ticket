package Page;

import data.interfence.CheckInOK;
import data.interfence.ReadTXT;
import logic.AirportSystem;

import java.awt.*;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.net.URL;
/**
 * This class generate a user interface to put their ID card on the equipment to check in
 * @author Pengtao Li
 * @version 1.0
 */
public class CheckIn extends JFrame {

    public CheckIn() {
        this.setLayout(null);
        URL resource = Welcome.class.getResource("/picture/Scan ID.GIF ");
        Icon icon = new ImageIcon(resource);
        JButton jButton = new JButton();
        jButton.setIcon(icon);
        jButton.setBounds(350,300,444,300);
        add(jButton);

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

        JButton btnNewButton1 = new JButton("Confirm");
        btnNewButton1.setBounds(450, 650, 194, 60);
        btnNewButton1.setFont(new Font("微软雅黑", Font.BOLD, 30));
        add(btnNewButton1);

        jButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jt1.setText(ReadTXT.ticket.getName());
                jt2.setText(ReadTXT.ticket.getID());
            }
        });
        btnNewButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (jt1.getText().equals(null) || jt2.getText().equals(null)) JOptionPane.showMessageDialog(null, "Please scan ID.", "Waring", JOptionPane.ERROR_MESSAGE);
                else if (!CheckInOK.checkIn(jt1.getText(), jt2.getText())) JOptionPane.showMessageDialog(null, "Wrong ID or name!", "Waring", JOptionPane.ERROR_MESSAGE);
                else{
                    JOptionPane.showMessageDialog(null, "Check in successfully", "Hint", JOptionPane.INFORMATION_MESSAGE);
                    AirportSystem.refreshtoPage(12);
                }
            }
        });

        this.setSize(1200,800);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
}
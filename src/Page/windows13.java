package Page;

import data.interfence.ReadTXT;
import data.interfence.tEST1;
import logic.AirportSystem;

import java.awt.*;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.net.URL;

public class windows13 extends JFrame {


    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        windows13 windows13 = new windows13();
    }

    /**
     * Create the frame.
     */
    public windows13() {
        Container container1 = this.getContentPane();

        this.setLayout(null);
        URL resource = windows1.class.getResource("/picture/Scan ID.GIF ");
        Icon icon = new ImageIcon(resource);
        JButton jButton = new JButton();
        jButton.setIcon(icon);
        jButton.setBounds(350,300,444,300);

        JLabel lblNewLabel = new JLabel("Please input your information");
        lblNewLabel.setBounds(260,-40,1000,200);
        lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 50));


        JLabel lblNewLabel1 = new JLabel("Name：");
        lblNewLabel1.setBounds(270,40,1000,200);
        lblNewLabel1.setFont(new Font("微软雅黑", Font.BOLD, 40));


        JTextField jt1 = new JTextField();
        jt1.setBounds(410, 124, 400, 42);
        jt1.setFont(new Font("微软雅黑", Font.BOLD, 30));
        add(jt1);
        jt1.setColumns(30);

        JLabel lblNewLabel2 = new JLabel("ID：");
        lblNewLabel2.setBounds(344,200,1000,35);
        lblNewLabel2.setFont(new Font("微软雅黑", Font.BOLD, 40));


        JTextField jt2 = new JTextField();
        jt2.setBounds(410, 204, 400, 42);
        jt2.setFont(new Font("微软雅黑", Font.BOLD, 30));
        add(jt2);
        jt2.setColumns(30);


        JButton btnNewButton1 = new JButton("Confirm");
        btnNewButton1.setBounds(450, 650, 194, 60);
        btnNewButton1.setFont(new Font("微软雅黑", Font.BOLD, 30));

        add(lblNewLabel);
        add(lblNewLabel1);
        add(lblNewLabel2);
        add(btnNewButton1);
        add(jButton);

        jButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jt1.setText(ReadTXT.ticket.getName());
                jt2.setText(ReadTXT.ticket.getID());
            }
        });
        btnNewButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (jt1.getText().equals(null) || jt2.getText().equals(null)){
                    JOptionPane.showMessageDialog(null, "Please scan ID.", "Waring", JOptionPane.ERROR_MESSAGE);
                }
                else if((!jt1.getText().equals(ReadTXT.ticket.getName()))&&(!jt2.getText().equals(ReadTXT.ticket.getID()))){
                    JOptionPane.showMessageDialog(null, "Wrong ID or name!", "Waring", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Check in successfully", "Hint", JOptionPane.INFORMATION_MESSAGE);
                    ReadTXT.ticket.setCheckin(1);
                    ReadTXT.writeFile(ReadTXT.ticket);
                    AirportSystem.toPage(12);
                }
            }
        });

        this.setSize(1200,800);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
}
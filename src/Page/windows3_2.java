package Page;

import data.ReadTXT;
import logic.AirportSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class windows3_2 extends JFrame {
    private JTextField jt1;

    /**
     * Create the panel.
     */
    public static void main(String[] args) {
        windows3_2 windows3_2 = new windows3_2();
    }
    public windows3_2() {
        Container container1 = this.getContentPane();

        container1.setLayout(null);
        JLabel lblNewLabel = new JLabel("Please input your information");
        lblNewLabel.setBounds(260,-40,1000,200);
        lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 50));
        add(lblNewLabel);

        JLabel lblNewLabel1 = new JLabel("Booking:");
        lblNewLabel1.setBounds(250,100,250,200);
        lblNewLabel1.setFont(new Font("微软雅黑", Font.BOLD, 40));
        add(lblNewLabel1);


        jt1 = new JTextField();
        jt1.setBounds(480, 184, 400, 42);
        jt1.setFont(new Font("微软雅黑", Font.BOLD, 30));
        add(jt1);
        jt1.setColumns(60);

        JButton btnNewButton1 = new JButton("Inquire");
        btnNewButton1.setBounds(340, 560, 194, 60);
        btnNewButton1.setFont(new Font("微软雅黑", Font.BOLD, 30));
        add(btnNewButton1);
        JButton btnNewButton2 = new JButton("Back");
        btnNewButton2.setBounds(590, 560, 194, 60);
        btnNewButton2.setFont(new Font("微软雅黑", Font.BOLD, 30));
        add(btnNewButton2);

        btnNewButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String bookID = jt1.getText().toString();
                ReadTXT.queryBookid(bookID);

                if(ReadTXT.ticket.getID() != null) {
                    ReadTXT.tickets.add(ReadTXT.ticket);
                    AirportSystem.toPage(12);
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
//        this.setVisible(true);
        this.setSize(1200,800);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
}
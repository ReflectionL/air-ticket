package Page;

import data.ReadTXT;
import logic.AirportSystem;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class windows3_2 extends JPanel {
    private JTextField jt1;

    /**
     * Create the panel.
     */
    public windows3_2() {
        setLayout(null);

        JLabel lblNewLabel = new JLabel("Please input your information");
        lblNewLabel.setBounds(260,-40,1000,200);
        lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 50));
        add(lblNewLabel);

        JLabel lblNewLabel1 = new JLabel("Booking：");
        lblNewLabel1.setBounds(140,80,1000,200);
        lblNewLabel1.setFont(new Font("微软雅黑", Font.BOLD, 40));
        add(lblNewLabel1);

        JLabel lblNewLabel3 = new JLabel("------------------------------------------------------------------------------------");
        lblNewLabel3.setBounds(0,220,10000,200);
        lblNewLabel3.setFont(new Font("微软雅黑", Font.BOLD, 40));
        add(lblNewLabel3);

        jt1 = new JTextField();
        jt1.setBounds(324, 164, 400, 42);
        jt1.setFont(new Font("微软雅黑", Font.BOLD, 30));
        add(jt1);
        jt1.setColumns(60);

        JButton btnNewButton1 = new JButton("Inquire");
        btnNewButton1.setBounds(500, 560, 194, 60);
        btnNewButton1.setFont(new Font("微软雅黑", Font.BOLD, 30));
        add(btnNewButton1);

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
    }
}
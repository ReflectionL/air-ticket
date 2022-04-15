package Page;

import data.ReadTXT;
import logic.AirportSystem;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class windows3_3 extends JPanel {

    /**
     * Create the panel.
     */
    public windows3_3() {
        setLayout(null);
        JLabel lblNewLabel = new JLabel("Please input your information");
        lblNewLabel.setBounds(260,-40,1000,200);
        lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 50));
        add(lblNewLabel);

        JLabel lblNewLabel1 = new JLabel("Name：");
        lblNewLabel1.setBounds(160,80,1000,200);
        lblNewLabel1.setFont(new Font("微软雅黑", Font.BOLD, 40));
        add(lblNewLabel1);

        JTextField jt1 = new JTextField();
        jt1.setBounds(300, 164, 400, 42);
        jt1.setFont(new Font("微软雅黑", Font.BOLD, 30));
        add(jt1);
        jt1.setColumns(30);

        JLabel lblNewLabel2 = new JLabel("ID：");
        lblNewLabel2.setBounds(234,160,1000,200);
        lblNewLabel2.setFont(new Font("微软雅黑", Font.BOLD, 40));
        add(lblNewLabel2);

        JLabel lblNewLabel3 = new JLabel("------------------------------------------------------------------------------------");
        lblNewLabel3.setBounds(0,220,10000,200);
        lblNewLabel3.setFont(new Font("微软雅黑", Font.BOLD, 40));
        add(lblNewLabel3);
        JTextField jt2 = new JTextField();
        jt2.setBounds(300, 244, 400, 42);
        jt2.setFont(new Font("微软雅黑", Font.BOLD, 30));
        add(jt2);
        jt2.setColumns(30);

        JButton btnNewButton1 = new JButton("Inquire");
        btnNewButton1.setBounds(502, 560, 194, 60);
        btnNewButton1.setFont(new Font("微软雅黑", Font.BOLD, 30));
        add(btnNewButton1);

        btnNewButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = jt1.getText().toString();
                String ID = jt2.getText().toString();
                ReadTXT.queryID(ID);

                if(ReadTXT.tickets.size() != 0) {
                    if(ReadTXT.tickets.get(0).getName().equals(name)) {
                        AirportSystem.toPage(12);
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
    }
}
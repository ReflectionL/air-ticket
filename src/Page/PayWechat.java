package Page;

import data.interfence.PayValidate;
import logic.AirportSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * This class creates an interface that user can Scan the QR code on wechat to pay
 * @author Zhaoyu Wang
 * @version 1.0
 */
public class PayWechat extends JFrame{
    public PayWechat()
    {

        ImageIcon icon1=new ImageIcon("src/picture/payment.jpg" );
        JLabel label1=new JLabel(icon1);
        label1.setBounds(500,250,icon1.getIconWidth(),icon1.getIconHeight());

        this.getLayeredPane().add(label1,(Integer.MIN_VALUE));

        JPanel panel =new JPanel();
        JPanel panelTop=(JPanel)this.getContentPane();
        panelTop.setOpaque(false);
        panel.setOpaque(false);

        JLabel label0=new JLabel("Please sweep the payment code");
        label0.setFont(new Font("微软雅黑", Font.BOLD, 50));
        label0.setBounds(400,10,800,200);

        JButton jButton1 = new JButton("Back");
        jButton1.setBounds(300,500,250,70);
        jButton1.setFont(new Font("微软雅黑", Font.BOLD, 25));

        JButton jButton2 = new JButton("Pay Successfully");
        jButton2.setBounds(650,500,250,70);
        jButton2.setFont(new Font("微软雅黑", Font.BOLD, 25));

        panel.add(label0);
        this.getLayeredPane().add(jButton1,(Integer.MIN_VALUE));
        this.getLayeredPane().add(jButton2,(Integer.MIN_VALUE));
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AirportSystem.toPage(7);
            }
        });
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PayValidate.successPay();
                AirportSystem.refreshtoPage(15);
            }
        });
        this.add(panel);
        this.setSize(1200, 800);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
}
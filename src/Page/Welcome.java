package Page;

import logic.AirportSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
/**
 * This class creates an interface to welcome users and choose the way to enter into the check-in system
 * @author Zhaoyu Wang
 * @version 1.0
 */
public class Welcome extends JFrame {
    public Welcome(){
        Container container = this.getContentPane();
        container.setLayout(null);
        JLabel jl1 = new JLabel("Welcome to the automatic check-in system");
        jl1.setBounds(200,50,1000,100);
        jl1.setFont(new Font("微软雅黑", Font.BOLD, 35));

        URL resource1 = Welcome.class.getResource("/picture/ID.jpg");
        URL resource2 = Welcome.class.getResource("/picture/Ticket.png");
        URL resource3 = Welcome.class.getResource("/picture/contact.png");
        Icon icon = new ImageIcon(resource1);
        Icon icon2 = new ImageIcon(resource2);
        Icon icon3 = new ImageIcon(resource3);

        JButton jb1 = new JButton();
        JButton jb2 = new JButton();
        JButton jb3 = new JButton();

        jb1.setBounds(50,300,500,300);
        jb1.setIcon(icon);
        jb2.setBounds(650,300,500,300);
        jb2.setIcon(icon2);
        jb3.setBounds(530,650,155,54);
        jb3.setIcon(icon3);

        jb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AirportSystem.toPage(3);
            }
        });

        jb2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AirportSystem.toPage(13);
            }
        });
        jb3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AirportSystem.toPage(11);
            }
        });

        this.add(jl1);
        this.add(jb1);
        this.add(jb2);
        this.add(jb3);

        this.setSize(1200,800);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
}



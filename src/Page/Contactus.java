package Page;

import jdk.jfr.Description;
import logic.AirportSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
/**
 * @className Contactus
 * @Author Zhaoyu Wang
 * @Description //This class generate a user interface to provide our team's contact ways
 * @Date 23:58 2022/5/26
 * @Version 1.0
 **/
public class Contactus extends JFrame{
    public Contactus(){
        Container container = this.getContentPane();
        container.setLayout(null);
        JLabel jl1 = new JLabel("Contact us");
        jl1.setBounds(500,50,1000,100);
        jl1.setFont(new Font("微软雅黑", Font.BOLD, 35));
        jl1.setForeground(Color.white);
        JButton jButton1 = new JButton();
        URL resource1 = Welcome.class.getResource("/picture/Plane.png");
        URL resource2 = Welcome.class.getResource("/picture/contactus.png");
        URL resource3 = Welcome.class.getResource("/picture/back.png");
        Icon icon = new ImageIcon(resource1);
        Icon icon2 = new ImageIcon(resource2);
        Icon icon3 = new ImageIcon(resource3);

        JLabel jb1 = new JLabel();
        jb1.setBounds(0,0,1200,800);
        jb1.setIcon(icon);
        JLabel jb2 = new JLabel();
        jb2.setBounds(0,514,1200,286);
        jb2.setIcon(icon2);
        jButton1.setBounds(0,0,50,50);
        jButton1.setIcon(icon3);
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AirportSystem.toPage(1);
            }
        });
        this.add(jButton1);
        this.add(jb2);
        this.add(jl1);
        this.add(jb1);
        this.setSize(1200,800);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
}

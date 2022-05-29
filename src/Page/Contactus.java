package Page;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
/**
 * This class generate a user interface to provide our team's contact ways
 * @author Zhaoyu Wang
 * @version 1.0
 */
public class Contactus extends JFrame {
    public Contactus(){
        Container container = this.getContentPane();
        container.setLayout(null);
        JLabel jl1 = new JLabel("Contact us");
        jl1.setBounds(500,50,1000,100);
        jl1.setFont(new Font("微软雅黑", Font.BOLD, 35));
        jl1.setForeground(Color.white);
        URL resource1 = Welcome.class.getResource("/picture/Plane.png");
        URL resource2 = Welcome.class.getResource("/picture/contactus.png");

        Icon icon = new ImageIcon(resource1);
        Icon icon2 = new ImageIcon(resource2);

        JButton jButton = new JButton();
        jButton.setText("EXIT");
        jButton.setFont(new Font("微软雅黑", Font.BOLD, 15));
        jButton.setBounds(10,700,75,50);


        JLabel jb1 = new JLabel();
        jb1.setBounds(0,0,1200,800);
        jb1.setIcon(icon);
        JLabel jb2 = new JLabel();
        jb2.setBounds(0,514,1200,286);
        jb2.setIcon(icon2);
        this.add(jb2);
        this.add(jl1);
        this.add(jb1);
        this.add(jButton);
        this.setSize(1200,800);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
}

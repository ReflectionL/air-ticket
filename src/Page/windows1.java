package Page;

import logic.AirportSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class windows1 extends JFrame implements ActionListener {
    private JButton jb1 = new JButton();
    private JButton jb2 = new JButton();

    public static void main(String[] args){
        windows1 w=new windows1();
    }
    public windows1(){
        Container container1 = this.getContentPane();
        container1.setLayout(null);
        JLabel jl1 = new JLabel("Welcome to the automatic check-in system");
        jl1.setBounds(200,50,1000,100);
        jl1.setFont(new Font("微软雅黑", Font.BOLD, 35));
        URL resource2 = windows1.class.getResource("/picture/ID.jpg");
        URL resource3 = windows1.class.getResource("/picture/Ticket.png");
        Icon icon = new ImageIcon(resource2);
        Icon icon2 = new ImageIcon(resource3);
        jb1.setBounds(50,300,500,300);
        jb1.setIcon(icon);
        jb2.setBounds(650,300,500,300);
        jb2.setIcon(icon2);
        jb1.addActionListener(this);
        jb2.addActionListener(this);

        this.add(jl1);
        this.add(jb1);
        this.add(jb2);
        this.setVisible(true);
        this.setSize(1200,800);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == jb1) {
            AirportSystem.toPage(3);
        }
        if(e.getSource() == jb2) {
            AirportSystem.toPage(13);
        }
    }

}



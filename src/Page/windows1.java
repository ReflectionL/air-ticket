package Page;

import logic.AirportSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class windows1 extends JFrame implements ActionListener {
    Container container=this.getContentPane();
    URL url1=windows1.class.getResource("picture/check-in.png");
    private JButton jb1 = new JButton("Check In");
    //private JButton jb2 = new JButton("打印");
    //private JButton jb3 = new JButton("签到");

    public static void main(String[] args){
        windows1 w=new windows1();
    }
    public windows1(){
        this.setSize(1200,800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        JPanel jp1 = new JPanel();
        jp1.setLayout(null);
        //this.setVisible(true);
        this.setContentPane(jp1);

        JLabel jl1 = new JLabel("Welcome to the automatic check-in sysytem");
        jl1.setBounds(300,60,800,50);
        jl1.setFont(new Font("微软雅黑", Font.BOLD, 26));
        jb1.setBounds(0,140,1200,600);
        jb1.setFont(new Font("微软雅黑", Font.BOLD, 26));
        //jb2.setBounds(400,70,200,150);
        //jb3.setBounds(400,220,200,150);
        jp1.add(jl1);
        jp1.add(jb1);
        //jp1.add(jb2);
        //jp1.add(jb3);
        jb1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == jb1) {
            AirportSystem.toPage(3);
        }
    }

}



package Page;

import logic.AirportSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class windows2 extends JFrame {
    public static void main(String[] args){
        windows2 windows2 = new windows2();
    }
    public windows2(){
        //this.setVisible(true);
        this.setSize(1200,800);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        Container container1 = this.getContentPane();
        this.setResizable(false);
        container1.setLayout(null);
        JButton jb1 = new JButton("Choose the seat");
        JButton jb2 = new JButton("Return");
        JLabel jl1 = new JLabel("Ticket information");
        JLabel jl2 = new JLabel("The departure time:17：00");
        JLabel jl3 = new JLabel("Time of arrival:19：00");
        JLabel jl4 = new JLabel("Place of origin - Destination:南阳-北京");
        JLabel jl5 = new JLabel("Seat：二等座");
        JLabel jl6 = new JLabel("Meal：未选");

        jl1.setBounds(450,70,480,50);
        jl1.setFont(new Font("微软雅黑", Font.BOLD, 30));
        jl2.setBounds(200,150,800,50);
        jl2.setFont(new Font("微软雅黑", Font.BOLD, 26));
        jl3.setBounds(200,190,800,50);
        jl3.setFont(new Font("微软雅黑", Font.BOLD, 26));
        jl4.setBounds(200,230,800,50);
        jl4.setFont(new Font("微软雅黑", Font.BOLD, 26));
        jl5.setBounds(200,270,800,50);
        jl5.setFont(new Font("微软雅黑", Font.BOLD, 26));
        jl6.setBounds(200,310,800,50);
        jl6.setFont(new Font("微软雅黑", Font.BOLD, 26));
        jb1.setBounds(380,600,300,60);
        jb1.setFont(new Font("微软雅黑", Font.BOLD, 26));
        jb2.setBounds(710,600,160,60);
        jb2.setFont(new Font("微软雅黑", Font.BOLD, 26));
        container1.add(jl1);
        container1.add(jl2);
        container1.add(jl3);
        container1.add(jl4);
        container1.add(jl5);
        container1.add(jl6);
        container1.add(jb1);
        container1.add(jb2);

        jb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AirportSystem.toPage(4);
            }
        });

        jb2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AirportSystem.toPage(12);
            }
        });
    }
}

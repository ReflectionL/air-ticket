package Page;

import data.ReadTXT;
import logic.AirportSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

public class windows2 extends JFrame {
    public static void main(String[] args){
        windows2 windows2 = new windows2();
    }
    public windows2(){
        this.setVisible(true);
        this.setSize(1200,800);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        Container container1 = this.getContentPane();
        this.setResizable(false);
        container1.setLayout(null);

        SimpleDateFormat format = new SimpleDateFormat("HH:mm MM-dd");

        try {
            JButton jb1 = new JButton("Choose the seat");
            JButton jb2 = new JButton("Return");
            JLabel jl1 = new JLabel("Ticket information");
            JLabel jl2 = new JLabel("The departure time: " + format.format(ReadTXT.ticket.getBegintime()));
            JLabel jl3 = new JLabel("Time of arrival: " + format.format(ReadTXT.ticket.getEndtime()));
            JLabel jl4 = new JLabel("Place of origin - Destination: " + ReadTXT.ticket.getBeginplace() + " - " + ReadTXT.ticket.getEndplace());
            JLabel jl5 = new JLabel("Seat：" + ReadTXT.ticket.getSeat());
            JLabel jl6 = new JLabel("Meal：" + ReadTXT.ticket.getFood());

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

            container1.add(jb2);

            if(ReadTXT.ticket.getSeat().equals("")) {
                container1.add(jb1);
            }

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
        catch (Exception e) {
        }
    }
}

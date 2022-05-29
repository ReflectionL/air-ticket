package Page;

import data.interfence.ReadTXT;
import logic.AirportSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.text.SimpleDateFormat;
/**
 * This class creates an interface that displays the user's initial ticket information
 * @author Zhaoyu Wang,Pengtao Li
 * @version 1.0
 */
public class Information extends JFrame {
    public Information(){
        Container container = this.getContentPane();
        container.setLayout(null);
        URL resource = Welcome.class.getResource("/picture/detail.png ");
        Icon icon = new ImageIcon(resource);
        SimpleDateFormat format1= new SimpleDateFormat("yyyy-MM-dd HH:mm");
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat format3 = new SimpleDateFormat("HH:mm");
        try {
            JLabel jl0 = new JLabel();
            jl0.setIcon(icon);
            jl0.setBounds(0,00, icon.getIconWidth(), icon.getIconHeight());

            JButton jb1 = new JButton("Choose the seat");
            JButton jb2 = new JButton("Return");
            JLabel jl1 = new JLabel("Ticket information");
            JLabel jl2 = new JLabel(ReadTXT.ticket.getFlightno());
            JLabel jl3 = new JLabel(format2.format(format1.parse(ReadTXT.ticket.getBegintime()))+" "+format3.format(format1.parse(ReadTXT.ticket.getBegintime()))+"-"+format3.format(format1.parse(ReadTXT.ticket.getEndtime())));
            JLabel jl4 = new JLabel(ReadTXT.ticket.getBeginplace());
            JLabel jl5 = new JLabel(ReadTXT.ticket.getName());
            JLabel jl6 = new JLabel(ReadTXT.ticket.getBoardinggate());
            JLabel jl7 = new JLabel(ReadTXT.ticket.getSeat());
            JLabel jl8 = new JLabel(ReadTXT.ticket.getEndplace());
            JLabel jl9 = new JLabel(ReadTXT.ticket.getSeat()+"   "+ReadTXT.ticket.getRealSeatrank());
            JLabel jl10 = new JLabel(ReadTXT.ticket.getEndplace());
            JLabel jl11 = new JLabel("Meal: "+ReadTXT.ticket.getFood());
            JLabel jl12 = new JLabel("Insurance: "+ReadTXT.ticket.RealInsurance());
            JLabel jl13 = new JLabel("check-in luggage id: "+ReadTXT.ticket.getCarryid());
            JLabel jl14 = new JLabel("carry-on luggage num: "+ReadTXT.ticket.getCarryluggage());
            jl1.setBounds(450,70,480,50);
            jl1.setFont(new Font("微软雅黑", Font.BOLD, 30));
            jl2.setBounds(250,410,800,50);
            jl2.setFont(new Font("微软雅黑", Font.BOLD, 15));
            jl3.setBounds(250,430,800,50);
            jl3.setFont(new Font("微软雅黑", Font.BOLD, 15));
            jl4.setBounds(270,520,800,50);
            jl4.setFont(new Font("微软雅黑", Font.BOLD, 15));
            jl5.setBounds(270,580,800,50);
            jl5.setFont(new Font("微软雅黑", Font.BOLD, 15));
            jl6.setBounds(520,410,800,50);
            jl6.setFont(new Font("微软雅黑", Font.BOLD, 15));
            jl7.setBounds(660,410,800,50);
            jl7.setFont(new Font("微软雅黑", Font.BOLD, 15));
            jl8.setBounds(520,520,800,50);
            jl8.setFont(new Font("微软雅黑", Font.BOLD, 15));
            jl9.setBounds(850,410,800,50);
            jl9.setFont(new Font("微软雅黑", Font.BOLD, 15));
            jl10.setBounds(850,520,800,50);
            jl10.setFont(new Font("微软雅黑", Font.BOLD, 15));
            jl11.setBounds(850,570,800,50);
            jl11.setFont(new Font("微软雅黑", Font.BOLD, 15));
            jl12.setBounds(850,585,800,50);
            jl12.setFont(new Font("微软雅黑", Font.BOLD, 15));
            jl13.setBounds(850,600,800,50);
            jl13.setFont(new Font("微软雅黑", Font.BOLD, 15));
            jl14.setBounds(850,615,800,50);
            jl14.setFont(new Font("微软雅黑", Font.BOLD, 15));

            jb1.setBounds(680,700,300,60);
            jb1.setFont(new Font("微软雅黑", Font.BOLD, 26));
            jb2.setBounds(1000,700,160,60);
            jb2.setFont(new Font("微软雅黑", Font.BOLD, 26));

            container.add(jl1);
            container.add(jl2);
            container.add(jl3);
            container.add(jl4);
            container.add(jl5);
            container.add(jl6);
            container.add(jl7);
            container.add(jl8);
            container.add(jl9);
            container.add(jl10);
            container.add(jl11);
            container.add(jl12);
            container.add(jl13);
            container.add(jl14);
            container.add(jb2);
            container.add(jl0);

            if(ReadTXT.ticket.getSeat().equals("")) {
                container.add(jb1);
            }

            jb1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    AirportSystem.refreshtoPage(4);
                    AirportSystem.refreshtoPage(5);
                    AirportSystem.refreshtoPage(14);
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

        this.setSize(1200,800);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
}


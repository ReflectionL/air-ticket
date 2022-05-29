package Page;

import data.interfence.ReadTXT;
import logic.AirportSystem;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.text.SimpleDateFormat;
/**
 * This class creates an interface to show user haw many kinds og tickets to print later and some tickets' information
 * @author Pengtao Li
 * @version 1.0
 */
public class PrintPreview extends JFrame {
    public PrintPreview(){
        Container container1 = this.getContentPane();
        container1.setLayout(null);
        JPanel jPanel1 = new JPanel();
        jPanel1.setLayout(new FlowLayout());
        jPanel1.setPreferredSize(new Dimension(800,2000));
        JScrollPane scrollPane = new JScrollPane(
                ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER

        );
        scrollPane.setViewportView(jPanel1);
        scrollPane.setBounds(5,50,1170,600);
        scrollPane.getVerticalScrollBar().setUnitIncrement(20);

        URL resource = Welcome.class.getResource("/picture/detail.png ");
        Icon icon = new ImageIcon(resource);
        URL resource1 = Welcome.class.getResource("/picture/tag.jpg ");
        Icon icon1 = new ImageIcon(resource1);
        URL resource2 = Welcome.class.getResource("/picture/Ticket.jpg ");
        Icon icon2 = new ImageIcon(resource2);
        SimpleDateFormat format1= new SimpleDateFormat("yyyy-MM-dd HH:mm");
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat format3 = new SimpleDateFormat("HH:mm");

        try {
            JLabel jl0 = new JLabel();
            jl0.setIcon(icon);
            jl0.setBounds(0,0, icon.getIconWidth(), icon.getIconHeight());
            JLabel jtag=new JLabel();
            jtag.setIcon(icon1);
            jtag.setBounds(50,850, icon1.getIconWidth(), icon1.getIconHeight());
            JLabel jtagname=new JLabel(ReadTXT.ticket.getName());
            JLabel jtagphone=new JLabel(ReadTXT.ticket.getPhone());
            JLabel jtagnumber=new JLabel(String.valueOf(ReadTXT.ticket.getCarryluggage()));
            TitledBorder border=BorderFactory.createTitledBorder("Tag");
            border.setTitleFont(new Font("微软雅黑", Font.BOLD, 30));
            jtag.setBorder(border);
            jtagname.setBounds(200,60,400,100);
            jtagphone.setBounds(200,120,400,100);
            jtagnumber.setBounds(200,180,400,100);
            jtagname.setFont(new Font("微软雅黑", Font.BOLD, 25));
            jtagphone.setFont(new Font("微软雅黑", Font.BOLD, 25));
            jtagnumber.setFont(new Font("微软雅黑", Font.BOLD, 25));
            jtag.add(jtagname);
            jtag.add(jtagphone);
            jtag.add(jtagnumber);

            JLabel jchecktag=new JLabel();
            JLabel jchecktagid=new JLabel(ReadTXT.ticket.getCarryid());
            JLabel jchecktagnumber=new JLabel(String.valueOf(ReadTXT.ticket.getCheckluggage()));
            jchecktag.setIcon(icon2);
            jchecktag.setBounds(50,1200,icon2.getIconWidth(), icon2.getIconHeight());
            jchecktagid.setBounds(360,190,400,100);
            jchecktagnumber.setBounds(360,300,400,100);
            jchecktagid.setFont(new Font("微软雅黑", Font.BOLD, 30));
            jchecktagnumber.setFont(new Font("微软雅黑", Font.BOLD, 30));
            jchecktag.add(jchecktagid);
            jchecktag.add(jchecktagnumber);
            JButton jb1 = new JButton("Print");
            JLabel jl2 = new JLabel(ReadTXT.ticket.getFlightno());
            JLabel jl3 = new JLabel(format2.format(format1.parse(ReadTXT.ticket.getBegintime()))+" "+format3.format(format1.parse(ReadTXT.ticket.getBegintime()))+"-"+format3.format(format1.parse(ReadTXT.ticket.getEndtime())));
            JLabel jl4 = new JLabel(ReadTXT.ticket.getBeginplace());
            JLabel jl5 = new JLabel(ReadTXT.ticket.getName());
            JLabel jl6 = new JLabel(ReadTXT.ticket.getBoardinggate());
            JLabel jl7 = new JLabel(ReadTXT.ticket.getSeat());
            JLabel jl8 = new JLabel(ReadTXT.ticket.getEndplace());
            JLabel jl9 = new JLabel(ReadTXT.ticket.getSeat()+"   "+ReadTXT.ticket.getRealSeatrank());
            JLabel jl10 = new JLabel(ReadTXT.ticket.getEndplace());
            JLabel jl11 = new JLabel("Meal:"+ReadTXT.ticket.getFood());
            JLabel jl12 = new JLabel("Insurance: "+ReadTXT.ticket.RealInsurance());
            JLabel jl13 = new JLabel("check-in luggage id: "+ReadTXT.ticket.getCarryid());
            JLabel jl14 = new JLabel("carry-on luggage num: "+ReadTXT.ticket.getCarryluggage());
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

            jl0.add(jl2);
            jl0.add(jl3);
            jl0.add(jl4);
            jl0.add(jl5);
            jl0.add(jl6);
            jl0.add(jl7);
            jl0.add(jl8);
            jl0.add(jl9);
            jl0.add(jl10);
            jl0.add(jl11);
            jl0.add(jl12);
            jl0.add(jl13);
            jl0.add(jl14);
            jPanel1.add(jl0);
            if (ReadTXT.ticket.getCarryluggage()!=0) {
                jPanel1.add(jtag);
            }
            if (ReadTXT.ticket.getCheckluggage()!=0) {
                jPanel1.add(jchecktag);
            }

            container1.add(scrollPane);
            container1.add(jb1);

            jb1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    AirportSystem.toPage(10);
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


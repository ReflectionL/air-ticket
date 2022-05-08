package Page;

import data.interfence.ReadTXT;
import logic.AirportSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class windows8 extends JFrame{
    public static void main(String[] args) {
        new windows8();
    }
    public windows8()
    {

        //插入图片
        ImageIcon icon1=new ImageIcon("src/picture/payment.jpg" );
        //添加JLabel 放置图片
        JLabel label1=new JLabel(icon1);
        //设置label的位置、大小，label大小为图片的大小
        label1.setBounds(500,250,icon1.getIconWidth(),icon1.getIconHeight());

        //在frame的底层容器添加label
        this.getLayeredPane().add(label1,(Integer.MIN_VALUE));

        //panel
        JPanel panel =new JPanel();

        //panelTop，顶层容器
        JPanel panelTop=new JPanel();
        panelTop=(JPanel)this.getContentPane();

        //panel和panelTop设置透明
        panelTop.setOpaque(false);
        panel.setOpaque(false);

        //label0，这个是对界面的自定义操作，用作效果展示
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
                ReadTXT.ticket.setSeat(ReadTXT.temBook.getSeat());
                ReadTXT.ticket.setFood(ReadTXT.temBook.getFood());
                ReadTXT.ticket.setInsurance(ReadTXT.temBook.getInsurance());
                if(ReadTXT.ticket.getSeatrank() == 1 && ReadTXT.temBook.getSeatrank() == 0)
                    ReadTXT.ticket.setSeatrank(ReadTXT.temBook.getSeatrank());
                ReadTXT.writeFile(ReadTXT.ticket);
                AirportSystem.toPage(10);
            }
        });
        //添加panel，设置大小，可视
        this.add(panel);
        this.setSize(1200, 800);
//        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
}
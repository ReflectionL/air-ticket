package Page;

import data.ReadTXT;
import data.TemBook;
import logic.AirportSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class windows4 extends JFrame{
    private Map<String,JRadioButton> buttonMap = new HashMap<>();
    private Map<String,JRadioButton> fbuttonMap = new HashMap<>();
    private int seatNum = 20;
        public windows4(){
//            this.setVisible(true);

            ReadTXT.temBook = new TemBook();

            Container container = this.getContentPane();
            container.setLayout(null);

            URL resource = windows4.class.getResource("/picture/seat.jpg");
            URL resource2 = windows4.class.getResource("/picture/blueSeat.jpg");
            URL resource3 = windows4.class.getResource("/picture/redSeat.jpg");

            Icon icon = new ImageIcon(resource);
            Icon icon2 = new ImageIcon(resource2);
            Icon icon7 = new ImageIcon(resource3);

            JLabel jLabel1 = new JLabel("Please select your seat");
            JLabel jLabel2 = new JLabel("You should pay extra : $0");
            JLabel jLabel3 = new JLabel("Tips:36~37 is the first class    30~35 is the second class");
            JLabel jLabel4 = new JLabel("Has occupied:");
            JLabel jLabel5 = new JLabel("Available: ");
            JLabel jLabel6 = new JLabel("Your choice:");
            JButton jButton1 = new JButton("Back");
            JButton jButton2 = new JButton("Confirm");
            jButton1.setBounds(600,600,250,70);
            jButton1.setFont(new Font("微软雅黑", Font.BOLD, 25));
            jButton2.setBounds(900,600,250,70);
            jButton2.setFont(new Font("微软雅黑", Font.BOLD, 25));
            ImageIcon icon3=new ImageIcon("src/picture/seat.jpg" );
            //添加JLabel 放置图片
            JLabel label1=new JLabel(icon3);
            //设置label的位置、大小，label大小为图片的大小
            label1.setBounds(590,120,icon3.getIconWidth(),icon3.getIconHeight());

            ImageIcon icon4=new ImageIcon("src/picture/blueSeat.jpg" );
            //添加JLabel 放置图片
            JLabel label2=new JLabel(icon4);
            //设置label的位置、大小，label大小为图片的大小
            label2.setBounds(850,120,icon4.getIconWidth(),icon4.getIconHeight());

            ImageIcon icon5=new ImageIcon("src/picture/redSeat.jpg" );
            //添加JLabel 放置图片
            JLabel label3=new JLabel(icon5);
            //设置label的位置、大小，label大小为图片的大小
            label3.setBounds(380,120,icon5.getIconWidth(),icon5.getIconHeight());

            jLabel1.setBounds(350,30,600,100);
            jLabel1.setFont(new Font("微软雅黑", Font.BOLD, 50));
            jLabel2.setBounds(700,500,350,100);
            jLabel2.setFont(new Font("微软雅黑", Font.BOLD, 24));
            jLabel3.setBounds(260,120,500,100);
            jLabel3.setFont(new Font("微软雅黑", Font.BOLD, 17));
            jLabel4.setBounds(260,80,150,100);
            jLabel4.setFont(new Font("微软雅黑", Font.BOLD, 15));
            jLabel5.setBounds(500,80,100,100);
            jLabel5.setFont(new Font("微软雅黑", Font.BOLD, 15));
            jLabel6.setBounds(740,80,100,100);
            jLabel6.setFont(new Font("微软雅黑", Font.BOLD, 15));


            for(int i = 0; i < seatNum; i ++) {
                int num = i / 4 + 30;
                JRadioButton Jb;
                switch(i % 4) {
                    case 0:
                        Jb = new JRadioButton(num + "A");
                        Jb.setBounds(250,300 + 50 * (int)Math.floor((i + 1) / 4),70,25);
                        buttonMap.put(num + "A",Jb);
                        break;

                    case 1:
                        Jb = new JRadioButton(num + "B");
                        Jb.setBounds(350,300 + 50 * (int)Math.floor((i + 1) / 4),70,25);
                        buttonMap.put(num + "B",Jb);
                        break;

                    case 2:
                        Jb = new JRadioButton(num + "C");
                        Jb.setBounds(650,300 + 50 * (int)Math.floor((i + 1) / 4),70,25);
                        buttonMap.put(num + "C",Jb);
                        break;

                    case 3:
                        Jb = new JRadioButton(num + "D");
                        Jb.setBounds(750,300 + 50 * ((int)Math.floor((i + 1) / 4) - 1),70,25);
                        buttonMap.put(num + "D",Jb);
                        break;
                }
            }

            for(int i = 0; i < 4; i ++) {
                int num = i / 2 + 36;
                JRadioButton Jb;
                switch(i % 2) {
                    case 0:
                        Jb = new JRadioButton(num + "A");
                        Jb.setBounds(300,200 + 50 * (int)Math.floor((i + 1) / 2),70,25);
                        fbuttonMap.put(num + "A",Jb);
                        break;

                    case 1:
                        Jb = new JRadioButton(num + "B");
                        Jb.setBounds(700,200 + 50 * ((int)Math.floor((i + 1) / 2) - 1),70,25);
                        fbuttonMap.put(num + "B",Jb);
                        break;
                }
            }

            List<String> listSeat = ReadTXT.querySeat(ReadTXT.ticket);

            for (String i : listSeat){
                if (buttonMap.containsKey(i)){
                    JRadioButton Jb = buttonMap.get(i);
                    Jb.setIcon(icon7);
                    Jb.setSelected(false);
                    container.add(Jb);
                    buttonMap.remove(i);
                }
                else if (fbuttonMap.containsKey(i)){
                    JRadioButton Jb = fbuttonMap.get(i);
                    Jb.setIcon(icon7);
                    Jb.setSelected(false);
                    container.add(Jb);
                    fbuttonMap.remove(i);
                }
            }

            for (Map.Entry<String,JRadioButton> map : buttonMap.entrySet()) {
                JRadioButton Jb = map.getValue();
                Jb.setIcon(icon);
                container.add(Jb);
            }

            for (Map.Entry<String,JRadioButton> map : fbuttonMap.entrySet()) {
                JRadioButton Jb = map.getValue();
                Jb.setIcon(icon);
                container.add(Jb);
            }

            for (Map.Entry<String,JRadioButton> map : buttonMap.entrySet()) {
                JRadioButton Jb = map.getValue();
                Jb.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jLabel2.setText("You should pay extra : $0");
                        for (Map.Entry<String,JRadioButton> m : fbuttonMap.entrySet()) {
                            m.getValue().setIcon(icon);
                            jButton2.setVisible(false);
                        }
                        for (Map.Entry<String,JRadioButton> m : buttonMap.entrySet()) {
                            m.getValue().setIcon(icon);
                            jButton2.setVisible(false);
                        }
                        if(Jb.isSelected()){
                            Jb.setIcon(icon2);
                            ReadTXT.temBook.setSeat(Jb.getText());
                            ReadTXT.temBook.setSeatPrice(0);
                            jButton2.setVisible(true);
                            jLabel2.setText("You should pay extra : $0");
                        }
                    }
                });
            }

            for (Map.Entry<String,JRadioButton> map : fbuttonMap.entrySet()) {
                JRadioButton Jb = map.getValue();
                Jb.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jLabel2.setText("You should pay extra : $0");
                        for (Map.Entry<String,JRadioButton> m : fbuttonMap.entrySet()) {
                            m.getValue().setIcon(icon);
                            jButton2.setVisible(false);
                        }
                        for (Map.Entry<String,JRadioButton> m : buttonMap.entrySet()) {
                            m.getValue().setIcon(icon);
                            jButton2.setVisible(false);
                        }
                        if(Jb.isSelected()){
                            Jb.setIcon(icon2);
                            ReadTXT.temBook.setSeat(Jb.getText());
                            jButton2.setVisible(true);
                            ReadTXT.temBook.setSeatPrice(300);
                            jLabel2.setText("You should pay extra : $300");
                        }
                    }
                });
            }


            jButton1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    AirportSystem.toPage(2);
                    AirportSystem.refreshPage();
                }
            });

            jButton2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    AirportSystem.toPage(5);
                }
            });
//            jButton2.setVisible(false);
            this.setSize(1200,800);
            this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            this.setLocationRelativeTo(null);
            this.setResizable(false);
            this.add(label1);
            this.add(label2);
            this.add(label3);
            this.add(jButton1);
            this.add(jButton2);
            this.add(jLabel1);
            this.add(jLabel2);
            this.add(jLabel3);
            this.add(jLabel4);
            this.add(jLabel5);
            this.add(jLabel6);
        }
        public static void main(String[] args){
            new windows4();
        }
    }


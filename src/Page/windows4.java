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
import java.util.List;

public class windows4 extends JFrame{
    ButtonGroup group = new ButtonGroup();
    private ArrayList<JRadioButton> button = new ArrayList<JRadioButton>();
        public windows4(){
            //this.setVisible(true);
            this.setSize(1200,800);
            this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            this.setLocationRelativeTo(null);
            this.setResizable(false);

            ReadTXT.temBook = new TemBook();

            Container container = this.getContentPane();
            container.setLayout(null);
            URL resource2 = windows4.class.getResource("/picture/blueSeat.jpg");
            URL resource = windows4.class.getResource("/picture/seat.jpg");
            URL resource3 = windows4.class.getResource("/picture/redSeat.jpg");

            Icon icon = new ImageIcon(resource);
            Icon icon2 = new ImageIcon(resource2);
            Icon icon7 = new ImageIcon(resource3);

            JLabel jLabel1 = new JLabel("Please select your seat");
            JLabel jLabel2 = new JLabel("You should pay extra: $300");
            JLabel jLabel3 = new JLabel("Tips:28~30 is the first class    31~33 is the second class");
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


            List<String> listSeat = ReadTXT.querySeat(ReadTXT.ticket);
            System.out.println(listSeat);


            for(int i = 0; i < 24; i ++) {
                switch(i % 4) {
                    case 0:
                        button.add(new JRadioButton((31 + i) + "A"));
                        button.get(i).setBounds(250,200 + 50 * (int)Math.floor((i + 1) / 4),70,25);
                        break;

                    case 1:
                        button.add(new JRadioButton((31 + i) + "B"));
                        button.get(i).setBounds(350,200 + 50 * (int)Math.floor((i + 1) / 4),70,25);
                        break;

                    case 2:
                        button.add(new JRadioButton((31 + i) + "C"));
                        button.get(i).setBounds(650,200 + 50 * (int)Math.floor((i + 1) / 4),70,25);
                        break;

                    case 3:
                        button.add(new JRadioButton((31 + i) + "D"));
                        button.get(i).setBounds(750,200 + 50 * ((int)Math.floor((i + 1) / 4) - 1),70,25);
                        break;
                }
            }

            for (JRadioButton b: button) {
                b.setIcon(icon);
                group.add(b);
                container.add(b);
                b.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        for (JRadioButton bb: button) {
                            bb.setIcon(icon);
                        }
                        if(b.isSelected()){
                            b.setIcon(icon2);
                            ReadTXT.temBook.setSeat(b.getText());
                        }

                    }
                });
            }

//            JRadioButton radioButton1 = new JRadioButton("31A");
//            JRadioButton radioButton2 = new JRadioButton("31B");
//            JRadioButton radioButton3 = new JRadioButton("31C");
//            JRadioButton radioButton4 = new JRadioButton("31D");
//            JRadioButton radioButton5 = new JRadioButton("32A");
//            JRadioButton radioButton6 = new JRadioButton("32B");
//            JRadioButton radioButton7 = new JRadioButton("32C");
//            JRadioButton radioButton8 = new JRadioButton("32D");
//            JRadioButton radioButton9 = new JRadioButton("33A");
//            JRadioButton radioButton10 = new JRadioButton("33B");
//            JRadioButton radioButton11 = new JRadioButton("33C");
//            JRadioButton radioButton12 = new JRadioButton("33D");
//            JRadioButton radioButton13 = new JRadioButton("28A");
//            JRadioButton radioButton14 = new JRadioButton("28B");
//            JRadioButton radioButton15 = new JRadioButton("28C");
//            JRadioButton radioButton16 = new JRadioButton("28D");
//            JRadioButton radioButton17 = new JRadioButton("29A");
//            JRadioButton radioButton18 = new JRadioButton("29B");
//            JRadioButton radioButton19 = new JRadioButton("29C");
//            JRadioButton radioButton20 = new JRadioButton("29D");
//            JRadioButton radioButton21 = new JRadioButton("30A");
//            JRadioButton radioButton22 = new JRadioButton("30B");
//            JRadioButton radioButton23 = new JRadioButton("30C");
//            JRadioButton radioButton24 = new JRadioButton("30D");

//            radioButton1.setIcon(icon);
//            radioButton2.setIcon(icon);
//            radioButton3.setIcon(icon);
//            radioButton4.setIcon(icon);
//            radioButton5.setIcon(icon);
//            radioButton6.setIcon(icon);
//            radioButton7.setIcon(icon);
//            radioButton8.setIcon(icon);
//            radioButton9.setIcon(icon);
//            radioButton10.setIcon(icon);
//            radioButton11.setIcon(icon);
//            radioButton12.setIcon(icon);
//            radioButton13.setIcon(icon);
//            radioButton14.setIcon(icon);
//            radioButton15.setIcon(icon);
//            radioButton16.setIcon(icon);
//            radioButton17.setIcon(icon);
//            radioButton18.setIcon(icon);
//            radioButton19.setIcon(icon);
//            radioButton20.setIcon(icon);
//            radioButton21.setIcon(icon);
//            radioButton22.setIcon(icon);
//            radioButton23.setIcon(icon);
//            radioButton24.setIcon(icon);

//            radioButton1.setBounds(250,200,70,25);
//            radioButton2.setBounds(350,200,70,25);
//            radioButton3.setBounds(650,200,70,25);
//            radioButton4.setBounds(750,200,70,25);
//            radioButton5.setBounds(250,250,70,25);
//            radioButton6.setBounds(350,250,70,25);
//            radioButton7.setBounds(650,250,70,25);
//            radioButton8.setBounds(750,250,70,25);
//            radioButton9.setBounds(250,300,70,25);
//            radioButton10.setBounds(350,300,70,25);
//            radioButton11.setBounds(650,300,70,25);
//            radioButton12.setBounds(750,300,70,25);
//            radioButton13.setBounds(250,350,70,25);
//            radioButton14.setBounds(350,350,70,25);
//            radioButton15.setBounds(650,350,70,25);
//            radioButton16.setBounds(750,350,70,25);
//            radioButton17.setBounds(250,400,70,25);
//            radioButton18.setBounds(350,400,70,25);
//            radioButton19.setBounds(650,400,70,25);
//            radioButton20.setBounds(750,400,70,25);
//            radioButton21.setBounds(250,450,70,25);
//            radioButton22.setBounds(350,450,70,25);
//            radioButton23.setBounds(650,450,70,25);
//            radioButton24.setBounds(750,450,70,25);


//            group.add(radioButton1);
//            group.add(radioButton2);
//            group.add(radioButton3);
//            group.add(radioButton4);
//            group.add(radioButton5);
//            group.add(radioButton6);
//            group.add(radioButton7);
//            group.add(radioButton8);
//            group.add(radioButton9);
//            group.add(radioButton10);
//            group.add(radioButton11);
//            group.add(radioButton12);
//            group.add(radioButton13);
//            group.add(radioButton14);
//            group.add(radioButton15);
//            group.add(radioButton16);
//            group.add(radioButton17);
//            group.add(radioButton18);
//            group.add(radioButton19);
//            group.add(radioButton20);
//            group.add(radioButton21);
//            group.add(radioButton22);
//            group.add(radioButton23);
//            group.add(radioButton24);

//            container.add(radioButton1);
//            container.add(radioButton2);
//            container.add(radioButton3);
//            container.add(radioButton4);
//            container.add(radioButton5);
//            container.add(radioButton6);
//            container.add(radioButton7);
//            container.add(radioButton8);
//            container.add(radioButton9);
//            container.add(radioButton10);
//            container.add(radioButton11);
//            container.add(radioButton12);
//            container.add(radioButton13);
//            container.add(radioButton14);
//            container.add(radioButton15);
//            container.add(radioButton16);
//            container.add(radioButton17);
//            container.add(radioButton18);
//            container.add(radioButton19);
//            container.add(radioButton20);
//            container.add(radioButton21);
//            container.add(radioButton22);
//            container.add(radioButton23);
//            container.add(radioButton24);
//            radioButton1.addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    if(radioButton1.isSelected()){
//                        radioButton1.setIcon(icon2);
//                        radioButton2.setIcon(icon);
//                        radioButton3.setIcon(icon);
//                        radioButton4.setIcon(icon);
//                        radioButton5.setIcon(icon);
//                        radioButton6.setIcon(icon);
//                        radioButton7.setIcon(icon);
//
//                        ReadTXT.temBook.setSeat(radioButton1.getText());
//                    }
//
//                }
//            });
//            radioButton2.addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    if(radioButton2.isSelected()){
//                        radioButton2.setIcon(icon2);
//                        radioButton1.setIcon(icon);
//                        radioButton3.setIcon(icon);
//                        radioButton4.setIcon(icon);
//                        radioButton5.setIcon(icon);
//                        radioButton6.setIcon(icon);
//                        radioButton7.setIcon(icon);
//
//                        ReadTXT.temBook.setSeat(radioButton2.getText());
//                    }
//
//                }
//            });
//            radioButton3.addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    if(radioButton3.isSelected()){
//                        radioButton3.setIcon(icon2);
//                        radioButton2.setIcon(icon);
//                        radioButton1.setIcon(icon);
//                        radioButton4.setIcon(icon);
//                        radioButton5.setIcon(icon);
//                        radioButton6.setIcon(icon);
//                        radioButton7.setIcon(icon);
//
//                        ReadTXT.temBook.setSeat(radioButton3.getText());
//                    }
//
//                }
//            });
//            radioButton4.addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    if(radioButton4.isSelected()){
//                        radioButton4.setIcon(icon2);
//                        radioButton2.setIcon(icon);
//                        radioButton3.setIcon(icon);
//                        radioButton1.setIcon(icon);
//                        radioButton5.setIcon(icon);
//                        radioButton6.setIcon(icon);
//                        radioButton7.setIcon(icon);
//
//                        ReadTXT.temBook.setSeat(radioButton4.getText());
//                    }
//
//                }
//            });
//            radioButton5.addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    if(radioButton5.isSelected()){
//                        radioButton5.setIcon(icon2);
//                        radioButton2.setIcon(icon);
//                        radioButton3.setIcon(icon);
//                        radioButton4.setIcon(icon);
//                        radioButton1.setIcon(icon);
//                        radioButton6.setIcon(icon);
//                        radioButton7.setIcon(icon);
//
//                        ReadTXT.temBook.setSeat(radioButton5.getText());
//                    }
//
//                }
//            });
//            radioButton6.addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    if(radioButton6.isSelected()){
//                        radioButton6.setIcon(icon2);
//                        radioButton2.setIcon(icon);
//                        radioButton3.setIcon(icon);
//                        radioButton4.setIcon(icon);
//                        radioButton5.setIcon(icon);
//                        radioButton1.setIcon(icon);
//                        radioButton7.setIcon(icon);
//
//                        ReadTXT.temBook.setSeat(radioButton6.getText());
//                    }
//
//                }
//            });
//            radioButton7.addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    if(radioButton7.isSelected()){
//                        radioButton7.setIcon(icon2);
//                        radioButton2.setIcon(icon);
//                        radioButton3.setIcon(icon);
//                        radioButton4.setIcon(icon);
//                        radioButton5.setIcon(icon);
//                        radioButton6.setIcon(icon);
//                        radioButton1.setIcon(icon);
//                    }
//
//                }
//            });

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
        }
        public static void main(String[] args){
            new windows4();
        }
    }


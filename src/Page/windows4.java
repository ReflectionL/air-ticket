package Page;

import data.ReadTXT;
import data.TemBook;
import logic.AirportSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class windows4 extends JFrame{
        public windows4(){
            //this.setVisible(true);
            this.setSize(1200,800);
            this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            this.setLocationRelativeTo(null);
            //this.setResizable(false);

            ReadTXT.temBook = new TemBook();

            Container container = this.getContentPane();
            container.setLayout(null);
            URL resource2 = windows4.class.getResource("/picture/blueSeat.jpg");
            URL resource = windows4.class.getResource("/picture/seat.jpg");
            Icon icon = new ImageIcon(resource);
            Icon icon2 = new ImageIcon(resource2);
            JLabel jLabel1 = new JLabel("Please choose your seat");
            JLabel jLabel2 = new JLabel("-------Airplane economy class-------");
            JLabel jLabel3 = new JLabel("31");
            JLabel jLabel4 = new JLabel("32");
            JLabel jLabel5 = new JLabel("33");
            JLabel jLabel6 = new JLabel("An additional ￥300 is required");
            JButton jButton1 = new JButton("Return");
            JButton jButton2 = new JButton("Confirm");
            jButton1.setBounds(600,600,160,60);
            jButton2.setBounds(380,600,160,60);
            jButton1.setFont(new Font("微软雅黑", Font.BOLD, 25));
            jButton2.setFont(new Font("微软雅黑", Font.BOLD, 25));

            this.add(jButton1);
            this.add(jButton2);

            jLabel1.setBounds(340,-40,1000,200);
            jLabel1.setFont(new Font("微软雅黑", Font.BOLD, 35));
            jLabel2.setBounds(330,20,1000,200);
            jLabel2.setFont(new Font("微软雅黑", Font.BOLD, 25));
            jLabel3.setBounds(540,70,1000,200);
            jLabel3.setFont(new Font("微软雅黑", Font.BOLD, 25));
            jLabel4.setBounds(540,220,1000,200);
            jLabel4.setFont(new Font("微软雅黑", Font.BOLD, 25));
            jLabel5.setBounds(540,370,1000,200);
            jLabel5.setFont(new Font("微软雅黑", Font.BOLD, 25));
            jLabel6.setBounds(700,460,1000,200);
            jLabel6.setFont(new Font("微软雅黑", Font.BOLD, 25));

            this.add(jLabel1);
            this.add(jLabel2);
            this.add(jLabel3);
            this.add(jLabel4);
            this.add(jLabel5);
            this.add(jLabel6);
            JRadioButton radioButton1 = new JRadioButton("31A");
            JRadioButton radioButton2 = new JRadioButton("31B");
            JRadioButton radioButton3 = new JRadioButton("32A");
            JRadioButton radioButton4 = new JRadioButton("32B");
            JRadioButton radioButton5 = new JRadioButton("33A");
            JRadioButton radioButton6 = new JRadioButton("33B");
            JRadioButton radioButton7 = new JRadioButton("座位7");


            radioButton1.setIcon(icon);
            radioButton2.setIcon(icon);
            radioButton3.setIcon(icon);
            radioButton4.setIcon(icon);
            radioButton5.setIcon(icon);
            radioButton6.setIcon(icon);
            radioButton7.setIcon(icon);


            radioButton1.setBounds(200,150,200,50);
            radioButton2.setBounds(800,150,200,50);
            radioButton3.setBounds(200,300,200,50);
            radioButton4.setBounds(800,300,200,50);
            radioButton5.setBounds(200,450,200,50);
            radioButton6.setBounds(800,450,200,50);
            radioButton7.setBounds(200,450,200,50);


            ButtonGroup group = new ButtonGroup();
            group.add(radioButton1);
            group.add(radioButton2);
            group.add(radioButton3);
            group.add(radioButton4);
            group.add(radioButton5);
            group.add(radioButton6);
            group.add(radioButton7);


            container.add(radioButton1);
            container.add(radioButton2);
            container.add(radioButton3);
            container.add(radioButton4);
            container.add(radioButton5);
            container.add(radioButton6);
            container.add(radioButton7);
            radioButton1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(radioButton1.isSelected()){
                        radioButton1.setIcon(icon2);
                        radioButton2.setIcon(icon);
                        radioButton3.setIcon(icon);
                        radioButton4.setIcon(icon);
                        radioButton5.setIcon(icon);
                        radioButton6.setIcon(icon);
                        radioButton7.setIcon(icon);

                        ReadTXT.temBook.setSeat(radioButton1.getText());
                    }

                }
            });
            radioButton2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(radioButton2.isSelected()){
                        radioButton2.setIcon(icon2);
                        radioButton1.setIcon(icon);
                        radioButton3.setIcon(icon);
                        radioButton4.setIcon(icon);
                        radioButton5.setIcon(icon);
                        radioButton6.setIcon(icon);
                        radioButton7.setIcon(icon);

                        ReadTXT.temBook.setSeat(radioButton2.getText());
                    }

                }
            });
            radioButton3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(radioButton3.isSelected()){
                        radioButton3.setIcon(icon2);
                        radioButton2.setIcon(icon);
                        radioButton1.setIcon(icon);
                        radioButton4.setIcon(icon);
                        radioButton5.setIcon(icon);
                        radioButton6.setIcon(icon);
                        radioButton7.setIcon(icon);

                        ReadTXT.temBook.setSeat(radioButton3.getText());
                    }

                }
            });
            radioButton4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(radioButton4.isSelected()){
                        radioButton4.setIcon(icon2);
                        radioButton2.setIcon(icon);
                        radioButton3.setIcon(icon);
                        radioButton1.setIcon(icon);
                        radioButton5.setIcon(icon);
                        radioButton6.setIcon(icon);
                        radioButton7.setIcon(icon);

                        ReadTXT.temBook.setSeat(radioButton4.getText());
                    }

                }
            });
            radioButton5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(radioButton5.isSelected()){
                        radioButton5.setIcon(icon2);
                        radioButton2.setIcon(icon);
                        radioButton3.setIcon(icon);
                        radioButton4.setIcon(icon);
                        radioButton1.setIcon(icon);
                        radioButton6.setIcon(icon);
                        radioButton7.setIcon(icon);

                        ReadTXT.temBook.setSeat(radioButton5.getText());
                    }

                }
            });
            radioButton6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(radioButton6.isSelected()){
                        radioButton6.setIcon(icon2);
                        radioButton2.setIcon(icon);
                        radioButton3.setIcon(icon);
                        radioButton4.setIcon(icon);
                        radioButton5.setIcon(icon);
                        radioButton1.setIcon(icon);
                        radioButton7.setIcon(icon);

                        ReadTXT.temBook.setSeat(radioButton6.getText());
                    }

                }
            });
            radioButton7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(radioButton7.isSelected()){
                        radioButton7.setIcon(icon2);
                        radioButton2.setIcon(icon);
                        radioButton3.setIcon(icon);
                        radioButton4.setIcon(icon);
                        radioButton5.setIcon(icon);
                        radioButton6.setIcon(icon);
                        radioButton1.setIcon(icon);
                    }

                }
            });

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


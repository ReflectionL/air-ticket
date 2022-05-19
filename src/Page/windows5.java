package Page;

import data.interfence.ReadTXT;
import logic.AirportSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class windows5 extends JFrame {
    public static void main(String[] args){
        new windows5();
    }

    public windows5() {
        ReadTXT.getAllprice();
        Container container1 = this.getContentPane();
        container1.setLayout(null);

        URL resource = windows1.class.getResource("/picture/mealA.jpg");
        Icon icon = new ImageIcon(resource);
        URL resource1 = windows1.class.getResource("/picture/mealB.jpg");
        Icon icon1 = new ImageIcon(resource1);
        URL resource2 = windows1.class.getResource("/picture/insurance.png");
        Icon icon2 = new ImageIcon(resource2);


        JLabel jLabel1 = new JLabel("Other service");
        jLabel1.setBounds(400,10,500,100);
        jLabel1.setFont(new Font("微软雅黑", Font.BOLD, 50));
        JButton jButton11 = new JButton(icon);
        JButton jButton12= new JButton(icon1);
        jButton11.setBounds(300,130,200,200);
        jButton12.setBounds(700,130,200,200);


        JLabel jLabel3 = new JLabel("---MEAL---------------------------------------------------------------------------------------------------------------------");
        jLabel3.setBounds(0,100,8000,25);
        jLabel3.setFont(new Font("微软雅黑", Font.BOLD, 25));
        JLabel jLabel5 = new JLabel("---Insurance---------------------------------------------------------------------------------------------------------------------");
        jLabel5.setBounds(0,370,8000,25);
        jLabel5.setFont(new Font("微软雅黑", Font.BOLD, 25));
        JLabel jLabel6 = new JLabel("---------------------------------------------------------------------------------------------------------------------------");
        jLabel6.setBounds(0,600,8000,25);
        jLabel6.setFont(new Font("微软雅黑", Font.BOLD, 25));


        JButton jButton1 = new JButton(icon2);
        jButton1.setBounds(500,420,200,133);

        JLabel jLabel7 = new JLabel("Price： $"+ ReadTXT.temBook.sumPrice());
        jLabel7.setBounds(10,640,400,25);
        jLabel7.setFont(new Font("微软雅黑", Font.BOLD, 25));

        JButton jButton4 = new JButton("Detail");
        JButton jButton5 = new JButton("Reserve");
        JButton jButton6 = new JButton("Back");

        jButton4.setBounds(200,640,120,25);
        jButton4.setMargin(new Insets(0,0,0,0));
        jButton5.setBounds(750,710,120,40);
        jButton5.setBackground(new Color(255, 140, 0));
        jButton6.setBounds(930,710,120,40);
        jButton6.setBackground(new Color(30, 144, 255));
        jButton4.setFont(new Font("微软雅黑", Font.BOLD, 20));
        jButton6.setFont(new Font("微软雅黑", Font.BOLD, 20));
        jButton5.setFont(new Font("微软雅黑", Font.BOLD, 20));

        JRadioButton radioButton1 = new JRadioButton();
        JRadioButton radioButton5 = new JRadioButton();
        JRadioButton radioButton6 = new JRadioButton();
        JButton jButton = new JButton("clear");
        jButton.setFont(new Font("微软雅黑", Font.BOLD, 20));
        jButton.setBounds(900,350,120,25);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton5);
        buttonGroup.add(radioButton6);
        radioButton1.setBounds(600,570,70,25);
        radioButton5.setBounds(390,350,70,25);
        radioButton6.setBounds(790,350,70,25);

        container1.add(jLabel1);
        container1.add(jLabel3);
        container1.add(jButton11);
        container1.add(jButton12);
        container1.add(jLabel5);
        container1.add(jButton1);
        container1.add(jButton4);
        container1.add(jButton5);
        container1.add(jButton6);
        container1.add(jLabel6);
        container1.add(jLabel7);
        container1.add(radioButton1);
        container1.add(radioButton5);
        container1.add(radioButton6);
        container1.add(jButton);
        radioButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(radioButton1.isSelected()){
                    ReadTXT.temBook.setInsurancePrice(ReadTXT.price.getInsuranceA());
                    ReadTXT.temBook.setInsurance(1);
                    jLabel7.setText("Price： $"+ ReadTXT.temBook.sumPrice());
                }
                else {
                    ReadTXT.temBook.setInsurancePrice(0);
                    ReadTXT.temBook.setInsurance(0);
                    jLabel7.setText("Price： $"+ ReadTXT.temBook.sumPrice());
                }
            }
        });
        radioButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReadTXT.temBook.setFoodPrice(ReadTXT.price.getMealA());
                ReadTXT.temBook.setFood("B");
                jLabel7.setText("Price： $"+ ReadTXT.temBook.sumPrice());
            }
        });
        radioButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReadTXT.temBook.setFoodPrice(ReadTXT.price.getMealB());
                ReadTXT.temBook.setFood("C");
                jLabel7.setText("Price： $"+ ReadTXT.temBook.sumPrice());
            }
        });
        jButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonGroup.clearSelection();
                ReadTXT.temBook.setFoodPrice(0);
                ReadTXT.temBook.setFood("A");
                jLabel7.setText("Price： $"+ ReadTXT.temBook.sumPrice());
            }
        });
        jButton11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hamburger *1\nchicken rice cube *1\negg tart *1\nCoke *1\n                        $20");
//                new popwindow();
            }
        });
        jButton12.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hamburger *2\nchicken rice cube *1\nSnacks platter *1\nCoke *2\n                        $30");
//                new popwindow();
            }
        });
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Travel Insurance");
//                new popwindow();
            }
        });
        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AirportSystem.refreshPrice();
                AirportSystem.toPage(6);
            }
        });
        jButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AirportSystem.toPage(7);
            }
        });
        jButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AirportSystem.toPage(4);
            }
        });
//        this.setVisible(true);
        this.setSize(1200, 800);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    class popwindow extends JFrame{
        public popwindow(){
            this.setVisible(true);
            this.setBounds(100,100,500,500);
            Container container = this.getContentPane();
            container.setLayout(null);

            container.add(new Label("lalallallla"));
        }
    }
}
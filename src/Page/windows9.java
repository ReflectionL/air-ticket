package Page;

import data.interfence.ReadTXT;
import logic.AirportSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class windows9 extends JFrame {
    private boolean check = false;
    public static void main(String[] args) {
        new windows9();
    }

    public windows9() {
        Container container1 = this.getContentPane();
        container1.setLayout(null);


        JLabel jLabel1 = new JLabel("Credit card number :");
        jLabel1.setBounds(250,110,250,100);
        jLabel1.setFont(new Font("微软雅黑", Font.BOLD, 20));

        JLabel jLabel2 = new JLabel("Password:");
        jLabel2.setBounds(355,185,200,100);
        jLabel2.setFont(new Font("微软雅黑", Font.BOLD, 20));

        JLabel jLabel3 = new JLabel("Credit card pay");
        jLabel3.setBounds(400,-40,800,200);
        jLabel3.setFont(new Font("微软雅黑", Font.BOLD, 50));

        JTextField jTextField1 = new JTextField();
        jTextField1.setBounds(500,150,350,30);
        jTextField1.setFont(new Font("微软雅黑", Font.BOLD, 20));
        JPasswordField jTextField2 = new JPasswordField();
        jTextField2.setBounds(500,225,350,30);
        jTextField2.setFont(new Font("微软雅黑", Font.BOLD, 20));

        JButton jButton1 = new JButton("Back");
        jButton1.setBounds(300,500,250,70);
        jButton1.setFont(new Font("微软雅黑", Font.BOLD, 25));

        JButton jButton2 = new JButton("Pay");
        jButton2.setBounds(650,500,250,70);
        jButton2.setFont(new Font("微软雅黑", Font.BOLD, 25));

//        this.setVisible(true);
        this.setSize(1200, 800);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.add(jLabel3);
        this.add(jLabel1);
        this.add(jLabel2);
        this.add(jTextField1);
        this.add(jTextField2);
        this.add(jButton1);
        this.add(jButton2);

        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AirportSystem.toPage(7);
            }
        });
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id = jTextField1.getText();
                String passward = String.valueOf(jTextField2.getPassword());
                ReadTXT.querybank();
                for (int i=0;i<ReadTXT.listbank.size();i++){
                    if (ReadTXT.listbank.get(i).getBankid().equals(id) && (ReadTXT.listbank.get(i).getPassword().equals(passward))){
                        check = true;
                        ReadTXT.ticket.setSeat(ReadTXT.temBook.getSeat());
                        ReadTXT.ticket.setFood(ReadTXT.temBook.getFood());
                        ReadTXT.ticket.setInsurance(ReadTXT.temBook.getInsurance());
                        if(ReadTXT.ticket.getSeatrank() == 1 && ReadTXT.temBook.getSeatrank() == 0)
                            ReadTXT.ticket.setSeatrank(ReadTXT.temBook.getSeatrank());
                        //ReadTXT.writeFile(ReadTXT.ticket);
                        AirportSystem.refreshPage();
                        AirportSystem.toPage(15);
                        break;
                    }
                }
                if(!check){
                    JOptionPane.showMessageDialog(null, "ID and passward don't match.", "Waring", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
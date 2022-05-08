package Page;

import data.interfence.ReadTXT;
import logic.AirportSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class windows7 extends JFrame implements Runnable, ActionListener {
    private int hour;
    private int minute;
    private int second;
    private JLabel timeLabel;
    public static void main(String[] args) {
        new Thread(new windows7()).start();
    }

    public windows7(){
        int hour = 0;
        int minute = 0;
        int second = 30;

        this.setTime(hour, minute, second);
        this.setLayout(null);
        timeLabel = new JLabel();
        timeLabel.setFont(new Font(Font.SERIF, Font.BOLD, 20));
        timeLabel.setBounds(130,20,500,100);
        timeLabel.setFont(new Font("微软雅黑", Font.BOLD, 15));
//        this.setVisible(true);
        this.setSize(1200,800);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        Container container1 = this.getContentPane();
        this.setResizable(false);
        container1.setLayout(null);
        JLabel jLabel1 = new JLabel("The order");
        jLabel1.setBounds(500,20,500,100);
        jLabel1.setFont(new Font("微软雅黑", Font.BOLD, 50));

        JLabel jLabel2 = new JLabel("Remaining time of payment");
        timeLabel.setBounds(465,90,500,100);
        timeLabel.setFont(new Font("微软雅黑", Font.BOLD, 17));

        JLabel jLabel3 = new JLabel("$"+ ReadTXT.temBook.sumPrice());
        jLabel3.setBounds(580,60,500,100);
        jLabel3.setFont(new Font("微软雅黑", Font.BOLD, 20));

        JButton jButton2 = new JButton("Pay");
        jButton2.setBounds(420,680,120,40);
        JButton jButton3 = new JButton("Back");
        jButton3.setBounds(720,680,120,40);
        jButton2.setFont(new Font("微软雅黑", Font.BOLD, 25));
        jButton3.setFont(new Font("微软雅黑", Font.BOLD, 25));



        JPanel jPanel1 = new JPanel();
        jPanel1.setBounds(330,300,560,300);
        jPanel1.setLayout(null);
        jPanel1.setBorder(BorderFactory.createRaisedBevelBorder());

        JLabel jLabel4 = new JLabel("Wechat pay");
        jLabel4.setBounds(50,40,500,100);
        jLabel4.setFont(new Font("微软雅黑", Font.BOLD, 25));

        JLabel jLabel5 = new JLabel("Credit card pay");
        jLabel5.setBounds(50,105,500,100);
        jLabel5.setFont(new Font("微软雅黑", Font.BOLD, 25));

        JRadioButton jCheckBox1 = new JRadioButton();
        jCheckBox1.setBounds(400,40,500,100);

        JRadioButton jCheckBox2 = new JRadioButton();
        jCheckBox2.setBounds(400,105,500,100);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(jCheckBox1);
        buttonGroup.add(jCheckBox2);
        jPanel1.add(jLabel4);
        jPanel1.add(jLabel5);
        jPanel1.add(jCheckBox1);
        jPanel1.add(jCheckBox2);
        this.add(jPanel1);
        this.add(jLabel1);
        this.add(timeLabel);
        this.add(jLabel3);
        this.add(jButton2);
        this.add(jButton3);

        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(jCheckBox1.isSelected()) {
                    AirportSystem.toPage(8);
                }
                else if(jCheckBox2.isSelected()) {
                    AirportSystem.toPage(9);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Please select a method of payment.", "Warning", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AirportSystem.toPage(5);
            }
        });
    }
    private void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    private void setText() {
        this.timeLabel.setText("Remaining time of payment"+"("+(this.hour<10?"0"+this.hour:this.hour)
                +":"+(this.minute<10?"0"+this.minute:this.minute)
                +":"+(this.second<10?"0"+this.second:this.second)+")");
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        ((JButton)event.getSource()).setEnabled(false);

    }



    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.second--;
            if (this.second<0) {
                this.minute--;
                this.second=59;
            }
            if (this.minute<0) {
                this.hour--;
                this.minute=59;
            }
            if (this.hour<0) {
                this.dispose();
                break;
            }
            this.setText();
        }

    }
}

package Page;

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

        //this.setVisible(true);
        this.setTime(hour, minute, second);
        this.setLayout(null);
        this.setSize(1200,800);
        timeLabel = new JLabel();
        timeLabel.setFont(new Font(Font.SERIF, Font.BOLD, 25));
        timeLabel.setBounds(260,40,1000,200);
        timeLabel.setFont(new Font("微软雅黑", Font.BOLD, 25));

        this.setSize(1200, 800);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        Container container1 = this.getContentPane();
        this.setResizable(false);
        container1.setLayout(null);
        JLabel jLabel1 = new JLabel("Payment order");
        jLabel1.setBounds(480,-60,1000,200);
        jLabel1.setFont(new Font("微软雅黑", Font.BOLD, 30));

        JLabel jLabel2 = new JLabel("Remaining time of payment");
        timeLabel.setBounds(350,0,1000,200);
        timeLabel.setFont(new Font("微软雅黑", Font.BOLD, 20));

        JLabel jLabel3 = new JLabel("￥22.22");
        jLabel3.setBounds(580,40,1000,200);
        jLabel3.setFont(new Font("微软雅黑", Font.BOLD, 20));

        JButton jButton1 = new JButton("The order details");
        jButton1.setBounds(450,160,300,40);
        JButton jButton2 = new JButton("Payment");
        jButton2.setBounds(360,680,200,40);
        JButton jButton3 = new JButton("Return");
        jButton3.setBounds(600,680,200,40);
        jButton1.setFont(new Font("微软雅黑", Font.BOLD, 20));
        jButton2.setFont(new Font("微软雅黑", Font.BOLD, 20));
        jButton3.setFont(new Font("微软雅黑", Font.BOLD, 20));


        JPanel jPanel1 = new JPanel();
        jPanel1.setBounds(200,240,780,400);
        jPanel1.setLayout(null);
        jPanel1.setBorder(BorderFactory.createRaisedBevelBorder());

        JLabel jLabel4 = new JLabel("WeChat payment");
        jLabel4.setBounds(80,20,1000,200);
        jLabel4.setFont(new Font("微软雅黑", Font.BOLD, 30));

        JLabel jLabel5 = new JLabel("Credit card payment");
        jLabel5.setBounds(80,130,1000,200);
        jLabel5.setFont(new Font("微软雅黑", Font.BOLD, 30));

        JRadioButton jCheckBox1 = new JRadioButton();
        jCheckBox1.setBounds(600,20,1000,200);

        JRadioButton jCheckBox2 = new JRadioButton();
        jCheckBox2.setBounds(600,130,1000,200);

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
        this.add(jButton1);
        this.add(jButton2);
        this.add(jButton3);

        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AirportSystem.toPage(6);
            }
        });
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(jCheckBox1.isSelected()) {
                    AirportSystem.toPage(8);
                }
                if(jCheckBox2.isSelected()) {
                    AirportSystem.toPage(9);
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
        this.timeLabel.setText("支付剩余时间"+"("+(this.hour<10?"0"+this.hour:this.hour)
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

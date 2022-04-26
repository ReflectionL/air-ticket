package Page;

import logic.AirportSystem;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class windows10 extends JFrame implements Runnable, ActionListener{
    private int hour;
    private int minute;
    private int second;
    private JLabel timeLabel;



    public windows10() {
        int hour = 0;
        int minute = 0;
        int second = 30;

        this.setTime(hour, minute, second);
        this.setLayout(null);
        this.setSize(1200,800);
        timeLabel = new JLabel();
        timeLabel.setFont(new Font(Font.SERIF, Font.BOLD, 40));
        JPanel jPanel1 = new JPanel();
        jPanel1.setBounds(200,160,800,300);
        jPanel1.setLayout(null);
        jPanel1.setBorder(BorderFactory.createLoweredBevelBorder());

        JButton jButton1 = new JButton("Print");
        jButton1.setBounds(510,500,160,60);
        jButton1.setFont(new Font(Font.SERIF, Font.BOLD, 30));

        timeLabel.setBounds(260,40,1000,200);
        timeLabel.setFont(new Font("微软雅黑", Font.BOLD, 30));
        this.setText();
        this.add(jPanel1);
        this.add(jButton1);
        jPanel1.add(timeLabel);


//        this.pack();
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit tool = Toolkit.getDefaultToolkit();
        double width = tool.getScreenSize().getWidth();
        double height = tool.getScreenSize().getHeight();
        this.setLocation((int)((width-this.getWidth())/2)
                ,(int)((height-this.getHeight())/2));
//        this.setVisible(true);

        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AirportSystem.toPage(12);
            }
        });
    }

    private void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    private void setText() {
        this.timeLabel.setText("Successful"+"("+(this.hour<10?"0"+this.hour:this.hour)
                +":"+(this.minute<10?"0"+this.minute:this.minute)
                +":"+(this.second<10?"0"+this.second:this.second)+")");
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        ((JButton)event.getSource()).setEnabled(false);

    }

    public static void main(String[] args) {
        new Thread(new windows10()).start();
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
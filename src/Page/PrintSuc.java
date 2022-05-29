package Page;

import logic.AirportSystem;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
/**
 * This class creates an interface to remind user they have printed the tickets successfully
 * @author Zhaoyu Wang
 * @version 1.0
 */
public class PrintSuc extends JFrame implements ActionListener{
    private JLabel timeLabel;

    public PrintSuc() {
        this.setLayout(null);
        this.setSize(1200,800);
        timeLabel = new JLabel();
        timeLabel.setFont(new Font(Font.SERIF, Font.BOLD, 40));
        JPanel jPanel1 = new JPanel();
        jPanel1.setBounds(200,160,800,300);
        jPanel1.setLayout(null);
        jPanel1.setBorder(BorderFactory.createLoweredBevelBorder());

        JButton jButton1 = new JButton("Check in");
        jButton1.setBounds(510,500,160,60);
        jButton1.setFont(new Font(Font.SERIF, Font.BOLD, 30));

        timeLabel.setBounds(260,40,1000,200);
        timeLabel.setFont(new Font("微软雅黑", Font.BOLD, 30));
        this.setText();
        this.add(jPanel1);
        this.add(jButton1);
        jPanel1.add(timeLabel);

        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit tool = Toolkit.getDefaultToolkit();
        double width = tool.getScreenSize().getWidth();
        double height = tool.getScreenSize().getHeight();
        this.setLocation((int)((width-this.getWidth())/2)
                ,(int)((height-this.getHeight())/2));
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AirportSystem.toPage(14);
            }
        });
    }

    private void setText() {
        this.timeLabel.setText("Successful");
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        ((JButton)event.getSource()).setEnabled(false);

    }

    public static void main(String[] args) {
        new PrintSuc();
    }

}  
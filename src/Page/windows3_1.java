package Page;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class windows3_1 extends JFrame {

    private JPanel contentPane;
    CardLayout cardLayout=new CardLayout();

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    windows3_1 frame = new windows3_1();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public windows3_1() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1200, 800);
        this.setLocationRelativeTo(null);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1200, 800);
        contentPane.add(panel);
//		给主要显示面板添加布局方式
        panel.setLayout(cardLayout);
//		创建相应面板类的对象
        windows3_2 p1=new windows3_2();
//		将面板添加到住面板中，注意:add()方法里有两个参数，第一个是要添加的对象，第二个给这个对象所放置的卡片
//		起个名字，后面调用显示的时候要用到这个名字
        panel.add(p1,"p1");
        windows3_3 p2=new windows3_3();
        panel.add(p2,"p2");


        JButton btnNewButton = new JButton("Booking inquire");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//				这里是点击按钮切换不同的页面
//				cardLayout.show(参数 1，参数2)方法里面也有两个参数，
//				参数1是表示指明你要在哪个容器上显示，
//				参数2是指明要显示哪个卡片，即你要给出对应卡片的名字
                cardLayout.show(panel, "p1");
            }
        });
        btnNewButton.setBounds(120, 360, 250, 46);
        btnNewButton.setFont(new Font("微软雅黑", Font.BOLD, 25));
        contentPane.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("ID inquire");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//				同上
                cardLayout.show(panel, "p2");
            }
        });
        btnNewButton_1.setBounds(400, 360, 196, 46);
        btnNewButton_1.setFont(new Font("微软雅黑", Font.BOLD, 25));
        contentPane.add(btnNewButton_1);
    }
}
package Page;

import logic.AirportSystem;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class windows13 extends JFrame{
    public static void main(String[] args){
        new windows13();
    }
    private JPanel contentPane;

    public windows13() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 300);
        contentPane = new JPanel();
        this.setLocationRelativeTo(null);
        this.setSize(600, 400);
        this.setResizable(false);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        this.setVisible(true);
        JLabel jLabel1 = new JLabel("机票信息");
        jLabel1.setBounds(200,-20,400,100);
        jLabel1.setFont(new Font("微软雅黑", Font.BOLD, 25));
        this.add(jLabel1);

        JLabel jLabel2 = new JLabel("打印");
        jLabel2.setBounds(390,57,100,100);
        jLabel2.setFont(new Font("微软雅黑", Font.BOLD, 15));
//        this.add(jLabel2);

        JCheckBox jCheckBox1 = new JCheckBox("机票");
        JCheckBox jCheckBox2 = new JCheckBox("行李票");
        jCheckBox1.setBounds(440,100,50,20);
        jCheckBox2.setBounds(510,100,80,20);

//        this.add(jCheckBox1);
//        this.add(jCheckBox2);

        JButton jButton1 = new JButton("详细信息");
        jButton1.setBounds(450,65,100,20);
        this.add(jButton1);
        // set the header of the table
        String[] header = {"订单号", "出发地", "目的地", "时间", "登机口","座位号"};
        // set the data of the table
        Object[][] data = {{"MHH370", "马来西亚", "sea", 12.07, "T1","24C"}};

        // create a table model
        DefaultTableModel model = new DefaultTableModel(data, header);
        // create a JTable object
        JTable table = new JTable(model);
        // set the style of the table
        table.setGridColor(Color.BLACK);
        table.setEnabled(false);


        JLabel lblNewLabel3 = new JLabel("------------------------------------------------------------------------------------");
        lblNewLabel3.setBounds(0,180,5000,100);
        lblNewLabel3.setFont(new Font("微软雅黑", Font.BOLD, 20));
        add(lblNewLabel3);

        JLabel jLabel4 = new JLabel("你要打印的票据：");
        jLabel4.setBounds(20,240,150,50);
        jLabel4.setFont(new Font("微软雅黑", Font.BOLD, 15));
//        this.add(jLabel4);
        JLabel jLabel5 = new JLabel("<html>"+"机票1张"+"<br>"+"行李票据1张"+"<html>");
        jLabel5.setBounds(140,230,100,100);
        jLabel5.setFont(new Font("微软雅黑", Font.BOLD, 15));
//        this.add(jLabel5);

        JButton jButton5 = new JButton("打印");
        jButton5.setBounds(350,250,80,35);
        JButton jButton4 = new JButton("取消>");
        jButton4.setBounds(450,250,80,35);
//        this.add(jButton5);
//        this.add(jButton4);

        // must do: bind a JTable object to a JScrollPane object, otherwise the header of the table will not be displayed in the JPanel.
        JScrollPane jScrollPane = new JScrollPane();
        // key, crucial!
        jScrollPane.setViewportView(table);
        // set the position of the JScrollPane object
        jScrollPane.setBounds(20, 70, 360, 40);
        // add the JScrollPane object to JPanel
        add(jScrollPane);


        JLabel jLabel3 = new JLabel("打印");
        jLabel3.setBounds(390,127,100,100);
        jLabel3.setFont(new Font("微软雅黑", Font.BOLD, 15));
//        this.add(jLabel3);

        JCheckBox jCheckBox3 = new JCheckBox("机票");
        JCheckBox jCheckBox4 = new JCheckBox("行李票");
        jCheckBox3.setBounds(440,170,50,20);
        jCheckBox4.setBounds(510,170,80,20);

//        this.add(jCheckBox3);
//        this.add(jCheckBox4);

        JButton jButton3 = new JButton("详细信息");
        jButton3.setBounds(450,140,100,20);
        this.add(jButton3);
        // set the header of the table
        String[] header2 = {"订单号", "出发地", "目的地", "时间", "登机口","座位号"};
        // set the data of the table
        Object[][] data2 = {{"MHH370", "马来西亚", "sea", 12.07, "T1","24C"}};

        // create a table model
        DefaultTableModel model2 = new DefaultTableModel(data2, header2);
        // create a JTable object
        JTable table2 = new JTable(model2);
        // set the style of the table
        table2.setGridColor(Color.BLACK);
        table2.setEnabled(false);




        // must do: bind a JTable object to a JScrollPane object, otherwise the header of the table will not be displayed in the JPanel.
        JScrollPane jScrollPane2 = new JScrollPane();
        // key, crucial!
        jScrollPane2.setViewportView(table2);
        // set the position of the JScrollPane object
        jScrollPane2.setBounds(20, 140, 360, 40);
        // add the JScrollPane object to JPanel
        add(jScrollPane2);

        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AirportSystem.toPage(2);
            }
        });
    }

}



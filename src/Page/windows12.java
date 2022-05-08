package Page;

import data.interfence.AirTicket;
import data.interfence.ReadTXT;
import logic.AirportSystem;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

public class windows12 extends JFrame{
    private int ticketFlag = 0;
    private int luggageFlag = 0;
    private JLabel lblNewLabel3 = new JLabel("------------------------------------------------------------------------------------");
    private JLabel jLabel4 = new JLabel("The ticket you want to print：");
    private JLabel jLabel5 = new JLabel();
    private JLabel jLabel6 = new JLabel();
    private JPanel contentPane;

    public static void main(String[] args){
        new windows12();
    }

    public windows12() {

        contentPane = new JPanel();

        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        this.setContentPane(contentPane);
        contentPane.setLayout(null);
        JPanel jPanel1 = new JPanel();
        jPanel1.setLayout(null);
        jPanel1.setPreferredSize(new Dimension(800,2000));
        JTextField textField = new JTextField();
        JLabel jLabel1 = new JLabel("Ticket information");
        jLabel1.setBounds(400,-40,800,200);
        jLabel1.setFont(new Font("微软雅黑", Font.BOLD, 50));
        this.add(jLabel1);
        JScrollPane scrollPane1 = new JScrollPane(
                ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER

        );
        scrollPane1.setViewportView(jPanel1);
        scrollPane1.setBounds(5,100,1170,350);
        scrollPane1.getVerticalScrollBar().setUnitIncrement(20);
        for (int i=0;i<ReadTXT.tickets.size();i++) {
            AirTicket ticket=ReadTXT.tickets.get(i);

            if (!ticket.getSeat().equals("")) {
//                JLabel jLabel2 = new JLabel("Print");
//                jLabel2.setBounds(390, 57 + 70 * i, 100, 100);
//                jLabel2.setFont(new Font("微软雅黑", Font.BOLD, 15));
//                this.add(jLabel2);

                JCheckBox jCheckBox1 = new JCheckBox("Ticket");
                JCheckBox jCheckBox2 = new JCheckBox("Luggage");
                jCheckBox1.setBounds(860, 90 + 140 * i, 150, 40);
                jCheckBox1.setFont(new Font("微软雅黑", Font.BOLD, 25));
                jCheckBox2.setBounds(1020, 90 + 140 * i, 150, 40);
                jCheckBox2.setFont(new Font("微软雅黑", Font.BOLD, 25));

                jPanel1.add(jCheckBox1);
                jPanel1.add(jCheckBox2);

                jCheckBox1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if(jCheckBox1.isSelected()) {
                            ticketFlag++;
                            jLabel5.setVisible(true);
                        }
                        else {
                            ticketFlag--;
                            if(ticketFlag == 0)
                                jLabel5.setVisible(false);
                        }
                        jLabel5.setText("There are " + ticketFlag + " tickets.");
                        AirportSystem.totalTicket = ticketFlag + luggageFlag;
                    }
                });
                jCheckBox2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if(jCheckBox2.isSelected()) {
                            luggageFlag++;
                            jLabel6.setVisible(true);
                        }
                        else {
                            luggageFlag--;
                            if(luggageFlag == 0)
                                jLabel6.setVisible(false);
                        }
                        jLabel6.setText("There are " + luggageFlag + " luggage tickets.");
                        AirportSystem.totalTicket = ticketFlag + luggageFlag;
                    }
                });
            }
            SimpleDateFormat format = new SimpleDateFormat("HH:mm MM-dd");
            JButton jButton1 = new JButton("Detail information");
            jButton1.setBounds(860, 50+140*i, 280, 40);
            jButton1.setFont(new Font("微软雅黑", Font.BOLD, 25));
            jPanel1.add(jButton1);
            // set the header of the table
            String[] header = {"Flight No", "Origin", "Destination", "ETD", "TOA", "Seat"};
            // set the data of the table
            Object[][] data = {{ticket.getFlightno(), ticket.getBeginplace(), ticket.getEndplace(), format.format(ticket.getBegintime()), format.format(ticket.getEndtime()), ticket.getSeat()}};

            // create a table model
            DefaultTableModel model = new DefaultTableModel(data, header);
            // create a JTable object
            JTable table = new JTable(model);
            table.setRowHeight(57);
            // set the style of the table
            table.setGridColor(Color.BLACK);
            table.setEnabled(false);
            table.getColumnModel().getColumn(0).setPreferredWidth(200);
            table.getColumnModel().getColumn(1).setPreferredWidth(120);
            table.getColumnModel().getColumn(2).setPreferredWidth(120);
            table.getColumnModel().getColumn(3).setPreferredWidth(130);
            table.getColumnModel().getColumn(4).setPreferredWidth(130);
            table.getColumnModel().getColumn(5).setPreferredWidth(100);
            table.setFont(new Font("微软雅黑", Font.BOLD, 20));
            DefaultTableCellRenderer r   = new DefaultTableCellRenderer();
            r.setHorizontalAlignment(JLabel.CENTER);
            table.setDefaultRenderer(Object.class,r);

            // must do:bind a JTable object to a JScrollPane object, otherwise the header of the table will not be displayed in the JPanel.
            JScrollPane jScrollPane = new JScrollPane();
            // key, crucial!
            jScrollPane.setViewportView(table);
            // set the position of the JScrollPane object
            jScrollPane.setBounds(40, 35+140*i, 800, 80);
            // add the JScrollPane object to JPanel
            jPanel1.add(jScrollPane);
            jButton1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    ReadTXT.ticket = ticket;
                    AirportSystem.toPage(2);
                    AirportSystem.refreshPage();
                }
            });
        }

        lblNewLabel3.setBounds(0,360,10000,200);
        lblNewLabel3.setFont(new Font("微软雅黑", Font.BOLD, 40));
        this.add(lblNewLabel3);

        jLabel4.setBounds(40,400,500,200);
        jLabel4.setFont(new Font("微软雅黑", Font.BOLD, 30));
        this.add(jLabel4);

        jLabel5.setBounds(350,480,500,200);
        jLabel5.setFont(new Font("微软雅黑", Font.BOLD, 30));
        jLabel5.setVisible(false);
        this.add(jLabel5);

        jLabel6.setBounds(350,530,500,200);
        jLabel6.setFont(new Font("微软雅黑", Font.BOLD, 30));
        jLabel5.setVisible(false);
        this.add(jLabel6);


        JButton jButton5 = new JButton("Print");
        jButton5.setBounds(700,650,160,70);
        JButton jButton4 = new JButton("Exit");
        jButton4.setBounds(900,650,160,70);
        jButton4.setFont(new Font("微软雅黑", Font.BOLD, 25));
        jButton5.setFont(new Font("微软雅黑", Font.BOLD, 25));
        this.add(jButton5);
        this.add(jButton4);

        jButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(AirportSystem.totalTicket == 0){
                    JOptionPane.showMessageDialog(null, "You didn't choose ticket to print.", "Warning", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    AirportSystem.refreshPage();
                    AirportSystem.toPage(11);
                }
            }
        });
        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AirportSystem.toPage(1);
            }
        });
        this.add(scrollPane1);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(200, 200, 1200, 800);
        this.setLocationRelativeTo(null);
//        this.setVisible(true);
        this.setResizable(false);
    }

}



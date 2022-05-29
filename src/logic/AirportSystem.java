package logic;

import Page.*;

import javax.swing.*;
import java.util.ArrayList;

/**
 * @author ：li&shao
 * @date ：Created in 2022/3/27 15:15
 * @description：This class is used 2 jump to other page.
 * @version: $
 */
public class AirportSystem {
    private static ArrayList<JFrame> frame = new ArrayList<JFrame>();

    public static void main(String[] args) {
        frame.add(new Welcome());
        frame.add(new Information());
        frame.add(new CheckByID());
        frame.add(new SelectSeat());
        frame.add(new OtherService());
        frame.add(new Detail());
        frame.add(new SelectPay());
        frame.add(new PayWechat());
        frame.add(new PayCard());
        frame.add(new PrintSuc());
        frame.add(new Contactus());
        frame.add(new MainPage());
        frame.add(new CheckByBooking());
        frame.add(new CheckIn());
        frame.add(new PrintPreview());
        toPage(1);
    }

    public static void toPage(int num) {
        for(int i = 0; i < frame.size(); i++) frame.get(i).setVisible(i == (num-1));
    }

    public static void refreshtoPage(int num){
        switch(num-1) {
            case 0: frame.set(0, new Welcome());break;
            case 1: frame.set(1, new Information());break;
            case 2: frame.set(2, new CheckByID());break;
            case 3: frame.set(3, new SelectSeat());break;
            case 4: frame.set(4, new OtherService());break;
            case 5: frame.set(5, new Detail());break;
            case 6: frame.set(6, new SelectPay());break;
            case 7: frame.set(7, new PayWechat());break;
            case 8: frame.set(8, new PayCard());break;
            case 9: frame.set(9, new PrintSuc());break;
            case 10: frame.set(10, new Contactus());break;
            case 11: frame.set(11, new MainPage());break;
            case 12: frame.set(12, new CheckByBooking());break;
            case 13: frame.set(13, new CheckIn());break;
            case 14: frame.set(14, new PrintPreview());break;
        }
        toPage(num);
    }
}

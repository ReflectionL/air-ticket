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
    public static ArrayList<JFrame> frame = new ArrayList<JFrame>();
    public static windows2 win2 = new windows2();
    public static windows12 win12 = new windows12();
    public static void main(String[] args) {
        frame.add(new windows1());
        frame.add(new windows2());
        frame.add(new windows3_1());
        frame.add(new windows4());
        frame.add(new windows5());
        frame.add(new windows6());
        frame.add(new windows7());
        frame.add(new windows8());
        frame.add(new windows9());
        frame.add(new windows10());
        frame.add(new windows11());
        frame.add(new windows12());
        toPage(1);
    }
    public static void toPage(int num) {
        num--;
        for(int i = 0; i < frame.size(); i++) {
            if(i != num) {
                if(i == 11){
                    win12.setVisible(false);
                }
                else if(i == 1){
                    win2.setVisible(false);
                }
                frame.get(i).setVisible(false);
            }
            else {
                if(num == 11){
                    win12 = new windows12();
                }
                else if(num == 1){
                    win2 = new windows2();
                }
                else{
                    frame.get(i).setVisible(true);
                }
            }
        }
    }
    public static void refreshPage() {
        frame.set(3, new windows4());
    }
}

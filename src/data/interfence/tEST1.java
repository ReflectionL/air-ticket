package data.interfence;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/** Build a keyboard interface, realize the use of keyboard control input,
 * the main panel of the computer keyboard main body contains twenty-six letters
 * and poetry numbers and other relevant characters.
 */

public class tEST1 extends JPanel implements ActionListener{
    JTextField text  ;
    Robot robot;
    int[] line1 = {192,49,50,51,52,53,54,55,56,57,48,45,61,8};
    int[] line2 = {81,87,69,82,84,89,85,73,79,80,91,93,92};
    int[] line3 = {KeyEvent.VK_CAPS_LOCK,65,83,68,70,71,72,74,75,76,59,222,10};
    int[] line4 = {16,90,88,67,86,66,78,77,44,46,47,38};
    int[] line5 = {17,18,32,18,17,37,40,39};
    Map<Integer, String> uncharMap = new HashMap<Integer, String>();
    public tEST1() {

        try {
            robot = new Robot();
        } catch (AWTException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        this.setLayout(null);
        int x = 20,y = 20 ,width = 60 , height = 40;
        initUnChar();

        int[][] keyint = new int[5][];
        keyint[0] = line1;
        keyint[1] = line2;
        keyint[2] = line3;
        keyint[3] = line4;
        keyint[4] = line5;
        y = y + height + 0;//height=40;
        int startx = 80,cellspace = 7;
        loadKeys(line1,startx,cellspace,x, y, width, height);
        y = y + height + 20;
        int[] tmpInt = new int[]{line2[0]};
        loadKeys(tmpInt,80,cellspace, x, y, width + width /2 , height);
        startx = x + width + width / 2 - cellspace * 2 + 80;
        tmpInt = new int[line2.length - 1];
        System.arraycopy(line2, 1, tmpInt, 0, tmpInt.length);
        loadKeys(tmpInt,startx ,cellspace, x, y, width, height);

        y = y + height + 20;
        tmpInt = new int[]{line3[0]};
        loadKeys(tmpInt,80,cellspace, x, y, width * 2 , height);
        startx = x + width * 2 - cellspace * 2 + 80;
        tmpInt = new int[line3.length - 1];
        System.arraycopy(line3, 1, tmpInt, 0, tmpInt.length);
        loadKeys(tmpInt,startx,cellspace, x, y, width, height);

        y = y + height + 20;
        tmpInt = new int[]{line4[0]};
        loadKeys(tmpInt,80,cellspace, x, y, width * 2 + width / 2 , height);
        startx = x + width * 2 + width / 2 - cellspace * 2 + 80;
        tmpInt = new int[line4.length - 1];
        System.arraycopy(line4, 1, tmpInt, 0, tmpInt.length);
        loadKeys(tmpInt,startx,cellspace, x, y, width, height);

    }
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1024, 800);
        tEST1 kb = new tEST1();
        frame.add(kb);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        MyJButton jb = (MyJButton)e.getSource();
        int key = jb.getValue();
        robot.keyPress(key);
        robot.keyRelease(key);
    }
    public void initUnChar(){
        uncharMap.put(192, "`");
        uncharMap.put(8, "back");
        uncharMap.put(222, "'");
        uncharMap.put(KeyEvent.VK_CAPS_LOCK, "capslock");
        uncharMap.put(10, "ok");
        uncharMap.put(16, "SHIFT");
        uncharMap.put(17, "CTRL");
        uncharMap.put(17, "ALT");
        uncharMap.put(38, "↑");
        uncharMap.put(37, "←");
        uncharMap.put(39, "→");
        uncharMap.put(40, "↓");
    }
    class MyJButton extends JButton{
        int value;
        public MyJButton(String showStr) {
            super(showStr);
        }
        public void setValue(int value) {
            this.value = value;
        }
        public int getValue() {
            return value;
        }
    }

    public void loadKeys(int[] line,int startx,int cell,int x,int y ,int width,int height){

        for(int j = 0;j < line.length; j++){
            String showStr = uncharMap.get(line[j]);
            if(showStr == null){
                showStr = String.valueOf((char) line[j]);
            }
            MyJButton jb = new MyJButton(showStr);
            jb.setBounds(startx + x + (cell + width) * j  , y, width, height);
            jb.setFocusable(false);
            jb.setValue(line[j]);
            jb.addActionListener(this);
            this.add(jb);
        }
    }
}
